package com.github.lwunruh.damage;

import net.minecraft.entity.damage.DamageSource;

public class ModDamageSource extends DamageSource {

    public ModDamageSource(String name) {
        super(name);
    }

    public static final ModDamageSource ON_STONECUTTER = (new ModDamageSource("onStonecutter")).setStonecutter();

    private boolean stonecutter;

    public ModDamageSource setStonecutter(){
        this.stonecutter = true;
        return this;
    }

    public boolean isStonecutter() {
        return stonecutter;
    }
}
