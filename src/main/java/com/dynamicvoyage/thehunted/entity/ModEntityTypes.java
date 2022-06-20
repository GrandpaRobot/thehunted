package com.dynamicvoyage.thehunted.entity;

import com.dynamicvoyage.thehunted.TheHunted;
import com.dynamicvoyage.thehunted.entity.custom.ArcherEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, TheHunted.MOD_ID);

    public static final RegistryObject<EntityType<ArcherEntity>> ARCHER =
            ENTITY_TYPES.register("archer",
            () -> EntityType.Builder.of(ArcherEntity::new, MobCategory.MONSTER)
            .sized(0.6F, 1.99F)
                    .build(new ResourceLocation(TheHunted.MOD_ID, "archer").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}