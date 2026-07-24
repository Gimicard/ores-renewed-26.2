package com.gimicard.oresrenewed.datagen;

import com.gimicard.oresrenewed.block.ModBlocks;
import com.gimicard.oresrenewed.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider {
    public ModBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {

        add(ModBlocks.BLACKCRISTAL_ORE_BLOCK, createMultipleOreDrops(ModBlocks.BLACKCRISTAL_ORE_BLOCK, ModItems.BLACKCRISTAL, 2,6));
        add(ModBlocks.DEEPSLATE_BLACKCRISTAL_ORE_BLOCK, createMultipleOreDrops(ModBlocks.DEEPSLATE_BLACKCRISTAL_ORE_BLOCK, ModItems.BLACKCRISTAL, 1,7));
        add(ModBlocks.KILLIUM_ORE_BLOCK, createMultipleOreDrops(ModBlocks.KILLIUM_ORE_BLOCK, ModItems.RAW_KILLIUM, 1,3));
        add(ModBlocks.DEEPSLATE_KILLIUM_ORE_BLOCK, createMultipleOreDrops(ModBlocks.DEEPSLATE_KILLIUM_ORE_BLOCK, ModItems.RAW_KILLIUM, 1,4));
        add(ModBlocks.LEAD_ORE_BLOCK, createMultipleOreDrops(ModBlocks.LEAD_ORE_BLOCK, ModItems.RAW_LEAD, 3,5));
        add(ModBlocks.DEEPSLATE_LEAD_ORE_BLOCK, createMultipleOreDrops(ModBlocks.DEEPSLATE_LEAD_ORE_BLOCK, ModItems.RAW_LEAD, 2,6));
        add(ModBlocks.TITAN_ORE_BLOCK, createMultipleOreDrops(ModBlocks.TITAN_ORE_BLOCK, ModItems.RAW_TITAN, 2,3));
        add(ModBlocks.DEEPSLATE_TITAN_ORE_BLOCK, createMultipleOreDrops(ModBlocks.DEEPSLATE_TITAN_ORE_BLOCK, ModItems.RAW_TITAN, 1,4));


        add(ModBlocks.MAGNETITE_ORE_BLOCK, createOreDrop(ModBlocks.MAGNETITE_ORE_BLOCK, ModItems.RAW_MAGNETIT));
        add(ModBlocks.DEEPSLATE_MAGNETITE_ORE_BLOCK, createOreDrop(ModBlocks.DEEPSLATE_MAGNETITE_ORE_BLOCK, ModItems.RAW_MAGNETIT));
        add(ModBlocks.RUBY_ORE_BLOCK, createOreDrop(ModBlocks.RUBY_ORE_BLOCK, ModItems.RUBY));
        add(ModBlocks.DEEPSLATE_RUBY_ORE_BLOCK, createOreDrop(ModBlocks.DEEPSLATE_RUBY_ORE_BLOCK, ModItems.RUBY));
        add(ModBlocks.URAN_ORE_BLOCK, createOreDrop(ModBlocks.URAN_ORE_BLOCK, ModItems.RAW_URAN));
        add(ModBlocks.DEEPSLATE_URAN_ORE_BLOCK, createOreDrop(ModBlocks.DEEPSLATE_URAN_ORE_BLOCK, ModItems.RAW_URAN));
        add(ModBlocks.VULKANIT_ORE_BLOCK, createOreDrop(ModBlocks.VULKANIT_ORE_BLOCK, ModItems.RAW_VULKANIT));
        add(ModBlocks.DEEPSLATE_VULKANIT_ORE_BLOCK, createOreDrop(ModBlocks.DEEPSLATE_VULKANIT_ORE_BLOCK, ModItems.RAW_VULKANIT));
    }


    public LootTable.Builder createMultipleOreDrops(final Block block, Item item, float minDrops, float maxDrops){
        HolderLookup.RegistryLookup<Enchantment> enchantments = this.registries.lookupOrThrow(Registries.ENCHANTMENT);

        return this.createSilkTouchDispatchTable(block, this.applyExplosionDecay(
                block, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow((Enchantments.FORTUNE))))
        ));
    }
}
