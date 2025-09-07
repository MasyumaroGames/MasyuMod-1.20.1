package com.MasyumaroGames.MasyuMod.item.tool;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;

public class ToolMasyuShovel extends ShovelItem {
    public ToolMasyuShovel() {
        super(MasyuModTiers.MASYU, 1.5F, -3.0F, new Properties().fireResistant().rarity(Rarity.RARE));
    }
}
