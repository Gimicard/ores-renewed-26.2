package com.gimicard.oresrenewed.item;

import com.gimicard.oresrenewed.OresRenewed;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {

    public static final Item RAW_URAN = registerItem("raw_uran", Item::new);
    public static final Item RAW_TITAN = registerItem("raw_titan", Item::new);
    public static final Item RAW_VULKANIT = registerItem("raw_vulkanit", Item::new);
    public static final Item RAW_MAGNETIT = registerItem("raw_magnetit", Item::new);
    public static final Item RAW_KILLIUM = registerItem("raw_killium", Item::new);
    public static final Item RAW_LEAD = registerItem("raw_lead", Item::new);

    public static final Item RUBY = registerItem("ruby", Item::new);
    public static final Item BLACKCRISTAL = registerItem("blackcristal", Item::new);


    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, name)))));
    }

    public static void registerItems() {
        OresRenewed.LOGGER.info("Registering ModItems for " + OresRenewed.MOD_ID);
    }
}