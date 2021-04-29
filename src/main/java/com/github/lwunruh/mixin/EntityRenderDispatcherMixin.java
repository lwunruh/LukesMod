package com.github.lwunruh.mixin;

import com.github.lwunruh.entities.ExplodingArrowEntityRenderer;
import com.github.lwunruh.registry.ModEntities;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.resource.ReloadableResourceManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityRenderDispatcher.class)
public class EntityRenderDispatcherMixin {


    @Inject(method = "registerRenderers", at = @At("TAIL"))
    private void registerRenderers(ItemRenderer itemRenderer, ReloadableResourceManager reloadableResourceManager, CallbackInfo Info) {
        ((EntityRenderDispatcherInvoker)(EntityRenderDispatcher)(Object)this).invokeregister(ModEntities.EXPLODING_ARROW_ENTITY, new ExplodingArrowEntityRenderer((EntityRenderDispatcher)(Object)this));
    }
}
