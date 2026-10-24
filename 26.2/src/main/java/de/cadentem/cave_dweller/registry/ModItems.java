package de.cadentem.cave_dweller.registry;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;

public class ModItems {
    private static final ResourceKey<Item> SPAWN_EGG_KEY = ResourceKey.create(
            BuiltInRegistries.ITEM.key(),
            Identifier.fromNamespaceAndPath("cave_dweller", "cave_dweller_spawn_egg"));

    public static final Item CAVE_DWELLER_SPAWN_EGG = Registry.register(
            BuiltInRegistries.ITEM,
            SPAWN_EGG_KEY,
            new SpawnEggItem(new Item.Properties()
                    .setId(SPAWN_EGG_KEY)
                    .spawnEgg(ModEntityTypes.CAVE_DWELLER)));

    private static final ResourceKey<CreativeModeTab> SPAWN_EGGS_KEY =
            ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(),
                    Identifier.withDefaultNamespace("spawn_eggs"));

    public static void init() {
        CreativeModeTabEvents.modifyOutputEvent(SPAWN_EGGS_KEY).register(content ->
                content.accept(CAVE_DWELLER_SPAWN_EGG));
    }
}
