package com.MasyumaroGames.MasyuMod.regi;

import com.MasyumaroGames.MasyuMod.item.ItemCombineIngot;
import com.MasyumaroGames.MasyuMod.item.ItemMasyuIngot;
import com.MasyumaroGames.MasyuMod.item.ItemMasyuOre;
import com.MasyumaroGames.MasyuMod.main.MasyuMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MasyuModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MasyuMod.MOD_ID);

    public static final RegistryObject<Item> MASYU_ORE = ITEMS.register("masyu_ore", ItemMasyuOre::new);

    public static final RegistryObject<Item> MASYU_INGOT = ITEMS.register("masyu_ingot", ItemMasyuIngot::new);

    public static final RegistryObject<Item> COMBINE_INGOT = ITEMS.register("combine_ingot", ItemCombineIngot::new);
}
