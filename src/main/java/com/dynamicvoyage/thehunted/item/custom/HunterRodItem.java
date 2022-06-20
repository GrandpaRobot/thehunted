package com.dynamicvoyage.thehunted.item.custom;

import com.mojang.authlib.minecraft.client.MinecraftClient;

import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

public class HunterRodItem extends Item {

    public HunterRodItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (level.isClientSide()) {
            player.sendMessage(new TextComponent("YOU ARE CROUCHING"), player.getUUID());
        }
        return super.use(level, player, hand);
	}
    
}