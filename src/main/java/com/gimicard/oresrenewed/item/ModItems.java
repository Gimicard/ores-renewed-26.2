package com.gimicard.oresrenewed.item;

import com.gimicard.oresrenewed.OresRenewed;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;

import java.util.function.Function;

public class ModItems {

    public static final Item RAW_URAN = registerItem("raw_uran", Item::new);
    public static final Item RAW_TITAN = registerItem("raw_titan", Item::new);
    public static final Item RAW_VULKANIT = registerItem("raw_vulkanit", Item::new);
    public static final Item RAW_MAGNETIT = registerItem("raw_magnetit", Item::new);
    public static final Item RAW_KILLIUM = registerItem("raw_killium", Item::new);
    public static final Item RAW_LEAD = registerItem("raw_lead", Item::new);

    public static final Item URAN_INGOT = registerItem("uran_ingot", Item::new);
    public static final Item TITAN_INGOT = registerItem("titan_ingot", Item::new);
    public static final Item VULKANIT_INGOT = registerItem("vulkanit_ingot", Item::new);
    public static final Item MAGNETIT_INGOT = registerItem("magnetit_ingot", Item::new);
    public static final Item KILLIUM_INGOT = registerItem("killium_ingot", Item::new);
    public static final Item LEAD_INGOT = registerItem("lead_ingot", Item::new);

    public static final Item RUBY = registerItem("ruby", Item::new);
    public static final Item BLACKCRISTAL = registerItem("blackcristal", Item::new);

    public static final Item VULKANIT_SWORT = registerItem("vulkanit_sword", properties -> new Item(properties.sword(ModToolMaterials.VULKANIT, 3, -2.4f)));
    public static final Item VULKANIT_PICKAXE = registerItem("vulkanit_pickaxe", properties -> new Item(properties.pickaxe(ModToolMaterials.VULKANIT, 1, -2.8f)));
    public static final Item VULKANIT_SHOVEL = registerItem("vulkanit_shovel", properties -> new ShovelItem(ModToolMaterials.VULKANIT, 1.5f, -3f,properties));
    public static final Item VULKANIT_AXE = registerItem("vulkanit_axe", properties -> new AxeItem(ModToolMaterials.VULKANIT, 6f, -3.2f,properties));
    public static final Item VULKANIT_HOE = registerItem("vulkanit_hoe", properties -> new HoeItem(ModToolMaterials.VULKANIT, 0f, -3f,properties));
    public static final Item VULKANIT_SPEAR = registerItem("vulkanit_spear", properties -> new Item(properties.spear(ModToolMaterials.VULKANIT, 1.05F, 1.075F, 0.5F, 3.0F, 10.0F, 6.5F, 5.1F, 10.0F, 4.6F)));

    public static final Item LEAD_PICKAXE = registerItem("lead_pickaxe", properties -> new Item(properties.pickaxe(ModToolMaterials.VULKANIT, 1, -2.8f)));



    public static ResourceKey<Item> getRK(Item item){
        return BuiltInRegistries.ITEM.getResourceKey(item).get();    }


    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, name)))));
    }

    public static void registerItems() {
        OresRenewed.LOGGER.info("Registering ModItems for " + OresRenewed.MOD_ID);
    }
}