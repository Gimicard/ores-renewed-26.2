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
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final Block TITAN_ORE_BLOCK = registerBlock("titan_ore_block",
            properties -> new Block(properties.strength(4F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final Block RUBY_ORE_BLOCK = registerBlock("ruby_ore_block",
            properties -> new Block(properties.strength(4F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final Block LEAD_ORE_BLOCK = registerBlock("lead_ore_block",
            properties -> new Block(properties.strength(4F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final Block KILLIUM_ORE_BLOCK = registerBlock("killium_ore_block",
            properties -> new Block(properties.strength(4F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final Block MAGNETITE_ORE_BLOCK = registerBlock("magnetite_ore_block",
            properties -> new Block(properties.strength(4F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final Block VULKANIT_ORE_BLOCK = registerBlock("vulkanit_ore_block",
            properties -> new Block(properties.strength(4F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final Block SCHATTENKRISTALL_ORE_BLOCK = registerBlock("schattenkristall_ore_block",
            properties -> new Block(properties.strength(4F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));



    public static final Block D_URAN_ORE_BLOCK = registerBlock("d_uran_ore_block",
            properties -> new Block(properties.strength(4F)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final Block D_TITAN_ORE_BLOCK = registerBlock("d_titan_ore_block",
            properties -> new Block(properties.strength(4F)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final Block D_RUBY_ORE_BLOCK = registerBlock("d_ruby_ore_block",
            properties -> new Block(properties.strength(4F)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final Block D_LEAD_ORE_BLOCK = registerBlock("d_lead_ore_block",
            properties -> new Block(properties.strength(4F)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final Block D_KILLIUM_ORE_BLOCK = registerBlock("d_killium_ore_block",
            properties -> new Block(properties.strength(4F)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final Block D_MAGNETITE_ORE_BLOCK = registerBlock("d_magnetite_ore_block",
            properties -> new Block(properties.strength(4F)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final Block D_VULKANIT_ORE_BLOCK = registerBlock("d_vulkanit_ore_block",
            properties -> new Block(properties.strength(4F)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final Block D_SCHATTENKRISTALL_ORE_BLOCK = registerBlock("d_schattenkristall_ore_block",
            properties -> new Block(properties.strength(4F)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));


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