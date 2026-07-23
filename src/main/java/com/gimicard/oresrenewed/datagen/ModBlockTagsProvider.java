package com.gimicard.oresrenewed.datagen;

import com.gimicard.oresrenewed.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.getRK(ModBlocks.BLACKCRISTAL_ORE_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.KILLIUM_ORE_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.LEAD_ORE_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.MAGNETITE_ORE_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.RUBY_ORE_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.TITAN_ORE_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.URAN_ORE_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.VULKANIT_ORE_BLOCK))

                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_BLACKCRISTAL_ORE_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_KILLIUM_ORE_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_LEAD_ORE_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_MAGNETITE_ORE_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_RUBY_ORE_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_TITAN_ORE_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_URAN_ORE_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_VULKANIT_ORE_BLOCK));


        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.getRK(ModBlocks.URAN_ORE_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_URAN_ORE_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.BLACKCRISTAL_ORE_BLOCK));

    }
}
