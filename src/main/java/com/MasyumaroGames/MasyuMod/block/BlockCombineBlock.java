package com.MasyumaroGames.MasyuMod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class BlockCombineBlock extends Block {
    public BlockCombineBlock() {
        super(Properties.of()
                .sound(SoundType.NETHERITE_BLOCK)
                .strength(4.0F,100.0F)
                .requiresCorrectToolForDrops()
        );
    }
}
