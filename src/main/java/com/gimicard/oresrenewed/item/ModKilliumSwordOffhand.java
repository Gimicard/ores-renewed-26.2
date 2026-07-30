package com.gimicard.oresrenewed.item;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ModKilliumSwordOffhand {

    public static int death_sec = 2;


    private static final int DEATH_TICKS = death_sec * 20;


    private static final Map<UUID, Integer> offhandTicks = new HashMap<>();

    public static void register() {
        ServerTickEvents.END_SERVER_TICK.register(server -> {
            for (ServerPlayer player : server.getPlayerList().getPlayers()) {
                UUID id = player.getUUID();

                boolean hasKilliumSwordInOffhand =player.getMainHandItem().is(ModItems.KILLIUM_SWORT) ||
                        player.getOffhandItem().is(ModItems.KILLIUM_SWORT);

                if (hasKilliumSwordInOffhand) {
                    int ticks = offhandTicks.merge(id, 1, Integer::sum);

                    if (ticks >= DEATH_TICKS) {
                        player.hurtServer((ServerLevel) player.level(), player.damageSources().magic(), Float.MAX_VALUE);
                        offhandTicks.remove(id);
                    }
                } else {

                    offhandTicks.remove(id);
                }
            }
        });
    }
}