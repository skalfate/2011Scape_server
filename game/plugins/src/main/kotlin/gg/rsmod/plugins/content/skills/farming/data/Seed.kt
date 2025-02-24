package gg.rsmod.plugins.content.skills.farming.data

import gg.rsmod.game.fs.def.ItemDef
import gg.rsmod.game.model.World
import gg.rsmod.game.model.item.Item
import gg.rsmod.plugins.api.cfg.Items
import gg.rsmod.plugins.content.skills.farming.data.blocks.SeedGrowth
import gg.rsmod.plugins.content.skills.farming.data.blocks.SeedHarvest
import gg.rsmod.plugins.content.skills.farming.data.blocks.SeedPlant

/**
 * Data on all the seeds
 */
enum class Seed(
        val seedId: Int,
        val produce: Item,
        val seedType: SeedType,
        val plant: SeedPlant,
        val growth: SeedGrowth,
        val harvest: SeedHarvest,
) {
    /**
     * Herbs
     */
    Guam(
            seedId = Items.GUAM_SEED, produce = Item(Items.GRIMY_GUAM), seedType = SeedType.Herb,
            SeedPlant(level = 9, plantXp = 11.0, plantedVarbit = 4, baseLives = 3),
            SeedGrowth(growthStages = 4, canDisease = true, diseaseSlots = 27, protectionPayment = null, waterVarbit = null, diseaseVarbit = 127, diedVarbit = 169),
            SeedHarvest(harvestXp = 12.5, minLiveSaveBaseSlots = 24, maxLiveSaveBaseSlots = 80, harvestOption = "pick")
    ),
    Marrentill(
            seedId = Items.MARRENTILL_SEED, produce = Item(Items.GRIMY_MARRENTILL), seedType = SeedType.Herb,
            SeedPlant(level = 14, plantXp = 13.5, plantedVarbit = 11, baseLives = 3),
            SeedGrowth(growthStages = 4, canDisease = true, diseaseSlots = 27, protectionPayment = null, waterVarbit = null, diseaseVarbit = 130, diedVarbit = 169),
            SeedHarvest(harvestXp = 15.0, minLiveSaveBaseSlots = 28, maxLiveSaveBaseSlots = 80, harvestOption = "pick")
    ),
    Tarromin(
            seedId = Items.TARROMIN_SEED, produce = Item(Items.GRIMY_TARROMIN), seedType = SeedType.Herb,
            SeedPlant(level = 19, plantXp = 16.0, plantedVarbit = 18, baseLives = 3),
            SeedGrowth(growthStages = 4, canDisease = true, diseaseSlots = 27, protectionPayment = null, waterVarbit = null, diseaseVarbit = 133, diedVarbit = 169),
            SeedHarvest(harvestXp = 18.0, minLiveSaveBaseSlots = 31, maxLiveSaveBaseSlots = 80, harvestOption = "pick")
    ),
    Harralander(
            seedId = Items.HARRALANDER_SEED, produce = Item(Items.GRIMY_HARRALANDER), seedType = SeedType.Herb,
            SeedPlant(level = 26, plantXp = 21.5, plantedVarbit = 25, baseLives = 3),
            SeedGrowth(growthStages = 4, canDisease = true, diseaseSlots = 27, protectionPayment = null, waterVarbit = null, diseaseVarbit = 136, diedVarbit = 169),
            SeedHarvest(harvestXp = 24.0, minLiveSaveBaseSlots = 36, maxLiveSaveBaseSlots = 80, harvestOption = "pick")
    ),
    Ranarr(
            seedId = Items.RANARR_SEED, produce = Item(Items.GRIMY_RANARR), seedType = SeedType.Herb,
            SeedPlant(level = 32, plantXp = 27.0, plantedVarbit = 32, baseLives = 3),
            SeedGrowth(growthStages = 4, canDisease = true, diseaseSlots = 27, protectionPayment = null, waterVarbit = null, diseaseVarbit = 139, diedVarbit = 169),
            SeedHarvest(harvestXp = 30.5, minLiveSaveBaseSlots = 39, maxLiveSaveBaseSlots = 80, harvestOption = "pick")
    ),
    SpiritWeed(
            seedId = Items.SPIRIT_WEED_SEED, produce = Item(Items.GRIMY_SPIRIT_WEED), seedType = SeedType.Herb,
            SeedPlant(level = 36, plantXp = 32.0, plantedVarbit = 204, baseLives = 3),
            SeedGrowth(growthStages = 4, canDisease = true, diseaseSlots = 27, protectionPayment = null, waterVarbit = null, diseaseVarbit = 210, diedVarbit = 169),
            SeedHarvest(harvestXp = 36.0, minLiveSaveBaseSlots = 43, maxLiveSaveBaseSlots = 80, harvestOption = "pick")
    ),
    Toadflax(
            seedId = Items.TOADFLAX_SEED, produce = Item(Items.GRIMY_TOADFLAX), seedType = SeedType.Herb,
            SeedPlant(level = 38, plantXp = 34.0, plantedVarbit = 39, baseLives = 3),
            SeedGrowth(growthStages = 4, canDisease = true, diseaseSlots = 27, protectionPayment = null, waterVarbit = null, diseaseVarbit = 142, diedVarbit = 169),
            SeedHarvest(harvestXp = 38.5, minLiveSaveBaseSlots = 43, maxLiveSaveBaseSlots = 80, harvestOption = "pick")
    ),
    Irit(
            seedId = Items.IRIT_SEED, produce = Item(Items.GRIMY_IRIT), seedType = SeedType.Herb,
            SeedPlant(level = 44, plantXp = 43.0, plantedVarbit = 46, baseLives = 3),
            SeedGrowth(growthStages = 4, canDisease = true, diseaseSlots = 27, protectionPayment = null, waterVarbit = null, diseaseVarbit = 145, diedVarbit = 169),
            SeedHarvest(harvestXp = 48.5, minLiveSaveBaseSlots = 46, maxLiveSaveBaseSlots = 80, harvestOption = "pick")
    ),
    Avantoe(
            seedId = Items.AVANTOE_SEED, produce = Item(Items.GRIMY_AVANTOE), seedType = SeedType.Herb,
            SeedPlant(level = 50, plantXp = 54.5, plantedVarbit = 53, baseLives = 3),
            SeedGrowth(growthStages = 4, canDisease = true, diseaseSlots = 27, protectionPayment = null, waterVarbit = null, diseaseVarbit = 148, diedVarbit = 169),
            SeedHarvest(harvestXp = 61.5, minLiveSaveBaseSlots = 50, maxLiveSaveBaseSlots = 80, harvestOption = "pick")
    ),
    Kwuarm(
            seedId = Items.KWUARM_SEED, produce = Item(Items.GRIMY_KWUARM), seedType = SeedType.Herb,
            SeedPlant(level = 56, plantXp = 69.0, plantedVarbit = 68, baseLives = 3),
            SeedGrowth(growthStages = 4, canDisease = true, diseaseSlots = 27, protectionPayment = null, waterVarbit = null, diseaseVarbit = 151, diedVarbit = 169),
            SeedHarvest(harvestXp = 78.0, minLiveSaveBaseSlots = 54, maxLiveSaveBaseSlots = 80, harvestOption = "pick")
    ),
    Snapdragon(
            seedId = Items.SNAPDRAGON_SEED, produce = Item(Items.GRIMY_SNAPDRAGON), seedType = SeedType.Herb,
            SeedPlant(level = 62, plantXp = 87.5, plantedVarbit = 75, baseLives = 3),
            SeedGrowth(growthStages = 4, canDisease = true, diseaseSlots = 27, protectionPayment = null, waterVarbit = null, diseaseVarbit = 154, diedVarbit = 169),
            SeedHarvest(harvestXp = 98.5, minLiveSaveBaseSlots = 57, maxLiveSaveBaseSlots = 80, harvestOption = "pick")
    ),
    Cadantine(
            seedId = Items.CADANTINE_SEED, produce = Item(Items.GRIMY_CADANTINE), seedType = SeedType.Herb,
            SeedPlant(level = 67, plantXp = 106.5, plantedVarbit = 82, baseLives = 3),
            SeedGrowth(growthStages = 4, canDisease = true, diseaseSlots = 27, protectionPayment = null, waterVarbit = null, diseaseVarbit = 157, diedVarbit = 169),
            SeedHarvest(harvestXp = 120.0, minLiveSaveBaseSlots = 60, maxLiveSaveBaseSlots = 80, harvestOption = "pick")
    ),
    Lantadyme(
            seedId = Items.LANTADYME_SEED, produce = Item(Items.GRIMY_LANTADYME), seedType = SeedType.Herb,
            SeedPlant(level = 73, plantXp = 135.5, plantedVarbit = 89, baseLives = 3),
            SeedGrowth(growthStages = 4, canDisease = true, diseaseSlots = 27, protectionPayment = null, waterVarbit = null, diseaseVarbit = 160, diedVarbit = 169),
            SeedHarvest(harvestXp = 151.5, minLiveSaveBaseSlots = 64, maxLiveSaveBaseSlots = 80, harvestOption = "pick")
    ),
    DwarfWeed(
            seedId = Items.DWARF_WEED_SEED, produce = Item(Items.GRIMY_DWARF_WEED), seedType = SeedType.Herb,
            SeedPlant(level = 79, plantXp = 170.5, plantedVarbit = 96, baseLives = 3),
            SeedGrowth(growthStages = 4, canDisease = true, diseaseSlots = 27, protectionPayment = null, waterVarbit = null, diseaseVarbit = 163, diedVarbit = 169),
            SeedHarvest(harvestXp = 192.0, minLiveSaveBaseSlots = 67, maxLiveSaveBaseSlots = 80, harvestOption = "pick")
    ),
    Torstol(
            seedId = Items.TORSTOL_SEED, produce = Item(Items.GRIMY_TORSTOL), seedType = SeedType.Herb,
            SeedPlant(level = 85, plantXp = 199.5, plantedVarbit = 103, baseLives = 3),
            SeedGrowth(growthStages = 4, canDisease = true, diseaseSlots = 27, protectionPayment = null, waterVarbit = null, diseaseVarbit = 166, diedVarbit = 169),
            SeedHarvest(harvestXp = 224.5, minLiveSaveBaseSlots = 71, maxLiveSaveBaseSlots = 80, harvestOption = "pick")
    ),

    /**
     * Flowers
     */
    Marigold(
            seedId = Items.MARIGOLD_SEED, produce = Item(Items.MARIGOLDS), seedType = SeedType.Flower,
            SeedPlant(level = 2, plantXp = 8.5, plantedVarbit = 8, baseLives = 1),
            SeedGrowth(growthStages = 4, canDisease = true, diseaseSlots = 30, protectionPayment = null, waterVarbit = 72, diseaseVarbit = 136, diedVarbit = 200),
            SeedHarvest(harvestXp = 47.0, minLiveSaveBaseSlots = -1, maxLiveSaveBaseSlots = -1, harvestOption = "pick")
    ),
    Rosemary(
            seedId = Items.ROSEMARY_SEED, produce = Item(Items.ROSEMARY), seedType = SeedType.Flower,
            SeedPlant(level = 11, plantXp = 12.0, plantedVarbit = 13, baseLives = 1),
            SeedGrowth(growthStages = 4, canDisease = true, diseaseSlots = 25, protectionPayment = null, waterVarbit = 77, diseaseVarbit = 141, diedVarbit = 205),
            SeedHarvest(harvestXp = 66.5, minLiveSaveBaseSlots = -1, maxLiveSaveBaseSlots = -1, harvestOption = "pick")
    ),
    Nasturtium(
            seedId = Items.NASTURTIUM_SEED, produce = Item(Items.NASTURTIUMS), seedType = SeedType.Flower,
            SeedPlant(level = 24, plantXp = 19.5, plantedVarbit = 18, baseLives = 1),
            SeedGrowth(growthStages = 4, canDisease = true, diseaseSlots = 20, protectionPayment = null, waterVarbit = 82, diseaseVarbit = 146, diedVarbit = 210),
            SeedHarvest(harvestXp = 111.0, minLiveSaveBaseSlots = -1, maxLiveSaveBaseSlots = -1, harvestOption = "pick")
    ),
    WoadSeed(
            seedId = Items.WOAD_SEED, produce = Item(Items.WOAD_LEAF, amount = 3), seedType = SeedType.Flower,
            SeedPlant(level = 25, plantXp = 20.5, plantedVarbit = 23, baseLives = 1),
            SeedGrowth(growthStages = 4, canDisease = true, diseaseSlots = 15, protectionPayment = null, waterVarbit = 87, diseaseVarbit = 151, diedVarbit = 215),
            SeedHarvest(harvestXp = 115.5, minLiveSaveBaseSlots = -1, maxLiveSaveBaseSlots = -1, harvestOption = "pick")
    ),
    Limpwurt(
            seedId = Items.LIMPWURT_SEED, produce = Item(Items.LIMPWURT_ROOT), seedType = SeedType.Flower,
            SeedPlant(level = 26, plantXp = 21.5, plantedVarbit = 28, baseLives = 1),
            SeedGrowth(growthStages = 4, canDisease = true, diseaseSlots = 10, protectionPayment = null, waterVarbit = 92, diseaseVarbit = 156, diedVarbit = 220),
            SeedHarvest(harvestXp = 120.0, minLiveSaveBaseSlots = -1, maxLiveSaveBaseSlots = -1, harvestOption = "pick")
    ),
    Scarecrow(
            seedId = Items.SCARECROW, produce = Item(Items.SCARECROW), seedType = SeedType.Flower,
            SeedPlant(level = 1, plantXp = 0.0, plantedVarbit = 36, baseLives = 1),
            SeedGrowth(growthStages = 0, canDisease = false, diseaseSlots = -1, protectionPayment = null, waterVarbit = 33, diseaseVarbit = 33, diedVarbit = 33),
            SeedHarvest(harvestXp = 0.0, minLiveSaveBaseSlots = -1, maxLiveSaveBaseSlots = -1, harvestOption = "pick")
    ),
//    WhiteLily(
//            seedId = Items.WHITE_LILY_SEED, produce = Item(Items.WHITE_LILY), seedType = SeedType.Flower,
//            SeedPlant(level = 58, plantXp = 42.0, plantedVarbit = 37, baseLives = 1),
//            SeedGrowth(growthStages = 4, canDisease = true, diseaseSlots = 5, protectionPayment = null, waterVarbit = null, diseaseVarbit = 136, diedVarbit = 200),
//            SeedHarvest(250.0, -1, -1)
//    ), // TODO: can't find the varbits for diseased/died/watered

    /**
     * Allotment
     */
    Potato(
            seedId = Items.POTATO_SEED, produce = Item(Items.POTATO), seedType = SeedType.Allotment,
            SeedPlant(level = 1, plantXp = 8.0, plantedVarbit = 6, baseLives = 3),
            SeedGrowth(growthStages = 4, canDisease = true, diseaseSlots = 30, protectionPayment = Item(Items.COMPOST, amount = 2), waterVarbit = 70, diseaseVarbit = 134, diedVarbit = 198),
            SeedHarvest(harvestXp = 9.0, minLiveSaveBaseSlots = 130, maxLiveSaveBaseSlots = 200, harvestOption = "harvest")
    ),
    Onion(
            seedId = Items.ONION_SEED, produce = Item(Items.ONION), seedType = SeedType.Allotment,
            SeedPlant(level = 5, plantXp = 9.5, plantedVarbit = 13, baseLives = 3),
            SeedGrowth(growthStages = 4, canDisease = true, diseaseSlots = 30, protectionPayment = Item(Items.POTATOES_10), waterVarbit = 78, diseaseVarbit = 141, diedVarbit = 205),
            SeedHarvest(harvestXp = 10.5, minLiveSaveBaseSlots = 130, maxLiveSaveBaseSlots = 200, harvestOption = "harvest")
    ),
    Cabbage(
            seedId = Items.CABBAGE_SEED, produce = Item(Items.CABBAGE), seedType = SeedType.Allotment,
            SeedPlant(level = 7, plantXp = 10.0, plantedVarbit = 20, baseLives = 3),
            SeedGrowth(growthStages = 4, canDisease = true, diseaseSlots = 30, protectionPayment = Item(Items.ONIONS_10), waterVarbit = 84, diseaseVarbit = 148, diedVarbit = 212),
            SeedHarvest(harvestXp = 11.5, minLiveSaveBaseSlots = 130, maxLiveSaveBaseSlots = 200, harvestOption = "harvest")
    ),
    Tomato(
            seedId = Items.TOMATO_SEED, produce = Item(Items.TOMATO), seedType = SeedType.Allotment,
            SeedPlant(level = 12, plantXp = 12.5, plantedVarbit = 27, baseLives = 3),
            SeedGrowth(growthStages = 4, canDisease = true, diseaseSlots = 30, protectionPayment = Item(Items.CABBAGES_10, amount = 2), waterVarbit = 91, diseaseVarbit = 155, diedVarbit = 219),
            SeedHarvest(harvestXp = 14.0, minLiveSaveBaseSlots = 130, maxLiveSaveBaseSlots = 200, harvestOption = "harvest")
    ),
    Sweetcorn(
            seedId = Items.SWEETCORN_SEED, produce = Item(Items.SWEETCORN), seedType = SeedType.Allotment,
            SeedPlant(level = 20, plantXp = 17.0, plantedVarbit = 34, baseLives = 3),
            SeedGrowth(growthStages = 6, canDisease = true, diseaseSlots = 30, protectionPayment = Item(Items.APPLES_5), waterVarbit = 98, diseaseVarbit = 162, diedVarbit = 226),
            SeedHarvest(harvestXp = 19.0, minLiveSaveBaseSlots = 130, maxLiveSaveBaseSlots = 200, harvestOption = "harvest")
    ),
    Strawberry(
            seedId = Items.STRAWBERRY_SEED, produce = Item(Items.STRAWBERRY), seedType = SeedType.Allotment,
            SeedPlant(level = 31, plantXp = 26.0, plantedVarbit = 43, baseLives = 3),
            SeedGrowth(growthStages = 6, canDisease = true, diseaseSlots = 30, protectionPayment = Item(Items.CURRY_LEAF, amount = 10), waterVarbit = 107, diseaseVarbit = 171, diedVarbit = 235),
            SeedHarvest(harvestXp = 29.0, minLiveSaveBaseSlots = 130, maxLiveSaveBaseSlots = 200, harvestOption = "harvest")
    ),
    Watermelon(
            seedId = Items.WATERMELON_SEED, produce = Item(Items.WATERMELON), seedType = SeedType.Allotment,
            SeedPlant(level = 47, plantXp = 48.5, plantedVarbit = 52, baseLives = 3),
            SeedGrowth(growthStages = 8, canDisease = true, diseaseSlots = 30, protectionPayment = Item(Items.JANGERBERRIES, amount = 5), waterVarbit = 116, diseaseVarbit = 180, diedVarbit = 244),
            SeedHarvest(harvestXp = 54.5, minLiveSaveBaseSlots = 130, maxLiveSaveBaseSlots = 200, harvestOption = "harvest")
    ),

    /**
     * Hops
     */
    Barley(
            seedId = Items.BARLEY_SEED, produce = Item(Items.BARLEY), seedType = SeedType.Hops,
            SeedPlant(level = 3, plantXp = 8.5, plantedVarbit = 49, baseLives = 3),
            SeedGrowth(growthStages = 4, canDisease = true, diseaseSlots = 15, protectionPayment = Item(Items.COMPOST, amount = 3), waterVarbit = 113, diseaseVarbit = 177, diedVarbit = 241),
            SeedHarvest(harvestXp = 9.5, minLiveSaveBaseSlots = 100, maxLiveSaveBaseSlots = 180, harvestOption = "harvest")
    ),
    Hammerstone(
            seedId = Items.HAMMERSTONE_SEED, produce = Item(Items.HAMMERSTONE_HOPS), seedType = SeedType.Hops,
            SeedPlant(level = 4, plantXp = 9.0, plantedVarbit = 4, baseLives = 3),
            SeedGrowth(growthStages = 4, canDisease = true, diseaseSlots = 14, protectionPayment = Item(Items.MARIGOLDS), waterVarbit = 68, diseaseVarbit = 132, diedVarbit = 196),
            SeedHarvest(harvestXp = 10.0, minLiveSaveBaseSlots = 100, maxLiveSaveBaseSlots = 180, harvestOption = "harvest")
    ),
    Asgarnian(
            seedId = Items.ASGARNIAN_SEED, produce = Item(Items.ASGARNIAN_HOPS), seedType = SeedType.Hops,
            SeedPlant(level = 8, plantXp = 10.9, plantedVarbit = 11, baseLives = 3),
            SeedGrowth(growthStages = 5, canDisease = true, diseaseSlots = 13, protectionPayment = Item(Items.ONIONS_10), waterVarbit = 75, diseaseVarbit = 139, diedVarbit = 203),
            SeedHarvest(harvestXp = 12.0, minLiveSaveBaseSlots = 100, maxLiveSaveBaseSlots = 180, harvestOption = "harvest")
    ),
    Jute(
            seedId = Items.JUTE_SEED, produce = Item(Items.JUTE_FIBRE), seedType = SeedType.Hops,
            SeedPlant(level = 13, plantXp = 13.0, plantedVarbit = 56, baseLives = 3),
            SeedGrowth(growthStages = 5, canDisease = true, diseaseSlots = 12, protectionPayment = Item(Items.BARLEY_MALT, amount = 6), waterVarbit = 120, diseaseVarbit = 184, diedVarbit = 248),
            SeedHarvest(harvestXp = 14.5, minLiveSaveBaseSlots = 100, maxLiveSaveBaseSlots = 180, harvestOption = "harvest")
    ),
    Yanillian(
            seedId = Items.YANILLIAN_SEED, produce = Item(Items.YANILLIAN_HOPS), seedType = SeedType.Hops,
            SeedPlant(level = 16, plantXp = 14.5, plantedVarbit = 19, baseLives = 3),
            SeedGrowth(growthStages = 6, canDisease = true, diseaseSlots = 11, protectionPayment = Item(Items.TOMATOES_5), waterVarbit = 83, diseaseVarbit = 147, diedVarbit = 211),
            SeedHarvest(harvestXp = 16.0, minLiveSaveBaseSlots = 100, maxLiveSaveBaseSlots = 180, harvestOption = "harvest")
    ),
    Krandorian(
            seedId = Items.KRANDORIAN_SEED, produce = Item(Items.KRANDORIAN_HOPS), seedType = SeedType.Hops,
            SeedPlant(level = 21, plantXp = 17.5, plantedVarbit = 28, baseLives = 3),
            SeedGrowth(growthStages = 7, canDisease = true, diseaseSlots = 10, protectionPayment = Item(Items.CABBAGES_10, amount = 3), waterVarbit = 92, diseaseVarbit = 156, diedVarbit = 220),
            SeedHarvest(harvestXp = 19.5, minLiveSaveBaseSlots = 100, maxLiveSaveBaseSlots = 180, harvestOption = "harvest")
    ),
    WildBlood(
            seedId = Items.WILDBLOOD_SEED, produce = Item(Items.WILDBLOOD_HOPS), seedType = SeedType.Hops,
            SeedPlant(level = 28, plantXp = 23.0, plantedVarbit = 38, baseLives = 3),
            SeedGrowth(growthStages = 8, canDisease = true, diseaseSlots = 9, protectionPayment = Item(Items.NASTURTIUMS), waterVarbit = 102, diseaseVarbit = 166, diedVarbit = 230),
            SeedHarvest(harvestXp = 26.0, minLiveSaveBaseSlots = 100, maxLiveSaveBaseSlots = 180, harvestOption = "harvest")
    ),

    /**
     * Bush
     */
    Redberry(
            seedId = Items.REDBERRY_SEED, produce = Item(Items.REDBERRIES), seedType = SeedType.Bush,
            SeedPlant(level = 10, plantXp = 11.5, plantedVarbit = 5, baseLives = 4),
            SeedGrowth(growthStages = 5, canDisease = true, diseaseSlots = 15, protectionPayment = Item(Items.CABBAGES_10, amount = 4), waterVarbit = null, diseaseVarbit = 70, diedVarbit = 134),
            SeedHarvest(harvestXp = 4.5, minLiveSaveBaseSlots = -1, maxLiveSaveBaseSlots = -1, healthCheckXp = 64.0, healthCheckVarbit = 250, harvestOption = "pick-from"),
    ),
    Cadavaberry(
            seedId = Items.CADAVABERRY_SEED, produce = Item(Items.CADAVA_BERRIES), seedType = SeedType.Bush,
            SeedPlant(level = 22, plantXp = 18.0, plantedVarbit = 15, baseLives = 4),
            SeedGrowth(growthStages = 6, canDisease = true, diseaseSlots = 15, protectionPayment = Item(Items.TOMATOES_5, amount = 3), waterVarbit = null, diseaseVarbit = 80, diedVarbit = 144),
            SeedHarvest(harvestXp = 7.0, minLiveSaveBaseSlots = -1, maxLiveSaveBaseSlots = -1, healthCheckXp = 102.5, healthCheckVarbit = 251, harvestOption = "pick-from"),
    ),
    Dwellberry(
            seedId = Items.DWELLBERRY_SEED, produce = Item(Items.DWELLBERRIES), seedType = SeedType.Bush,
            SeedPlant(level = 36, plantXp = 31.5, plantedVarbit = 26, baseLives = 4),
            SeedGrowth(growthStages = 7, canDisease = true, diseaseSlots = 15, protectionPayment = Item(Items.STRAWBERRIES_5, amount = 3), waterVarbit = null, diseaseVarbit = 90, diedVarbit = 154),
            SeedHarvest(harvestXp = 12.0, minLiveSaveBaseSlots = -1, maxLiveSaveBaseSlots = -1, healthCheckXp = 177.5, healthCheckVarbit = 252, harvestOption = "pick-from"),
    ),
    Jangerberry(
            seedId = Items.JANGERBERRY_SEED, produce = Item(Items.JANGERBERRIES), seedType = SeedType.Bush,
            SeedPlant(level = 48, plantXp = 50.5, plantedVarbit = 38, baseLives = 4),
            SeedGrowth(growthStages = 8, canDisease = true, diseaseSlots = 15, protectionPayment = Item(Items.WATERMELON, amount = 6), waterVarbit = null, diseaseVarbit = 102, diedVarbit = 166),
            SeedHarvest(harvestXp = 19.0, minLiveSaveBaseSlots = -1, maxLiveSaveBaseSlots = -1, healthCheckXp = 284.5, healthCheckVarbit = 253, harvestOption = "pick-from"),
    ),
    Whiteberry(
            seedId = Items.WHITEBERRY_SEED, produce = Item(Items.WHITE_BERRIES), seedType = SeedType.Bush,
            SeedPlant(level = 59, plantXp = 78.0, plantedVarbit = 51, baseLives = 4),
            SeedGrowth(growthStages = 8, canDisease = true, diseaseSlots = 15, protectionPayment = Item(Items.BITTERCAP_MUSHROOM, amount = 8), waterVarbit = null, diseaseVarbit = 115, diedVarbit = 180),
            SeedHarvest(harvestXp = 29.0, minLiveSaveBaseSlots = -1, maxLiveSaveBaseSlots = -1, healthCheckXp = 437.5, healthCheckVarbit = 254, harvestOption = "pick-from"),
    ),
    PoisonIvy(
            seedId = Items.POISON_IVY_SEED, produce = Item(Items.POISON_IVY_BERRIES), seedType = SeedType.Bush,
            SeedPlant(level = 70, plantXp = 120.0, plantedVarbit = 197, baseLives = 4),
            SeedGrowth(growthStages = 8, canDisease = false, diseaseSlots = -1, protectionPayment = null, waterVarbit = null, diseaseVarbit = 0, diedVarbit = 0),
            SeedHarvest(harvestXp = 45.0, minLiveSaveBaseSlots = -1, maxLiveSaveBaseSlots = -1, healthCheckXp = 675.0, healthCheckVarbit = 255, harvestOption = "pick-from"),
    ),

    /**
     * Fruit trees
     */
    Apple(
            seedId = Items.APPLE_SAPLING, produce = Item(Items.COOKING_APPLE), seedType = SeedType.FruitTree,
            SeedPlant(level = 27, plantXp = 22.0, plantedVarbit = 8, baseLives = 6),
            SeedGrowth(growthStages = 6, canDisease = true, diseaseSlots = 18, protectionPayment = Item(Items.SWEETCORN, amount = 9), waterVarbit = null, diseaseVarbit = 20, diedVarbit = 27),
            SeedHarvest(harvestXp = 8.5, minLiveSaveBaseSlots = -1, maxLiveSaveBaseSlots = -1, healthCheckXp = 1199.5, healthCheckVarbit = 34, choppedDownVarbit = 33, harvestOption = "pick-apple"),
    ),
    Banana(
            seedId = Items.BANANA_SAPLING, produce = Item(Items.BANANA), seedType = SeedType.FruitTree,
            SeedPlant(level = 33, plantXp = 28.0, plantedVarbit = 35, baseLives = 6),
            SeedGrowth(growthStages = 6, canDisease = true, diseaseSlots = 18, protectionPayment = Item(Items.APPLES_5, amount = 4), waterVarbit = null, diseaseVarbit = 47, diedVarbit = 53),
            SeedHarvest(harvestXp = 10.5, minLiveSaveBaseSlots = -1, maxLiveSaveBaseSlots = -1, healthCheckXp = 1199.5, healthCheckVarbit = 61, choppedDownVarbit = 60, harvestOption = "pick-banana"),
    ),
    Orange(
            seedId = Items.ORANGE_SAPLING, produce = Item(Items.ORANGE), seedType = SeedType.FruitTree,
            SeedPlant(level = 39, plantXp = 35.5, plantedVarbit = 72, baseLives = 6),
            SeedGrowth(growthStages = 6, canDisease = true, diseaseSlots = 18, protectionPayment = Item(Items.STRAWBERRIES_5, amount = 3), waterVarbit = null, diseaseVarbit = 85, diedVarbit = 91),
            SeedHarvest(harvestXp = 13.0, minLiveSaveBaseSlots = -1, maxLiveSaveBaseSlots = -1, healthCheckXp = 1199.5, healthCheckVarbit = 98, choppedDownVarbit = 97, harvestOption = "pick-orange"),
    ),
    Curry(
            seedId = Items.CURRY_SAPLING, produce = Item(Items.CURRY_LEAF), seedType = SeedType.FruitTree,
            SeedPlant(level = 42, plantXp = 40.0, plantedVarbit = 99, baseLives = 6),
            SeedGrowth(growthStages = 6, canDisease = true, diseaseSlots = 18, protectionPayment = Item(Items.BANANAS_5, amount = 5), waterVarbit = null, diseaseVarbit = 111, diedVarbit = 117),
            SeedHarvest(harvestXp = 15.0, minLiveSaveBaseSlots = -1, maxLiveSaveBaseSlots = -1, healthCheckXp = 1199.5, healthCheckVarbit = 125, choppedDownVarbit = 124, harvestOption = "pick-leaf"),
    ),
    Pineapple(
            seedId = Items.PINEAPPLE_SAPLING, produce = Item(Items.PINEAPPLE), seedType = SeedType.FruitTree,
            SeedPlant(level = 51, plantXp = 57.0, plantedVarbit = 136, baseLives = 6),
            SeedGrowth(growthStages = 6, canDisease = true, diseaseSlots = 18, protectionPayment = Item(Items.WATERMELON, amount = 10), waterVarbit = null, diseaseVarbit = 148, diedVarbit = 154),
            SeedHarvest(harvestXp = 21.5, minLiveSaveBaseSlots = -1, maxLiveSaveBaseSlots = -1, healthCheckXp = 1199.5, healthCheckVarbit = 162, choppedDownVarbit = 161, harvestOption = "pick-pineapple"),
    ),
    Papaya(
            seedId = Items.PAPAYA_SAPLING, produce = Item(Items.PAPAYA_FRUIT), seedType = SeedType.FruitTree,
            SeedPlant(level = 57, plantXp = 72.0, plantedVarbit = 163, baseLives = 6),
            SeedGrowth(growthStages = 6, canDisease = true, diseaseSlots = 18, protectionPayment = Item(Items.PINEAPPLE, amount = 10), waterVarbit = null, diseaseVarbit = 175, diedVarbit = 181),
            SeedHarvest(harvestXp = 27.0, minLiveSaveBaseSlots = -1, maxLiveSaveBaseSlots = -1, healthCheckXp = 1199.5, healthCheckVarbit = 189, choppedDownVarbit = 188, harvestOption = "pick-fruit"),
    ),
    Palm(
            seedId = Items.PALM_SAPLING, produce = Item(Items.COCONUT), seedType = SeedType.FruitTree,
            SeedPlant(level = 68, plantXp = 110.5, plantedVarbit = 200, baseLives = 6),
            SeedGrowth(growthStages = 6, canDisease = true, diseaseSlots = 18, protectionPayment = Item(Items.PAPAYA_FRUIT, amount = 15), waterVarbit = null, diseaseVarbit = 212, diedVarbit = 218),
            SeedHarvest(harvestXp = 41.5, minLiveSaveBaseSlots = -1, maxLiveSaveBaseSlots = -1, healthCheckXp = 1199.5, healthCheckVarbit = 226, choppedDownVarbit = 225, harvestOption = "pick-coconut"),
    ),

    /**
     * Special
     */
    Calquat(
            seedId = Items.CALQUAT_SAPLING, produce = Item(Items.CALQUAT_FRUIT), seedType = SeedType.Calquat,
            SeedPlant(level = 72, plantXp = 129.5, plantedVarbit = 4, baseLives = 6),
            SeedGrowth(growthStages = 8, canDisease = true, diseaseSlots = 18, protectionPayment = Item(Items.POISON_IVY_BERRIES, amount = 8), waterVarbit = null, diseaseVarbit = 18, diedVarbit = 25),
            SeedHarvest(harvestXp = 48.5, minLiveSaveBaseSlots = -1, maxLiveSaveBaseSlots = -1, healthCheckXp = 12096.0, healthCheckVarbit = 34, choppedDownVarbit = null, harvestOption = "pick-fruit"),
    ),
    ;

    private val plantedVarbits = findVarbitRange(plant.plantedVarbit, false).let {
        if (seedType.harvest.livesReplenish) {
            (it.first until it.last) + harvest.healthCheckVarbit!!
        } else {
            it
        }
    }
    private val diseasedVarbits = findVarbitRange(growth.diseaseVarbit, true)
    private val diedVarbits = findVarbitRange(growth.diedVarbit, true)
    private val wateredVarbits = growth.waterVarbit?.let { findVarbitRange(it, false) } ?: 0..-1
    private val produceBearingVarbits = if (seedType.harvest.livesReplenish) (plant.plantedVarbit + growth.growthStages)..(plant.plantedVarbit + growth.growthStages + plant.baseLives) else 0..-1

    fun amountToPlant() = seedType.plant.amountToPlant.takeUnless { this == Jute } ?: 3

    lateinit var seedName: String
        private set

    fun isPlanted(patch: Patch, varbit: Int): Boolean {
        if (seedType !in patch.seedTypes) {
            return false
        }

        return isHealthy(varbit) || isDiseased(varbit) || isDead(varbit) || isWatered(varbit) || isAtHealthCheck(varbit) || isProducing(varbit)
    }

    fun isHealthy(varbit: Int) = varbit in plantedVarbits
    fun isDiseased(varbit: Int) = varbit in diseasedVarbits
    fun isDead(varbit: Int) = varbit in diedVarbits
    fun isWatered(varbit: Int) = varbit in wateredVarbits
    fun isAtHealthCheck(varbit: Int) = varbit == harvest.healthCheckVarbit
    fun isProducing(varbit: Int) = varbit in produceBearingVarbits
    fun produceAvailable(varbit: Int) = if (isProducing(varbit)) plant.baseLives - (produceBearingVarbits.last - varbit) else 0
    fun growthStage(varbit: Int): Int {
        return when {
            isAtHealthCheck(varbit) || isProducing(varbit) -> growth.growthStages
            isHealthy(varbit) -> varbit - plant.plantedVarbit
            isDiseased(varbit) -> varbit - growth.diseaseVarbit
            isDead(varbit) -> varbit - growth.diedVarbit
            isWatered(varbit) -> varbit - growth.waterVarbit!!
            else -> throw IllegalStateException()
        }
    }

    private fun findVarbitRange(start: Int, useFirstStageAdjustment: Boolean): IntRange {
        val firstStageAdjustment = if (useFirstStageAdjustment && !seedType.growth.canDiseaseOnFirstStage) 1 else 0
        return (start + firstStageAdjustment)..(start + growth.growthStages)
    }

    companion object {
        /**
         * Initializes the names for all seeds. This ensures this only needs to be done on startup
         */
        fun initialize(world: World) {
            Seed.values().forEach {
                it.seedName = world.definitions.get(ItemDef::class.java, it.seedId).name.lowercase()
            }
        }

        val seedIds = values().map { it.seedId }

        fun fromId(itemId: Int) = values().singleOrNull { it.seedId == itemId }
    }
}
