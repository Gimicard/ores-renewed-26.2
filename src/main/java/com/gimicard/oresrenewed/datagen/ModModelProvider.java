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
        blockStateModelGenerator.createTrivialCube(ModBlocks.MAGNETIT_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.KILLIUM_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.LEAD_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.RUBY_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.URAN_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.TITAN_ORE_BLOCK);

        blockStateModelGenerator.createTrivialCube(ModBlocks.DEEPSLATE_BLACKCRISTAL_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.DEEPSLATE_VULKANIT_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.DEEPSLATE_MAGNETIT_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.DEEPSLATE_KILLIUM_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.DEEPSLATE_LEAD_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.DEEPSLATE_RUBY_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.DEEPSLATE_URAN_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.DEEPSLATE_TITAN_ORE_BLOCK);

        blockStateModelGenerator.createTrivialCube(ModBlocks.BLOCK_OF_BLACKCRISTAL);
        blockStateModelGenerator.createTrivialCube(ModBlocks.BLOCK_OF_VULKANIT);
        blockStateModelGenerator.createTrivialCube(ModBlocks.BLOCK_OF_MAGNETIT);
        blockStateModelGenerator.createTrivialCube(ModBlocks.BLOCK_OF_KILLIUM);
        blockStateModelGenerator.createTrivialCube(ModBlocks.BLOCK_OF_LEAD);
        blockStateModelGenerator.createTrivialCube(ModBlocks.BLOCK_OF_RUBY);
        blockStateModelGenerator.createTrivialCube(ModBlocks.BLOCK_OF_URAN);
        blockStateModelGenerator.createTrivialCube(ModBlocks.BLOCK_OF_TITAN);


    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {

        itemModelGenerator.generateFlatItem(ModItems.MAGNET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.URAN_FUEL_ROD, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(ModItems.RAW_URAN, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.RAW_TITAN, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.RAW_VULKANIT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.RAW_MAGNETIT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.RAW_KILLIUM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.RAW_LEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.URAN_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.TITAN_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.VULKANIT_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.MAGNETIT_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.KILLIUM_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.LEAD_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.RUBY, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.BLACKCRISTAL, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(ModItems.VULKANIT_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.VULKANIT_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.VULKANIT_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.VULKANIT_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.VULKANIT_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateSpear(ModItems.VULKANIT_SPEAR);

        itemModelGenerator.generateFlatItem(ModItems.RUBY_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.RUBY_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.RUBY_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.RUBY_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.RUBY_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateSpear(ModItems.RUBY_SPEAR);

        itemModelGenerator.generateFlatItem(ModItems.TITAN_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.TITAN_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.TITAN_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.TITAN_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.TITAN_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateSpear(ModItems.TITAN_SPEAR);

        itemModelGenerator.generateFlatItem(ModItems.LEAD_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.MAGNETIT_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.KILLIUM_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
    }
}