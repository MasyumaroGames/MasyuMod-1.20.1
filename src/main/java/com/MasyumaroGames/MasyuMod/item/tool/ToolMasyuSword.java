package com.MasyumaroGames.MasyuMod.item.tool;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class ToolMasyuSword extends SwordItem {
    public ToolMasyuSword() {
        super(MasyuModTiers.MASYU, 3, -2.4F, new Properties().fireResistant().rarity(Rarity.RARE));
    }
}
