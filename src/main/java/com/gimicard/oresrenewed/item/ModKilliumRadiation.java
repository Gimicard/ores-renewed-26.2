package com.gimicard.oresrenewed.item;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Inventory;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ModKilliumRadiation {

    private static final int DEATH_SECONDS = 5; //secound intil death

    private static final int DEATH_TICKS = 20 * DEATH_SECONDS;

    private static final Map<UUID, Integer> exposureTicks = new HashMap<>();

    public static void register() {
        ServerTickEvents.END_SERVER_TICK.register(server -> {
            for (ServerPlayer player : server.getPlayerList().getPlayers()) {
                UUID id = player.getUUID();

                if (hasRawKillium(player.getInventory())) {
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

    private static boolean hasRawKillium(Inventory inventory) {
        for (int i = 0; i < inventory.getContainerSize(); i++) {
            if (inventory.getItem(i).is(ModItems.RAW_KILLIUM)) {
                return true;
            }
        }
        return false;
    }

}
