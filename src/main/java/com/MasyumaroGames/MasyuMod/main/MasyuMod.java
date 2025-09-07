package com.MasyumaroGames.MasyuMod.main;

import com.MasyumaroGames.MasyuMod.regi.MasyuModBlocks;
import com.MasyumaroGames.MasyuMod.regi.MasyuModItems;
import com.MasyumaroGames.MasyuMod.regi.tab.MasyuModTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("masyumod")
public class MasyuMod {

    public static final String MOD_ID = "masyumod";

    public MasyuMod(){

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        MasyuModItems.ITEMS.register(bus);
        MasyuModBlocks.Blocks.BLOCKS.register(bus);
        MasyuModBlocks.BlockItems.BLOCK_ITEMS.register(bus);
        MasyuModTabs.MOD_TABS.register(bus);
    }
}
