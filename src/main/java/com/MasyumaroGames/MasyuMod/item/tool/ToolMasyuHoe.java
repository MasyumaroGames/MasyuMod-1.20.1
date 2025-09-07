package com.MasyumaroGames.MasyuMod.item.tool;

import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tier;

public class ToolMasyuHoe extends HoeItem {
    public ToolMasyuHoe() {
        super(MasyuModTiers.MASYU, 1, -2.8F, new Properties().fireResistant().rarity(Rarity.RARE));
    }
}
