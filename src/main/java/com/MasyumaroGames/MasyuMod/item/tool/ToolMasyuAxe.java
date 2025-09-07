package com.MasyumaroGames.MasyuMod.item.tool;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tier;

public class ToolMasyuAxe extends AxeItem {
    public ToolMasyuAxe() {
        super(MasyuModTiers.MASYU, 1, -2.8F, new Properties().fireResistant().rarity(Rarity.RARE));
    }
}
