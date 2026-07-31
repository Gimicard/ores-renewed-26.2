package com.gimicard.oresrenewed;

import com.gimicard.oresrenewed.effect.ModEffect;
import com.gimicard.oresrenewed.item.*;
import com.gimicard.oresrenewed.block.ModBlocks;
import com.gimicard.oresrenewed.creativemodetab.ModCreativeModeTabs;
import com.gimicard.oresrenewed.potion.ModPotions;
import com.gimicard.oresrenewed.registries.ModFuels;
import com.gimicard.oresrenewed.registries.ModPotionRecipes;
import com.gimicard.oresrenewed.worldgen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OresRenewed implements ModInitializer {
	public static final String MOD_ID = "ores_renewed";
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
		ModKilliumSwordOffhand.register();
		ModFuels.registerFuels();

	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
