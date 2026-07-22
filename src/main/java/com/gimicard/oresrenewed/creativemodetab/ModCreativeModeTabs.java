package com.gimicard.oresrenewed.creativemodetab;


import com.gimicard.oresrenewed.item.ModItems;
import com.gimicard.oresrenewed.OresRenewed;
import com.gimicard.oresrenewed.block.ModBlocks;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {


    public static final CreativeModeTab Ores = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "test.items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.URAN_ORE_BLOCK))
                    //.backgroundTexture(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "textures/item/fluorite.png"))         custon background
                    .title(Component.translatable("creativemodetab.oresrenewed.Ores"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.RAW_URAN);
                        output.accept(ModBlocks.TITAN_ORE_BLOCK);
                        output.accept(ModBlocks.SCHATTENKRISTALL_ORE_BLOCK);
                        output.accept(ModBlocks.VULKANIT_ORE_BLOCK);
                        output.accept(ModBlocks.MAGNETITE_ORE_BLOCK);
                        output.accept(ModBlocks.KILLIUM_ORE_BLOCK);
                        output.accept(ModBlocks.LEAD_ORE_BLOCK);
                        output.accept(ModBlocks.RUBY_ORE_BLOCK);
                        output.accept(ModBlocks.URAN_ORE_BLOCK);
                        output.accept(ModBlocks.D_TITAN_ORE_BLOCK);
                        output.accept(ModBlocks.D_SCHATTENKRISTALL_ORE_BLOCK);
                        output.accept(ModBlocks.D_VULKANIT_ORE_BLOCK);
                        output.accept(ModBlocks.D_MAGNETITE_ORE_BLOCK);
                        output.accept(ModBlocks.D_KILLIUM_ORE_BLOCK);
                        output.accept(ModBlocks.D_LEAD_ORE_BLOCK);
                        output.accept(ModBlocks.D_RUBY_ORE_BLOCK);
                        output.accept(ModBlocks.D_URAN_ORE_BLOCK);
                    }).build());


    public static void registerModCreativeTabs() {
        OresRenewed.LOGGER.info("Registering Mod Creative Tabs for " + OresRenewed.MOD_ID );

    }
}
