package com.github.lwunruh;

import com.github.lwunruh.registry.ModBlocks;
import com.github.lwunruh.registry.ModEntities;
import com.github.lwunruh.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class LukesMod implements ModInitializer {

	public static final String MOD_ID = "lukesmod";

	public static final ItemGroup MOD_ITEMS = FabricItemGroupBuilder.build(
			new Identifier(MOD_ID, "mod_items"),
			() -> new ItemStack(ModItems.NOAH_BLOCK)
	);

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		ModBlocks.registerBlocks();
		ModEntities.registerEntities();
	}
}

