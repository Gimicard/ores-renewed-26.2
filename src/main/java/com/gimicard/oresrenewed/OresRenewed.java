package com.gimicard.oresrenewed;

import com.gimicard.oresrenewed.effect.ModEffect;
import com.gimicard.oresrenewed.item.ModItemMagnet;
import com.gimicard.oresrenewed.item.ModItems;
import com.gimicard.oresrenewed.block.ModBlocks;
import com.gimicard.oresrenewed.creativemodetab.ModCreativeModeTabs;
import com.gimicard.oresrenewed.item.ModKilliumRadiation;
import com.gimicard.oresrenewed.item.ModUranRadiation;
import com.gimicard.oresrenewed.potion.ModPotions;
import com.gimicard.oresrenewed.registries.ModPotionRecipes;
import com.gimicard.oresrenewed.worldgen.ModWorldGeneration;
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
		ModWorldGeneration.generateOres();
		ModKilliumRadiation.register();
		ModUranRadiation.register();
		ModEffect.registerEffects();
		ModPotions.registerPotions();
		ModPotionRecipes.registerPotionRecipes();
		ModItemMagnet.register();

	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
