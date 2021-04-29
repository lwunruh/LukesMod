package com.github.lwunruh.entities;

import com.github.lwunruh.LukesModClient;
import com.github.lwunruh.registry.ModEntities;
import com.github.lwunruh.registry.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.Packet;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;

public class ExplodingArrowEntity extends PersistentProjectileEntity {
    private int duration = 200;

    public ExplodingArrowEntity(EntityType<? extends ExplodingArrowEntity> entityType, World world) {
        super(entityType, world);
    }

    public ExplodingArrowEntity(World world, LivingEntity owner) {
        super(ModEntities.EXPLODING_ARROW_ENTITY, owner, world);
    }

    public ExplodingArrowEntity(World world, double x, double y, double z) {
        super(ModEntities.EXPLODING_ARROW_ENTITY, x, y, z, world);
    }

    public void tick() {
        super.tick();
        if (this.world.isClient && !this.inGround) {
            this.world.addParticle(ParticleTypes.INSTANT_EFFECT, this.getX(), this.getY(), this.getZ(), 0.0D, 0.0D, 0.0D);
        }

    }

    protected ItemStack asItemStack() {
        return new ItemStack(ModItems.EXPLODING_ARROW);
    }

    protected void onHit(LivingEntity target) {
        super.onHit(target);
        //world.createExplosion()
        StatusEffectInstance statusEffectInstance = new StatusEffectInstance(StatusEffects.GLOWING, this.duration, 0);
        target.addStatusEffect(statusEffectInstance);
    }

    protected void onBlockHit(BlockHitResult blockHitResult){
        super.onBlockHit(blockHitResult);
        this.world.createExplosion(this, this.getX(), this.getBodyY(0.0625D), this.getZ(), 4.0F, Explosion.DestructionType.BREAK);
    }

    @Override
    public Packet createSpawnPacket() {
        return EntitySpawnPacket.create(this, LukesModClient.PacketID);
    }

    public void readCustomDataFromTag(CompoundTag tag) {
        super.readCustomDataFromTag(tag);
        if (tag.contains("Duration")) {
            this.duration = tag.getInt("Duration");
        }

    }

    public void writeCustomDataToTag(CompoundTag tag) {
        super.writeCustomDataToTag(tag);
        tag.putInt("Duration", this.duration);
    }
}