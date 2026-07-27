package com.gimicard.oresrenewed.creativemodetab;


import com.gimicard.oresrenewed.item.ModItems;
import com.gimicard.oresrenewed.OresRenewed;
import com.gimicard.oresrenewed.block.ModBlocks;
import com.gimicard.oresrenewed.potion.ModPotions;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionContents;

public class ModCreativeModeTabs {


    public static final CreativeModeTab Ores = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "test.items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.URAN_ORE_BLOCK))
                    //.backgroundTexture(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "textures/item/fluorite.png"))         custon background
                    .title(Component.translatable("creativemodetab.oresrenewed.Ores"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.RAW_URAN);
                        output.accept(ModItems.RAW_TITAN);
                        output.accept(ModItems.RAW_VULKANIT);
                        output.accept(ModItems.RAW_MAGNETIT);
                        output.accept(ModItems.RAW_KILLIUM);
                        output.accept(ModItems.RAW_LEAD);
                        output.accept(ModItems.URAN_INGOT);
                        output.accept(ModItems.TITAN_INGOT);
                        output.accept(ModItems.VULKANIT_INGOT);
                        output.accept(ModItems.MAGNETIT_INGOT);
                        output.accept(ModItems.KILLIUM_INGOT);
                        output.accept(ModItems.LEAD_INGOT);
                        output.accept(ModItems.RUBY);
                        output.accept(ModItems.BLACKCRISTAL);

                        output.accept(ModItems.VULKANIT_SWORT);
                        output.accept(ModItems.VULKANIT_PICKAXE);
                        output.accept(ModItems.VULKANIT_SHOVEL);
                        output.accept(ModItems.VULKANIT_AXE);
                        output.accept(ModItems.VULKANIT_HOE);
                        output.accept(ModItems.VULKANIT_SPEAR);

                        output.accept(ModItems.LEAD_PICKAXE);

                        output.accept(ModBlocks.TITAN_ORE_BLOCK);
                        output.accept(ModBlocks.BLACKCRISTAL_ORE_BLOCK);
                        output.accept(ModBlocks.VULKANIT_ORE_BLOCK);
                        output.accept(ModBlocks.MAGNETIT_ORE_BLOCK);
                        output.accept(ModBlocks.KILLIUM_ORE_BLOCK);
                        output.accept(ModBlocks.LEAD_ORE_BLOCK);
                        output.accept(ModBlocks.RUBY_ORE_BLOCK);
                        output.accept(ModBlocks.URAN_ORE_BLOCK);

                        output.accept(ModBlocks.DEEPSLATE_TITAN_ORE_BLOCK);
                        output.accept(ModBlocks.DEEPSLATE_BLACKCRISTAL_ORE_BLOCK);
                        output.accept(ModBlocks.DEEPSLATE_VULKANIT_ORE_BLOCK);
                        output.accept(ModBlocks.DEEPSLATE_MAGNETIT_ORE_BLOCK);
                        output.accept(ModBlocks.DEEPSLATE_KILLIUM_ORE_BLOCK);
                        output.accept(ModBlocks.DEEPSLATE_LEAD_ORE_BLOCK);
                        output.accept(ModBlocks.DEEPSLATE_RUBY_ORE_BLOCK);
                        output.accept(ModBlocks.DEEPSLATE_URAN_ORE_BLOCK);

                        output.accept(ModBlocks.BLOCK_OF_TITAN);
                        output.accept(ModBlocks.BLOCK_OF_BLACKCRISTAL);
                        output.accept(ModBlocks.BLOCK_OF_VULKANIT);
                        output.accept(ModBlocks.BLOCK_OF_MAGNETIT);
                        output.accept(ModBlocks.BLOCK_OF_KILLIUM);
                        output.accept(ModBlocks.BLOCK_OF_LEAD);
                        output.accept(ModBlocks.BLOCK_OF_RUBY);
                        output.accept(ModBlocks.BLOCK_OF_URAN);

                        output.accept(PotionContents.createItemStack(Items.POTION, ModPotions.IRRADIANT_POTION));
                        output.accept(PotionContents.createItemStack(Items.SPLASH_POTION, ModPotions.IRRADIANT_POTION));
                        output.accept(PotionContents.createItemStack(Items.LINGERING_POTION, ModPotions.IRRADIANT_POTION));
                        output.accept(PotionContents.createItemStack(Items.TIPPED_ARROW, ModPotions.IRRADIANT_POTION));




                    }).build());


    public static void registerModCreativeTabs() {
        OresRenewed.LOGGER.info("Registering Mod Creative Tabs for " + OresRenewed.MOD_ID );

    }
}
