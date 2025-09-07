package com.MasyumaroGames.MasyuMod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class BlockMasyuOre extends Block {
    public BlockMasyuOre() {
        super(Properties.of()
                .strength(3.0F,10.0F)
                .requiresCorrectToolForDrops()
                .sound(SoundType.NETHER_ORE)
        );
    }
}
