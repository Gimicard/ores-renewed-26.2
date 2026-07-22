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

        blockStateModelGenerator.createTrivialCube(ModBlocks.SCHATTENKRISTALL_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.VULKANIT_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.MAGNETITE_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.KILLIUM_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.LEAD_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.RUBY_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.URAN_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.TITAN_ORE_BLOCK);

        blockStateModelGenerator.createTrivialCube(ModBlocks.D_SCHATTENKRISTALL_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.D_VULKANIT_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.D_MAGNETITE_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.D_KILLIUM_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.D_LEAD_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.D_RUBY_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.D_URAN_ORE_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.D_TITAN_ORE_BLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {


        itemModelGenerator.generateFlatItem(ModItems.RAW_URAN, ModelTemplates.FLAT_ITEM);
    }
}