package com.dynamicvoyage.thehunted.entity.client;

import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.dynamicvoyage.thehunted.entity.custom.ArcherEntity;

import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.resources.ResourceLocation;

public class ArcherRenderer extends HumanoidMobRenderer<ArcherEntity, PlayerModel<ArcherEntity>> {
    public ArcherRenderer(EntityRendererProvider.Context context) {
        super(context, new PlayerModel<>(context.bakeLayer(ModelLayers.PLAYER), false), 0.5F);
    }

    @Override
    public ResourceLocation getTextureLocation(ArcherEntity archer) {
        return new ResourceLocation("thehunted:textures/entity/archer/archer.png");
    }
}