package com.gimicard.oresrenewed.effect;

import com.gimicard.oresrenewed.OresRenewed;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

public class ModEffect {

    public static final Holder<MobEffect> IRRADIATED = register("irradiated",
            new irradiated(MobEffectCategory.HARMFUL, 0x4CAF1E));

    private static Holder<MobEffect> register(String name, MobEffect effect) {
        return Registry.registerForHolder(BuiltInRegistries.MOB_EFFECT,
                Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, name), effect);
    }

    public static void registerEffects() {
        OresRenewed.LOGGER.info("Registering ModEffects for " + OresRenewed.MOD_ID);
    }
}