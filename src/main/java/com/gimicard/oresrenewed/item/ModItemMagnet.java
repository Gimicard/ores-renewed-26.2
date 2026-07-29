package com.gimicard.oresrenewed.item;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

import java.util.List;

public class ModItemMagnet {

    private static final double RADIUS = 8.0;
    private static final double PULL_SPEED = 0.3;

    public static void register() {
        ServerTickEvents.END_SERVER_TICK.register(server -> {
            for (ServerPlayer player : server.getPlayerList().getPlayers()) {

                boolean hasMagnetPickaxe = player.getMainHandItem().is(ModItems.MAGNETIT_PICKAXE)
                        || player.getOffhandItem().is(ModItems.MAGNETIT_PICKAXE);

                if (!hasMagnetPickaxe) {
                    continue;
                }

                AABB searchBox = player.getBoundingBox().inflate(RADIUS);
                List<ItemEntity> nearbyItems = player.level().getEntitiesOfClass(ItemEntity.class, searchBox);

                for (ItemEntity itemEntity : nearbyItems) {
                    Vec3 direction = player.position().subtract(itemEntity.position()).normalize();
                    itemEntity.setDeltaMovement(itemEntity.getDeltaMovement().add(direction.scale(PULL_SPEED)));
                }
            }
        });
    }
}