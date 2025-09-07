package com.MasyumaroGames.MasyuMod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class ItemCombineIngot extends Item {
    public ItemCombineIngot() {
        super(new Properties()
                .fireResistant()
                .stacksTo(64)
                .rarity(Rarity.UNCOMMON)
        );
    }
}
