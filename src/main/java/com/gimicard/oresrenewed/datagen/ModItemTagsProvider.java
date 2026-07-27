package com.gimicard.oresrenewed.datagen;

import com.gimicard.oresrenewed.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import org.jspecify.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {

    public ModItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture, @Nullable BlockTagsProvider blockTagsProvider) {
        super(output, registryLookupFuture, blockTagsProvider);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(ItemTags.SWORDS).add(ModItems.getRK(ModItems.VULKANIT_SWORT));
        tag(ItemTags.PICKAXES).add(ModItems.getRK(ModItems.VULKANIT_PICKAXE));
        tag(ItemTags.SHOVELS).add(ModItems.getRK(ModItems.VULKANIT_SHOVEL));
        tag(ItemTags.AXES).add(ModItems.getRK(ModItems.VULKANIT_AXE));
        tag(ItemTags.HOES).add(ModItems.getRK(ModItems.VULKANIT_HOE));
        tag(ItemTags.SPEARS).add(ModItems.getRK(ModItems.VULKANIT_SPEAR));

        tag(ItemTags.PICKAXES).add(ModItems.getRK(ModItems.LEAD_PICKAXE));

    }
}
