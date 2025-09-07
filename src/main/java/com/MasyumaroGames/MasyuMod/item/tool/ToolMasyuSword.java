package com.MasyumaroGames.MasyuMod.item.tool;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class ToolMasyuSword extends SwordItem {
    public ToolMasyuSword() {
        super(MasyuModTiers.MASYU, 1, -2.8F, new Properties().fireResistant().rarity(Rarity.RARE));
    }
}
