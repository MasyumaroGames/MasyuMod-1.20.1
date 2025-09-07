package com.MasyumaroGames.MasyuMod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class BlockMasyuBlock extends Block {
    public BlockMasyuBlock() {
        super(Properties.of()
                .strength(5.0F,1000.0F)
                .sound(SoundType.NETHERITE_BLOCK)
                .lightLevel((a) -> 1)
        );
    }
}
