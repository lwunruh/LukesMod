package com.github.lwunruh.entities;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import com.github.lwunruh.entities.ExplodingArrowEntity;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class ExplodingArrowEntityRenderer extends ProjectileEntityRenderer<ExplodingArrowEntity> {
    public static final Identifier TEXTURE = new Identifier("textures/entities/exploding_arrow.png");

    public ExplodingArrowEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher);
    }

    public Identifier getTexture(ExplodingArrowEntity explodingArrowEntity) {
        return TEXTURE;
    }
}
