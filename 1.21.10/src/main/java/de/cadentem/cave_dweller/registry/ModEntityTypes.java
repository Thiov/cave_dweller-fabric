package de.cadentem.cave_dweller.registry;

import de.cadentem.cave_dweller.entities.CaveDwellerEntity;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class ModEntityTypes {
    public static final ResourceKey<EntityType<?>> CAVE_DWELLER_KEY =
            ResourceKey.create(BuiltInRegistries.ENTITY_TYPE.key(),
                    ResourceLocation.fromNamespaceAndPath("cave_dweller", "cave_dweller"));

    public static final EntityType<CaveDwellerEntity> CAVE_DWELLER = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            CAVE_DWELLER_KEY,
            EntityType.Builder.<CaveDwellerEntity>of(CaveDwellerEntity::new, MobCategory.MONSTER)
                    .sized(0.5F, 2.7F)
                    .build(CAVE_DWELLER_KEY));

    public static void init() {}
}
