package com.gimicard.oresrenewed.item;

import com.gimicard.oresrenewed.block.ModBlocks;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.Item;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class ModKilliumRadiation {

    private static final int DEATH_SECONDS = 5; //secound intil death

    private static final int DEATH_TICKS = 20 * DEATH_SECONDS;

    private static final Set<Item> RADIOACTIVE_ITEMS = Set.of(
            ModItems.RAW_KILLIUM,
            ModItems.KILLIUM_INGOT,
            ModBlocks.KILLIUM_ORE_BLOCK.asItem(),
            ModBlocks.DEEPSLATE_KILLIUM_ORE_BLOCK.asItem(),
            ModBlocks.BLOCK_OF_KILLIUM.asItem()
    );

    private static final Map<UUID, Integer> exposureTicks = new HashMap<>();

    public static void register() {
        ServerTickEvents.END_SERVER_TICK.register(server -> {
            for (ServerPlayer player : server.getPlayerList().getPlayers()) {
                UUID id = player.getUUID();

                if (hasRadioactiveItem(player.getInventory())) {
                    int ticks = exposureTicks.merge(id, 1, Integer::sum);

                    if (ticks >= DEATH_TICKS) {
                        player.hurtServer((ServerLevel) player.level(), player.damageSources().magic(), Float.MAX_VALUE);
                        exposureTicks.remove(id);
                    }
                } else {

                    exposureTicks.remove(id);
                }
            }
        });
    }

    private static boolean hasRadioactiveItem(Inventory inventory) {
        for (int i = 0; i < inventory.getContainerSize(); i++) {
            if (RADIOACTIVE_ITEMS.contains(inventory.getItem(i).getItem())) {
                return true;
            }
        }
        return false;
    }
}