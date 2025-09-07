package com.MasyumaroGames.MasyuMod.regi;

import com.MasyumaroGames.MasyuMod.item.ItemCombineIngot;
import com.MasyumaroGames.MasyuMod.item.ItemMasyuIngot;
import com.MasyumaroGames.MasyuMod.item.ItemMasyuOre;
import com.MasyumaroGames.MasyuMod.item.tool.*;
import com.MasyumaroGames.MasyuMod.main.MasyuMod;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MasyuModItems {

    //鉱石系
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MasyuMod.MOD_ID);

    public static final RegistryObject<Item> MASYU_ORE = ITEMS.register("masyu_ore", ItemMasyuOre::new);

    public static final RegistryObject<Item> MASYU_INGOT = ITEMS.register("masyu_ingot", ItemMasyuIngot::new);

    public static final RegistryObject<Item> COMBINE_INGOT = ITEMS.register("combine_ingot", ItemCombineIngot::new);

    //ツール系
    public static final RegistryObject<AxeItem> MASYU_AXE = ITEMS.register("masyu_axe", ToolMasyuAxe::new);

    public static final RegistryObject<PickaxeItem> MASYU_PICKAXE = ITEMS.register("masyu_pickaxe", ToolMasyuPickaxe::new);

    public static final RegistryObject<SwordItem> MASYU_SWORD = ITEMS.register("masyu_sword", ToolMasyuSword::new);

    public static final RegistryObject<ShovelItem> MASYU_SHOVEL = ITEMS.register("masyu_shovel", ToolMasyuShovel::new);

    public static final RegistryObject<HoeItem> MASYU_HOE = ITEMS.register("masyu_hoe", ToolMasyuHoe::new);
}
