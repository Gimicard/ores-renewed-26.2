package com.gimicard.oresrenewed.block;


import com.gimicard.oresrenewed.OresRenewed;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class ModBlocks {
    public static final Block URAN_ORE_BLOCK = registerBlock("uran_ore_block",
            properties -> new Block(properties.strength(4F)
                    .requiresCorrectToolForDrops().sound(SoundType.ANVIL)));


    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> funktion) {
        Block toRegister = funktion.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, name))));
        Block registeredBlock = Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, name), toRegister);

        registerBlockItem(name, registeredBlock);

        return registeredBlock;
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, name)))));
    }

    public static void registerBlocks() {
        OresRenewed.LOGGER.info("Registering Mod Blocks for " + OresRenewed.MOD_ID);

    }
}