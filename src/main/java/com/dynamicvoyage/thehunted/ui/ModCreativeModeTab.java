package com.dynamicvoyage.thehunted.ui;

import com.dynamicvoyage.thehunted.item.ModItems;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TAB_THEHUNTED = new CreativeModeTab("thehunted") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CITRINE.get());
        }
    };
}
