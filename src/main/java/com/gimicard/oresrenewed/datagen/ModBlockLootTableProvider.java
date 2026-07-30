package com.gimicard.oresrenewed.datagen;

import com.gimicard.oresrenewed.block.ModBlocks;
import com.gimicard.oresrenewed.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.advancements.predicates.ItemPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.functions.SmeltItemFunction;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider {
    public ModBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {

        dropSelf(ModBlocks.BLOCK_OF_BLACKCRISTAL);
        dropSelf(ModBlocks.BLOCK_OF_KILLIUM);
        dropSelf(ModBlocks.BLOCK_OF_LEAD);
        dropSelf(ModBlocks.BLOCK_OF_MAGNETIT);
        dropSelf(ModBlocks.BLOCK_OF_RUBY);
        dropSelf(ModBlocks.BLOCK_OF_TITAN);
        dropSelf(ModBlocks.BLOCK_OF_URAN);
        dropSelf(ModBlocks.BLOCK_OF_VULKANIT);


        add(ModBlocks.BLACKCRISTAL_ORE_BLOCK, createMultipleOreDrops(ModBlocks.BLACKCRISTAL_ORE_BLOCK, ModItems.BLACKCRISTAL, 2, 6));
        add(ModBlocks.DEEPSLATE_BLACKCRISTAL_ORE_BLOCK, createMultipleOreDrops(ModBlocks.DEEPSLATE_BLACKCRISTAL_ORE_BLOCK, ModItems.BLACKCRISTAL, 1, 7));


        add(ModBlocks.RUBY_ORE_BLOCK, createOreDrop(ModBlocks.RUBY_ORE_BLOCK, ModItems.RUBY));
        add(ModBlocks.DEEPSLATE_RUBY_ORE_BLOCK, createOreDrop(ModBlocks.DEEPSLATE_RUBY_ORE_BLOCK, ModItems.RUBY));


        add(ModBlocks.KILLIUM_ORE_BLOCK, createAutoSmeltOreDrop(ModBlocks.KILLIUM_ORE_BLOCK, ModItems.RAW_KILLIUM));
        add(ModBlocks.DEEPSLATE_KILLIUM_ORE_BLOCK, createAutoSmeltOreDrop(ModBlocks.DEEPSLATE_KILLIUM_ORE_BLOCK, ModItems.RAW_KILLIUM));

        add(ModBlocks.LEAD_ORE_BLOCK, createAutoSmeltOreDrop(ModBlocks.LEAD_ORE_BLOCK, ModItems.RAW_LEAD));
        add(ModBlocks.DEEPSLATE_LEAD_ORE_BLOCK, createAutoSmeltOreDrop(ModBlocks.DEEPSLATE_LEAD_ORE_BLOCK, ModItems.RAW_LEAD));

        add(ModBlocks.MAGNETIT_ORE_BLOCK, createAutoSmeltOreDrop(ModBlocks.MAGNETIT_ORE_BLOCK, ModItems.RAW_MAGNETIT));
        add(ModBlocks.DEEPSLATE_MAGNETIT_ORE_BLOCK, createAutoSmeltOreDrop(ModBlocks.DEEPSLATE_MAGNETIT_ORE_BLOCK, ModItems.RAW_MAGNETIT));

        add(ModBlocks.TITAN_ORE_BLOCK, createAutoSmeltOreDrop(ModBlocks.TITAN_ORE_BLOCK, ModItems.RAW_TITAN));
        add(ModBlocks.DEEPSLATE_TITAN_ORE_BLOCK, createAutoSmeltOreDrop(ModBlocks.DEEPSLATE_TITAN_ORE_BLOCK, ModItems.RAW_TITAN));

        add(ModBlocks.URAN_ORE_BLOCK, createAutoSmeltOreDrop(ModBlocks.URAN_ORE_BLOCK, ModItems.RAW_URAN));
        add(ModBlocks.DEEPSLATE_URAN_ORE_BLOCK, createAutoSmeltOreDrop(ModBlocks.DEEPSLATE_URAN_ORE_BLOCK, ModItems.RAW_URAN));

        add(ModBlocks.VULKANIT_ORE_BLOCK, createAutoSmeltOreDrop(ModBlocks.VULKANIT_ORE_BLOCK, ModItems.RAW_VULKANIT));
        add(ModBlocks.DEEPSLATE_VULKANIT_ORE_BLOCK, createAutoSmeltOreDrop(ModBlocks.DEEPSLATE_VULKANIT_ORE_BLOCK, ModItems.RAW_VULKANIT));

        add(ModBlocks.RUBY_ORE_BLOCK, createOreDrop(ModBlocks.RUBY_ORE_BLOCK, ModItems.RUBY));
        add(ModBlocks.DEEPSLATE_RUBY_ORE_BLOCK, createOreDrop(ModBlocks.DEEPSLATE_RUBY_ORE_BLOCK, ModItems.RUBY));
        add(ModBlocks.BLACKCRISTAL_ORE_BLOCK, createOreDrop(ModBlocks.BLACKCRISTAL_ORE_BLOCK, ModItems.BLACKCRISTAL));
        add(ModBlocks.DEEPSLATE_BLACKCRISTAL_ORE_BLOCK, createOreDrop(ModBlocks.DEEPSLATE_BLACKCRISTAL_ORE_BLOCK, ModItems.BLACKCRISTAL));

        add(Blocks.IRON_ORE, createAutoSmeltOreDrop(Blocks.IRON_ORE, Items.RAW_IRON));
        add(Blocks.DEEPSLATE_IRON_ORE, createAutoSmeltOreDrop(Blocks.DEEPSLATE_IRON_ORE, Items.RAW_IRON));

        add(Blocks.GOLD_ORE, createAutoSmeltOreDrop(Blocks.GOLD_ORE, Items.RAW_GOLD));
        add(Blocks.DEEPSLATE_GOLD_ORE, createAutoSmeltOreDrop(Blocks.DEEPSLATE_GOLD_ORE, Items.RAW_GOLD));
        add(Blocks.NETHER_GOLD_ORE, createOreDrop(Blocks.NETHER_GOLD_ORE, Items.GOLD_NUGGET));

        add(Blocks.COPPER_ORE, createAutoSmeltOreDrop(Blocks.COPPER_ORE, Items.RAW_COPPER));
        add(Blocks.DEEPSLATE_COPPER_ORE, createAutoSmeltOreDrop(Blocks.DEEPSLATE_COPPER_ORE, Items.RAW_COPPER));
    }

    public LootTable.Builder createMultipleOreDrops(final Block block, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> enchantments = this.registries.lookupOrThrow(Registries.ENCHANTMENT);

        return this.createSilkTouchDispatchTable(block, this.applyExplosionDecay(
                block, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))
        ));
    }

    private LootTable.Builder createAutoSmeltOreDrop(Block block, Item rawDrop) {
        HolderLookup.RegistryLookup<Enchantment> enchantments = this.registries.lookupOrThrow(Registries.ENCHANTMENT);

        return createSilkTouchDispatchTable(block,
                this.applyExplosionDecay(block, LootItem.lootTableItem(rawDrop)
                        .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))
                        .apply(SmeltItemFunction.smelted()
                                .when(MatchTool.toolMatches(
                                        ItemPredicate.Builder.item().of(this.registries.lookupOrThrow(Registries.ITEM), ModItems.VULKANIT_PICKAXE)
                                ))
                        )
                )
        );
    }
}