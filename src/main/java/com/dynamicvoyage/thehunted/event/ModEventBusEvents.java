package com.dynamicvoyage.thehunted.event;

import com.dynamicvoyage.thehunted.TheHunted;
import com.dynamicvoyage.thehunted.entity.ModEntityTypes;
import com.dynamicvoyage.thehunted.entity.custom.ArcherEntity;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TheHunted.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.ARCHER.get(), ArcherEntity.setAttributes());
    }
}