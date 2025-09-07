package com.MasyumaroGames.MasyuMod.item.tool;

import com.MasyumaroGames.MasyuMod.main.MasyuMod;
import com.MasyumaroGames.MasyuMod.regi.MasyuModItems;
import com.MasyumaroGames.MasyuMod.regi.MasyuModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class MasyuModTiers {

    public static final ForgeTier COMBINE = new ForgeTier(5,2300,8.0F,3.0F,12, MasyuModTags.Blocks.NEEDS_COMBINE_TOOL,()-> Ingredient.of(MasyuModItems.COMBINE_INGOT.get()));

    public static final ForgeTier MASYU = new ForgeTier(6,5000,20.0F,6.0F,22, MasyuModTags.Blocks.NEEDS_MASYU_TOOL,()-> Ingredient.of(MasyuModItems.MASYU_INGOT.get()));

    static {
        TierSortingRegistry.registerTier(MASYU,new ResourceLocation(MasyuMod.MOD_ID,"masyu"), List.of(Tiers.NETHERITE),List.of());
    }

    static {
        TierSortingRegistry.registerTier(COMBINE,new ResourceLocation(MasyuMod.MOD_ID,"combine"), List.of(Tiers.DIAMOND),List.of(Tiers.NETHERITE));
    }
}
