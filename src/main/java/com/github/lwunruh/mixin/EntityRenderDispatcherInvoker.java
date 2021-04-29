package com.github.lwunruh.mixin;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(EntityRenderDispatcher.class)
public interface EntityRenderDispatcherInvoker {
    @Invoker("register")
    public <T extends Entity> void invokeregister(EntityType<T> entityType, EntityRenderer<? super T> entityRenderer);
}
