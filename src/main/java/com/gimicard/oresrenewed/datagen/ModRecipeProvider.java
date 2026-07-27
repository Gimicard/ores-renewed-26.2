package com.gimicard.oresrenewed.datagen;

import com.gimicard.oresrenewed.block.ModBlocks;
import com.gimicard.oresrenewed.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.level.ItemLike;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                List<ItemLike> KILLIUM_SMELTABLES = List.of(ModItems.RAW_KILLIUM, ModBlocks.KILLIUM_ORE_BLOCK ,ModBlocks.DEEPSLATE_KILLIUM_ORE_BLOCK);
                oreSmelting(KILLIUM_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.KILLIUM_INGOT, 0.25f, 200, "killium");
                oreBlasting(KILLIUM_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.KILLIUM_INGOT, 0.25f, 100, "killium");

                List<ItemLike> LEAD_SMELTABLES = List.of(ModItems.RAW_LEAD, ModBlocks.LEAD_ORE_BLOCK ,ModBlocks.DEEPSLATE_LEAD_ORE_BLOCK);
                oreSmelting(LEAD_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.LEAD_INGOT, 0.25f, 200, "lead");
                oreBlasting(LEAD_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.LEAD_INGOT, 0.25f, 100, "lead");

                List<ItemLike> Magnetit_SMELTABLES = List.of(ModItems.RAW_MAGNETIT, ModBlocks.MAGNETIT_ORE_BLOCK ,ModBlocks.DEEPSLATE_MAGNETIT_ORE_BLOCK);
                oreSmelting(Magnetit_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.MAGNETIT_INGOT, 0.25f, 200, "magneit");
                oreBlasting(Magnetit_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.MAGNETIT_INGOT, 0.25f, 100, "magnetit");

                List<ItemLike> TITAN_SMELTABLES = List.of(ModItems.RAW_TITAN, ModBlocks.TITAN_ORE_BLOCK ,ModBlocks.DEEPSLATE_TITAN_ORE_BLOCK);
                oreSmelting(TITAN_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.TITAN_INGOT, 0.25f, 200, "titan");
                oreBlasting(TITAN_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.TITAN_INGOT, 0.25f, 100, "titan");

                List<ItemLike> Uran_SMELTABLES = List.of(ModItems.RAW_URAN, ModBlocks.URAN_ORE_BLOCK ,ModBlocks.DEEPSLATE_URAN_ORE_BLOCK);
                oreSmelting(Uran_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.URAN_INGOT, 0.25f, 200, "uran");
                oreBlasting(Uran_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.URAN_INGOT, 0.25f, 100, "uran");

                List<ItemLike> VULKANIT_SMELTABLES = List.of(ModItems.RAW_VULKANIT, ModBlocks.VULKANIT_ORE_BLOCK ,ModBlocks.DEEPSLATE_VULKANIT_ORE_BLOCK);
                oreSmelting(VULKANIT_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.VULKANIT_INGOT, 0.25f, 200, "vulkanit");
                oreBlasting(VULKANIT_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.VULKANIT_INGOT, 0.25f, 100, "vulkanit");

                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.BLACKCRISTAL ,RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOCK_OF_BLACKCRISTAL);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.KILLIUM_INGOT ,RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOCK_OF_KILLIUM);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.LEAD_INGOT ,RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOCK_OF_LEAD);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.MAGNETIT_INGOT ,RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOCK_OF_MAGNETIT);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.RUBY ,RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOCK_OF_RUBY);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.TITAN_INGOT ,RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOCK_OF_TITAN);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.URAN_INGOT ,RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOCK_OF_URAN);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.VULKANIT_INGOT ,RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOCK_OF_VULKANIT);


                shaped(RecipeCategory.TOOLS, ModItems.LEAD_PICKAXE)
                        .pattern("LLL")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('L', ModItems.LEAD_INGOT)
                        .unlockedBy(getHasName(ModItems.LEAD_INGOT), has(ModItems.LEAD_INGOT))
                        .group("lead")
                        .define('S', Items.STICK)
                        .save(output);

                /*shapeless(RecipeCategory.MISC, ModItems.LEAD_PICKAXE, 9)
                        .requires(ModItems.LEAD_INGOT)
                        .group("lead")
                        .unlockedBy(getHasName(ModItems.LEAD_INGOT), has(ModItems.LEAD_INGOT))
                        .save(output, "anderes rezept");*/


            }
        };
    }

    @Override
    public String getName() {
        return "Ores Renewed Recipes";
    } /*Mod by Gimicard and Backblech12*/
}
