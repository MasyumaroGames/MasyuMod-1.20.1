package com.MasyumaroGames.MasyuMod.item.tool;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tier;

public class ToolMasyuAxe extends AxeItem {
    public ToolMasyuAxe() {
        super(MasyuModTiers.MASYU, 5.0F, -3.0F, new Properties().fireResistant().rarity(Rarity.RARE));
    }
}
