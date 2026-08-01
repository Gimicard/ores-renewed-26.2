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

                shaped(RecipeCategory.TOOLS, ModItems.MAGNET) //einzeln
                        .pattern("M M")
                        .pattern(" T ")
                        .pattern("   ")
                        .define('M', ModItems.MAGNETIT_INGOT)
                        .unlockedBy(getHasName(ModItems.MAGNETIT_INGOT), has(ModItems.MAGNETIT_INGOT))
                        .group("magnet")
                        .define('T', ModItems.TITAN_INGOT)
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.URAN_FUEL_ROD) //einzeln
                        .pattern("U  ")
                        .pattern(" U ")
                        .pattern("  U")
                        .define('U', ModItems.URAN_INGOT)
                        .unlockedBy(getHasName(ModItems.URAN_INGOT), has(ModItems.URAN_INGOT))
                        .group("uran")
                        .save(output);


                shaped(RecipeCategory.TOOLS, ModItems.LEAD_PICKAXE) //einzeln
                        .pattern("LLL")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('L', ModItems.LEAD_INGOT)
                        .unlockedBy(getHasName(ModItems.LEAD_INGOT), has(ModItems.LEAD_INGOT))
                        .group("lead")
                        .define('S', Items.STICK)
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.MAGNETIT_PICKAXE) //einzeln
                        .pattern("LLL")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('L', ModItems.MAGNETIT_INGOT)
                        .unlockedBy(getHasName(ModItems.MAGNETIT_INGOT), has(ModItems.MAGNETIT_INGOT))
                        .group("magnetit")
                        .define('S', Items.STICK)
                        .save(output);




                shaped(RecipeCategory.COMBAT, ModItems.KILLIUM_SWORD) //einzeln
                        .pattern(" L ")
                        .pattern(" L ")
                        .pattern(" S ")
                        .define('L', ModItems.KILLIUM_INGOT)
                        .unlockedBy(getHasName(ModItems.KILLIUM_INGOT), has(ModItems.KILLIUM_INGOT))
                        .group("killium")
                        .define('S', Items.STICK)
                        .save(output);

                //-----ruby------

                shaped(RecipeCategory.COMBAT, ModItems.RUBY_SWORD)
                        .pattern(" L ")
                        .pattern(" L ")
                        .pattern(" S ")
                        .define('L', ModItems.RUBY)
                        .unlockedBy(getHasName(ModItems.RUBY), has(ModItems.RUBY))
                        .group("ruby")
                        .define('S', Items.STICK)
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.RUBY_PICKAXE)
                        .pattern("LLL")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('L', ModItems.RUBY)
                        .unlockedBy(getHasName(ModItems.RUBY), has(ModItems.RUBY))
                        .group("ruby")
                        .define('S', Items.STICK)
                        .save(output);


                shaped(RecipeCategory.TOOLS, ModItems.RUBY_SHOVEL)
                        .pattern(" L ")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('L', ModItems.RUBY)
                        .unlockedBy(getHasName(ModItems.RUBY), has(ModItems.RUBY))
                        .group("ruby")
                        .define('S', Items.STICK)
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.RUBY_AXE)
                        .pattern(" LL")
                        .pattern(" SL")
                        .pattern(" S ")
                        .define('L', ModItems.RUBY)
                        .unlockedBy(getHasName(ModItems.RUBY), has(ModItems.RUBY))
                        .group("ruby")
                        .define('S', Items.STICK)
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.RUBY_HOE)
                        .pattern(" LL")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('L', ModItems.RUBY)
                        .unlockedBy(getHasName(ModItems.RUBY), has(ModItems.RUBY))
                        .group("ruby")
                        .define('S', Items.STICK)
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.RUBY_SPEAR)
                        .pattern("  L")
                        .pattern(" S ")
                        .pattern("S  ")
                        .define('L', ModItems.RUBY)
                        .unlockedBy(getHasName(ModItems.RUBY), has(ModItems.RUBY))
                        .group("ruby")
                        .define('S', Items.STICK)
                        .save(output);

                //-----titan------

                shaped(RecipeCategory.COMBAT, ModItems.TITAN_SWORD)
                        .pattern(" L ")
                        .pattern(" L ")
                        .pattern(" S ")
                        .define('L', ModItems.TITAN_INGOT)
                        .unlockedBy(getHasName(ModItems.TITAN_INGOT), has(ModItems.TITAN_INGOT))
                        .group("titan")
                        .define('S', Items.STICK)
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.TITAN_PICKAXE)
                        .pattern("LLL")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('L', ModItems.TITAN_INGOT)
                        .unlockedBy(getHasName(ModItems.TITAN_INGOT), has(ModItems.TITAN_INGOT))
                        .group("titan")
                        .define('S', Items.STICK)
                        .save(output);


                shaped(RecipeCategory.TOOLS, ModItems.TITAN_SHOVEL)
                        .pattern(" L ")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('L', ModItems.TITAN_INGOT)
                        .unlockedBy(getHasName(ModItems.TITAN_INGOT), has(ModItems.TITAN_INGOT))
                        .group("titan")
                        .define('S', Items.STICK)
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.TITAN_AXE)
                        .pattern(" LL")
                        .pattern(" SL")
                        .pattern(" S ")
                        .define('L', ModItems.TITAN_INGOT)
                        .unlockedBy(getHasName(ModItems.TITAN_INGOT), has(ModItems.TITAN_INGOT))
                        .group("titan")
                        .define('S', Items.STICK)
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.TITAN_HOE)
                        .pattern(" LL")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('L', ModItems.TITAN_INGOT)
                        .unlockedBy(getHasName(ModItems.TITAN_INGOT), has(ModItems.TITAN_INGOT))
                        .group("titan")
                        .define('S', Items.STICK)
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.TITAN_SPEAR)
                        .pattern("  L")
                        .pattern(" S ")
                        .pattern("S  ")
                        .define('L', ModItems.TITAN_INGOT)
                        .unlockedBy(getHasName(ModItems.TITAN_INGOT), has(ModItems.TITAN_INGOT))
                        .group("titan")
                        .define('S', Items.STICK)
                        .save(output);

                //-----vulkanit------

                shaped(RecipeCategory.COMBAT, ModItems.VULKANIT_SWORD)
                        .pattern(" L ")
                        .pattern(" L ")
                        .pattern(" S ")
                        .define('L', ModItems.VULKANIT_INGOT)
                        .unlockedBy(getHasName(ModItems.VULKANIT_INGOT), has(ModItems.VULKANIT_INGOT))
                        .group("vulkanit")
                        .define('S', Items.STICK)
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.VULKANIT_PICKAXE)
                        .pattern("LLL")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('L', ModItems.VULKANIT_INGOT)
                        .unlockedBy(getHasName(ModItems.VULKANIT_INGOT), has(ModItems.VULKANIT_INGOT))
                        .group("vulkanit")
                        .define('S', Items.STICK)
                        .save(output);


                shaped(RecipeCategory.TOOLS, ModItems.VULKANIT_SHOVEL)
                        .pattern(" L ")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('L', ModItems.VULKANIT_INGOT)
                        .unlockedBy(getHasName(ModItems.VULKANIT_INGOT), has(ModItems.VULKANIT_INGOT))
                        .group("vulkanit")
                        .define('S', Items.STICK)
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.VULKANIT_AXE)
                        .pattern(" LL")
                        .pattern(" SL")
                        .pattern(" S ")
                        .define('L', ModItems.VULKANIT_INGOT)
                        .unlockedBy(getHasName(ModItems.VULKANIT_INGOT), has(ModItems.VULKANIT_INGOT))
                        .group("vulkanit")
                        .define('S', Items.STICK)
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.VULKANIT_HOE)
                        .pattern(" LL")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('L', ModItems.VULKANIT_INGOT)
                        .unlockedBy(getHasName(ModItems.VULKANIT_INGOT), has(ModItems.VULKANIT_INGOT))
                        .group("vulkanit")
                        .define('S', Items.STICK)
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.VULKANIT_SPEAR)
                        .pattern("  L")
                        .pattern(" S ")
                        .pattern("S  ")
                        .define('L', ModItems.VULKANIT_INGOT)
                        .unlockedBy(getHasName(ModItems.VULKANIT_INGOT), has(ModItems.VULKANIT_INGOT))
                        .group("vulkanit")
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
