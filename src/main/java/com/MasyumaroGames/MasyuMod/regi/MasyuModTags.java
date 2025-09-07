package com.MasyumaroGames.MasyuMod.regi;

import com.MasyumaroGames.MasyuMod.main.MasyuMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class MasyuModTags {

    public static class Blocks{

        public static final TagKey<Block> NEEDS_MASYU_TOOL = tag("needs_masyu_tool");

        public static final TagKey<Block> NEEDS_COMBINE_TOOL = tag("needs_combine_tool");

        private static TagKey<Block> tag (String name){
            return BlockTags.create(new ResourceLocation(MasyuMod.MOD_ID,name));
        }
    }

    public static class Items{

        public static final TagKey<Item> MASYU_SERIES = tag("masyu_series");
        private static TagKey<Item> tag (String name){
            return ItemTags.create(new ResourceLocation(MasyuMod.MOD_ID,name));
        }
    }
}
