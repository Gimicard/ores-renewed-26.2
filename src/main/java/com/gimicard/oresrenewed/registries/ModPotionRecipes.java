package com.gimicard.oresrenewed.registries;

import com.gimicard.oresrenewed.item.ModItems;
import com.gimicard.oresrenewed.potion.ModPotions;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.registry.FabricPotionBrewingBuilder;
import net.minecraft.client.color.item.Potion;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.crafting.Ingredient;

public class ModPotionRecipes {
    public static void registerPotionRecipes() {
        FabricPotionBrewingBuilder.BUILD.register(builder -> {
            builder.registerPotionRecipe(Potions.AWKWARD, Ingredient.of(ModItems.URAN_INGOT), ModPotions.IRRADIANT_POTION);
        });
    }
}
