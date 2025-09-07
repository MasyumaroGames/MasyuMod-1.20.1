package com.MasyumaroGames.MasyuMod.regi.tab;

import com.MasyumaroGames.MasyuMod.main.MasyuMod;
import com.MasyumaroGames.MasyuMod.regi.MasyuModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class MasyuModTabs {

    public static final DeferredRegister<CreativeModeTab> MOD_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MasyuMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MASYU_MAIN = MOD_TABS.register("masyu_main",
            () -> {
                return CreativeModeTab.builder()
                        .icon(() -> new ItemStack(MasyuModItems.MASYU_INGOT.get()))
                        .title(Component.translatable("itemGroup.masyu_main"))
                        .displayItems((param, output) -> {
                            for (Item item : MasyuMain.items) {
                                output.accept(item);
                            }
                        })
                        .build();
            });
}
