package com.gimicard.oresrenewed.item;

import com.gimicard.oresrenewed.block.ModBlocks;
import com.gimicard.oresrenewed.effect.ModEffect;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.Item;

import java.util.Set;

public class ModUranRadiation {

    private static final int amp = 1;
    private static final int r_amp = amp -1;

    public static final int refresh = 5;


    private static final Set<Item> URAN_ITEMS = Set.of(
            ModItems.RAW_URAN,
            ModItems.URAN_INGOT,
            ModBlocks.URAN_ORE_BLOCK.asItem(),
            ModBlocks.DEEPSLATE_URAN_ORE_BLOCK.asItem(),
            ModBlocks.BLOCK_OF_URAN.asItem()
    );


    private static final int EFFECT_REFRESH_DURATION = 20 * refresh;

    public static void register() {
        ServerTickEvents.END_SERVER_TICK.register(server -> {
            for (ServerPlayer player : server.getPlayerList().getPlayers()) {

                if (hasUranItem(player.getInventory())) {
                    player.addEffect(new MobEffectInstance(ModEffect.IRRADIATED, EFFECT_REFRESH_DURATION, r_amp));
                }


            }
        });
    }

    private static boolean hasUranItem(Inventory inventory) {
        for (int i = 0; i < inventory.getContainerSize(); i++) {
            if (URAN_ITEMS.contains(inventory.getItem(i).getItem())) {
                return true;
            }
        }
        return false;
    }
}