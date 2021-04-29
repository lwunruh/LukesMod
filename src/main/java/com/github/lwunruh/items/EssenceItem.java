package com.github.lwunruh.items;

import net.minecraft.entity.TntEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;

public class EssenceItem extends Item {

    public EssenceItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        world.createExplosion(playerEntity, playerEntity.getX(), playerEntity.getBodyY(0.0625D), playerEntity.getZ(), 4.0F, Explosion.DestructionType.BREAK);
        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }
}
