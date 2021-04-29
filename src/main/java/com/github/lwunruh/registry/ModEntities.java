package com.github.lwunruh.registry;

import com.github.lwunruh.LukesMod;
import com.github.lwunruh.entities.ExplodingArrowEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {

    public static final EntityType<ExplodingArrowEntity> EXPLODING_ARROW_ENTITY = FabricEntityTypeBuilder.<ExplodingArrowEntity>create(SpawnGroup.MISC, ExplodingArrowEntity::new)
            .dimensions(EntityDimensions.fixed(0.5F, 0.5F))
            .trackRangeBlocks(4).trackedUpdateRate(10)
            .build();

    public static void registerEntities(){
        Registry.register(Registry.ENTITY_TYPE, new Identifier(LukesMod.MOD_ID, "exploding_arrow"), EXPLODING_ARROW_ENTITY);
    }
}
