package com.github.lwunruh.registry;

import com.github.lwunruh.LukesMod;
import com.github.lwunruh.items.EssenceItem;
import com.github.lwunruh.items.ExplodingArrowItem;
import com.github.lwunruh.items.ExplodingBowItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.potion.Potion;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //Items
    public static final EssenceItem ESSENCE_OF_BRAYDEN  = new EssenceItem(new Item.Settings().group(LukesMod.MOD_ITEMS).rarity(Rarity.EPIC).maxCount(16));
    public static final ExplodingArrowItem EXPLODING_ARROW = new ExplodingArrowItem(new Item.Settings().group(LukesMod.MOD_ITEMS));

    //Block Items
    public static final BlockItem NOAH_BLOCK = new BlockItem(ModBlocks.NOAH_BLOCK, new Item.Settings().group(LukesMod.MOD_ITEMS).food((new FoodComponent.Builder()).hunger(10).saturationModifier(12.0F).alwaysEdible().build()));
    public static final BlockItem BRAYDEN_BLOCK = new BlockItem(ModBlocks.BRAYDEN_BLOCK, new Item.Settings().group(LukesMod.MOD_ITEMS).food((new FoodComponent.Builder()).hunger(10).saturationModifier(12.0F).alwaysEdible().build()));

    //Potions
    public static final Potion POTION_OF_LEVITATION = new Potion(new StatusEffectInstance(StatusEffects.LEVITATION, 600));
    //public static final Potion EXPLODING_POTION = new Potion()

    //Tools
    public static final ExplodingBowItem EXPLODING_BOW = new ExplodingBowItem(new FabricItemSettings().group(LukesMod.MOD_ITEMS).fireproof().maxDamage(1));

    public static void registerItems() {
        //Items
        Registry.register(Registry.ITEM, new Identifier(LukesMod.MOD_ID, "essence_of_brayden"), ESSENCE_OF_BRAYDEN);
        Registry.register(Registry.ITEM, new Identifier(LukesMod.MOD_ID, "exploding_arrow"), EXPLODING_ARROW);

        //Block Items
        Registry.register(Registry.ITEM, new Identifier(LukesMod.MOD_ID, "noah_block"), NOAH_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(LukesMod.MOD_ID, "brayden_block"), BRAYDEN_BLOCK);

        //Potions
        Registry.register(Registry.POTION, new Identifier(LukesMod.MOD_ID, "potion_of_levitation"), POTION_OF_LEVITATION);

        //Tools
        Registry.register(Registry.ITEM, new Identifier(LukesMod.MOD_ID, "exploding_bow"), EXPLODING_BOW);
    }
}
