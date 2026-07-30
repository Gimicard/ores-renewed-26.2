package com.gimicard.oresrenewed.registries;

import com.gimicard.oresrenewed.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelValueEvents;

public class ModFuels {
    public static void registerFuels() {
        FuelValueEvents.BUILD.register((builder, context) -> {
            builder.add(ModItems.URAN_FUEL_ROD, 200*64*2);
        });
    }
}
