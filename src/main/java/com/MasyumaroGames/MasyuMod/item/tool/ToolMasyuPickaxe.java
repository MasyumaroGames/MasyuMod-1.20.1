package com.MasyumaroGames.MasyuMod.item.tool;

import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tier;

public class ToolMasyuPickaxe extends PickaxeItem {

    public ToolMasyuPickaxe() {
        super(MasyuModTiers.MASYU, 1, -2.8F, new Properties().fireResistant().rarity(Rarity.RARE));
    }
}
