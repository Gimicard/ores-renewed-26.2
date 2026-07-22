package com.gimicard.oresrenewed.datagen;

import com.gimicard.oresrenewed.block.ModBlocks;
import com.gimicard.oresrenewed.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {

        blockStateModelGenerator.createTrivialCube(ModBlocks.BLACKCRISTAL_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.VULKANIT_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.MAGNETITE_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.KILLIUM_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.LEAD_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.RUBY_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.URAN_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.TITAN_ORE_BLOCK);

        blockStateModelGenerator.createTrivialCube(ModBlocks.DEEPSLATE_BLACKCRISTAL_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.DEEPSLATE_VULKANIT_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.DEEPSLATE_MAGNETITE_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.DEEPSLATE_KILLIUM_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.DEEPSLATE_LEAD_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.DEEPSLATE_RUBY_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.DEEPSLATE_URAN_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.DEEPSLATE_TITAN_ORE_BLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {


        itemModelGenerator.generateFlatItem(ModItems.RAW_URAN, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.RAW_TITAN, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.RAW_VULKANIT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.RAW_MAGNETIT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.RAW_KILLIUM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.RAW_LEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.RUBY, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.BLACKCRISTAL, ModelTemplates.FLAT_ITEM);
    }
}