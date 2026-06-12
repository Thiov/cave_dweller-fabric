package de.cadentem.cave_dweller.registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;

public class ModItems {
    public static final Item CAVE_DWELLER_SPAWN_EGG = Registry.register(
            BuiltInRegistries.ITEM,
            new ResourceLocation("cave_dweller", "cave_dweller_spawn_egg"),
            new SpawnEggItem(ModEntityTypes.CAVE_DWELLER, 12895428, 790333, new Item.Properties()));

    public static void init() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.SPAWN_EGGS).register(entries ->
                entries.accept(CAVE_DWELLER_SPAWN_EGG));
    }
}
