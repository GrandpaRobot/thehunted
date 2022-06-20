package com.dynamicvoyage.thehunted.item.custom;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class TrackingRodItem extends Item {

    public TrackingRodItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public int getEntityLifespan(ItemStack itemStack, Level level) {
        return 250;
    }
    
    @Override
    public void inventoryTick(ItemStack pStack, Level pLevel, Entity pEntity, int pSlotId, boolean pIsSelected) {
        if(pIsSelected) {
            System.out.println("ITEM IN INVENTORY");
        }
        super.inventoryTick(pStack, pLevel, pEntity, pSlotId, pIsSelected);
    }
}