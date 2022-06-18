package com.dynamicvoyage.thehunted.item;

import com.dynamicvoyage.thehunted.TheHunted;
import com.dynamicvoyage.thehunted.ui.ModCreativeModeTab;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TheHunted.MOD_ID);

    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_THEHUNTED)));
    public static final RegistryObject<Item> RAW_CITRINE = ITEMS.register("raw_citrine", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_THEHUNTED)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
