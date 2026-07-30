package com.gimicard.oresrenewed.item;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModVulkanitFlame extends Item {

    int fire_sec = 4;

    public ModVulkanitFlame(Item.Properties properties) {
        super(properties);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        // Setzt das Ziel für 4 Sekunden in Brand
        target.igniteForSeconds(fire_sec);

        return super.hurtEnemy(stack, target, attacker);
    }
}