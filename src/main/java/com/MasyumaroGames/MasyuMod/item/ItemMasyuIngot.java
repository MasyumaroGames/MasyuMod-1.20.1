package com.MasyumaroGames.MasyuMod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class ItemMasyuIngot extends Item {
    public ItemMasyuIngot() {
        super(new Properties()
                .fireResistant()
                .rarity(Rarity.RARE)
                .stacksTo(64)
        );
    }
}
