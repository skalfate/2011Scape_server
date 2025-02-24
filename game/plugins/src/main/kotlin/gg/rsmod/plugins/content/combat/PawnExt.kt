package gg.rsmod.plugins.content.combat

import gg.rsmod.game.model.Tile
import gg.rsmod.game.model.attr.COMBAT_TARGET_FOCUS_ATTR
import gg.rsmod.game.model.attr.LAST_HIT_ATTR
import gg.rsmod.game.model.combat.CombatClass
import gg.rsmod.game.model.combat.PawnHit
import gg.rsmod.game.model.entity.Npc
import gg.rsmod.game.model.entity.Pawn
import gg.rsmod.game.model.entity.Projectile
import gg.rsmod.game.model.queue.QueueTask
import gg.rsmod.game.model.timer.ACTIVE_COMBAT_TIMER
import gg.rsmod.plugins.api.HitType
import gg.rsmod.plugins.api.ProjectileType
import gg.rsmod.plugins.api.ext.hit
import gg.rsmod.plugins.content.combat.CombatConfigs.getCombatClass
import gg.rsmod.plugins.content.combat.formula.CombatFormula
import kotlin.random.Random

/**
 * @author Tom <rspsmods@gmail.com>
 */

fun Pawn.isAttacking(): Boolean = attr[COMBAT_TARGET_FOCUS_ATTR]?.get() != null

fun Pawn.isBeingAttacked(): Boolean = timers.has(ACTIVE_COMBAT_TIMER)

fun Pawn.getCombatTarget(): Pawn? = attr[COMBAT_TARGET_FOCUS_ATTR]?.get()

fun Pawn.getLastHitBy(): Pawn? = attr[LAST_HIT_ATTR]?.get()

fun Pawn.removeCombatTarget() = attr.remove(COMBAT_TARGET_FOCUS_ATTR)

fun Pawn.canEngageCombat(target: Pawn): Boolean = Combat.canEngage(this, target)

fun Pawn.canAttack(target: Pawn, combatClass: CombatClass): Boolean = Combat.canAttack(this, target, combatClass)

fun Pawn.isAttackDelayReady(): Boolean = Combat.isAttackDelayReady(this)

fun Pawn.combatRaycast(target: Pawn, distance: Int, projectile: Boolean): Boolean = Combat.raycast(this, target, distance, projectile)


suspend fun Pawn.canAttackMelee(it: QueueTask, target: Pawn, moveIfNeeded: Boolean): Boolean =
        Combat.areBordering(tile.x, tile.z, getSize(), getSize(), target.tile.x, target.tile.z, target.getSize(), target.getSize())
                || moveIfNeeded && moveToAttackRange(it, target, distance = 0, projectile = false)

fun Pawn.dealHit(target: Pawn, formula: CombatFormula, delay: Int, onHit: (PawnHit) -> Unit = {}): PawnHit {
    val accuracy = formula.getAccuracy(this, target)
    val maxHit = formula.getMaxHit(this, target)
    val landHit = accuracy >= world.randomDouble()
    return dealHit(target, maxHit, landHit, delay, onHit, HitType.REGULAR_HIT)
}

/**
 * Sends the dealHit method while allowing the setting of [HitType]
 * @author Kevin Senez <ksenez94@gmail.com>
 */
fun Pawn.dealHit(target: Pawn, formula: CombatFormula, delay: Int, type: HitType, onHit: (PawnHit) -> Unit = {}): PawnHit {
    val accuracy = formula.getAccuracy(this, target)
    val maxHit = formula.getMaxHit(this, target)
    val landHit = accuracy >= world.randomDouble()
    return dealHit(target, maxHit, landHit, delay, onHit, type)
}

fun Pawn.dealHit(
    target: Pawn,
    maxHit: Double,
    landHit: Boolean,
    delay: Int,
    onHit: (PawnHit) -> Unit = {},
    hitType: HitType
): PawnHit {
    val damage = if(landHit) (Random.nextDouble(from = 0.1, until = maxHit) * 10) else 0.0
    var type = hitType.id

    // handles critical hit markers
    if(damage >= ((maxHit * 10) * 0.90) && target is Npc) {
       type += 10
    }

    val hit = if(landHit) {
        target.hit(damage = damage.toInt(), type = type, delay = delay)
    } else {
        target.hit(damage = 0, type = HitType.BLOCK, delay = delay)
    }

    val pawnHit = PawnHit(hit, landHit)

    hit.setCancelIf { isDead() }
    hit.addAction {
        val pawn = this@dealHit
        if(getCombatClass(pawn) != CombatClass.MELEE) {
            val blockAnimation = CombatConfigs.getBlockAnimation(target)
            target.animate(blockAnimation, priority = false)
        }
    }
    hit.addAction { onHit(pawnHit) }
    hit.addAction {
        val pawn = this@dealHit
        Combat.postDamage(pawn, target)
    }
    if (landHit) {
        hit.addAction {
            val pawn = this@dealHit
            target.damageMap.add(pawn, hit.hitmarks.sumOf { it.damage })
        }
    }
    return pawnHit
}

suspend fun Pawn.moveToAttackRange(it: QueueTask, target: Pawn, distance: Int, projectile: Boolean): Boolean = Combat.moveToAttackRange(it, this, target, distance, projectile)

fun Pawn.postAttackLogic(target: Pawn) = Combat.postAttack(this, target)

fun Pawn.createProjectile(srcTile: Tile, target: Tile, gfx: Int, type: ProjectileType, endHeight: Int = -1): Projectile {
    val builder = Projectile.Builder()
        .setTiles(start = srcTile, target = target)
        .setGfx(gfx = gfx)
        .setHeights(startHeight = type.startHeight, endHeight = if (endHeight != -1) endHeight else type.endHeight)
        .setSlope(angle = type.angle, steepness = type.steepness)
        .setTimes(delay = type.delay, lifespan = type.delay + Combat.getProjectileLifespan(this, target, type))

    return builder.build()
}

fun Pawn.createProjectile(target: Tile, gfx: Int, type: ProjectileType, endHeight: Int = -1): Projectile {
    val builder = Projectile.Builder()
            .setTiles(start = tile, target = target)
            .setGfx(gfx = gfx)
            .setHeights(startHeight = type.startHeight, endHeight = if (endHeight != -1) endHeight else type.endHeight)
            .setSlope(angle = type.angle, steepness = type.steepness)
            .setTimes(delay = type.delay, lifespan = type.delay + Combat.getProjectileLifespan(this, target, type))

    return builder.build()
}

fun Pawn.createProjectile(target: Pawn, gfx: Int, type: ProjectileType, endHeight: Int = -1): Projectile {
    val builder = Projectile.Builder()
            .setTiles(start = tile, target = target)
            .setGfx(gfx = gfx)
            .setHeights(startHeight = type.startHeight, endHeight = if (endHeight != -1) endHeight else type.endHeight)
            .setSlope(angle = type.angle, steepness = type.steepness)
            .setTimes(delay = type.delay, lifespan = type.delay + Combat.getProjectileLifespan(this, target.tile, type))

    return builder.build()
}

fun Pawn.createProjectile(target: Tile, gfx: Int, startHeight: Int,endHeight: Int = -1, angle: Int, steepness: Int, delay: Int, lifespan: Int): Projectile {
    val builder = Projectile.Builder()
        .setTiles(start = tile, target = target)
        .setGfx(gfx = gfx)
        .setHeights(startHeight =startHeight, endHeight = if (endHeight != -1) endHeight else endHeight)
        .setSlope(angle = angle, steepness = steepness)
        .setTimes(delay = delay, lifespan = lifespan)
    return builder.build()
}