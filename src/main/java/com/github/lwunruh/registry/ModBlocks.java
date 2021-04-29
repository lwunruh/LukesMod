package com.github.lwunruh.registry;

import com.github.lwunruh.LukesMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block NOAH_BLOCK = new Block(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.SWORDS, 0)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(2.0f, 100.0f)
            .sounds(BlockSoundGroup.STONE)
            .luminance(15));

    public static final Block BRAYDEN_BLOCK = new Block(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.SWORDS, 0)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(2.0f, 100.0f)
            .sounds(BlockSoundGroup.STONE)
            .luminance(15)
            .slipperiness(1.5F)
            );

    /*public static final Block DAWSON_BLOCK = new Block(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.SWORDS, 0)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(2.0f, 100.0f)
            .sounds(BlockSoundGroup.STONE)
            .luminance(15)
            .);*/

    public static void registerBlocks(){
        Registry.register(Registry.BLOCK, new Identifier(LukesMod.MOD_ID, "noah_block"), NOAH_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(LukesMod.MOD_ID, "brayden_block"), BRAYDEN_BLOCK);
    }
}
