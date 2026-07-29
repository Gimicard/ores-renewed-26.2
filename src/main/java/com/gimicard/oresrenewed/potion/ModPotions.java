package com.gimicard.oresrenewed.potion;


import com.gimicard.oresrenewed.OresRenewed;
import com.gimicard.oresrenewed.effect.ModEffect;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;

public class ModPotions {

    public static final Holder<Potion> IRRADIANT_POTION =registerPotion("irradiant_potion",
            new Potion("irradiant_potion", new MobEffectInstance(ModEffect.IRRADIATED, 1200, 0)));




    private static Holder<Potion> registerPotion(String name, Potion potion) {
        return Registry.registerForHolder(BuiltInRegistries.POTION, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, name), potion);
    }

    public static void registerPotions() {
        OresRenewed.LOGGER.info("Registering Potons Blocks for " + OresRenewed.MOD_ID);

    }
}
