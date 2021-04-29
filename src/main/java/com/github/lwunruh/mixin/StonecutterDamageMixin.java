package com.github.lwunruh.mixin;

import net.minecraft.block.StonecutterBlock;
import net.minecraft.entity.Entity;
import com.github.lwunruh.damage.ModDamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

import static net.minecraft.sound.SoundEvents.UI_STONECUTTER_TAKE_RESULT;

@Mixin(StonecutterBlock.class)
public class StonecutterDamageMixin {

    public void onSteppedOn(World world, BlockPos pos, Entity entity){
        entity.damage(DamageSource.GENERIC, 5.0F);
        //world.playSound((double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), UI_STONECUTTER_TAKE_RESULT, SoundCategory.BLOCKS, 1.0F, 1.0F, true);
    }
}


