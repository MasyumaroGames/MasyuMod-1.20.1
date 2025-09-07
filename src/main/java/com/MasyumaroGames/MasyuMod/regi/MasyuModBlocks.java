package com.MasyumaroGames.MasyuMod.regi;

import com.MasyumaroGames.MasyuMod.block.BlockMasyuBlock;
import com.MasyumaroGames.MasyuMod.main.MasyuMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MasyuModBlocks {

    public static class Blocks{

        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MasyuMod.MOD_ID);

        public static final RegistryObject<Block> MASYU_BLOCK = BLOCKS.register("masyu_block", BlockMasyuBlock::new);

    }
    public static class BlockItems{

        public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MasyuMod.MOD_ID);

        public static final RegistryObject<Item> MASYU_BLOCK = BLOCK_ITEMS.register("masyu_block"
                , () -> new BlockItem(Blocks.MASYU_BLOCK.get(), new Item.Properties().fireResistant().rarity(Rarity.RARE)));
    }
}
