package com.gimicard.oresrenewed;

import com.gimicard.oresrenewed.item.ModItems;
import com.gimicard.oresrenewed.block.ModBlocks;
import com.gimicard.oresrenewed.creativemodetab.ModCreativeModeTabs;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OresRenewed implements ModInitializer {
	public static final String MOD_ID = "ores-renewed";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		ModBlocks.registerBlocks();
		ModCreativeModeTabs.registerModCreativeTabs();


	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
