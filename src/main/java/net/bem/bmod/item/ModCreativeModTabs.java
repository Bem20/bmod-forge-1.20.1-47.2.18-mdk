package net.bem.bmod.item;

import net.bem.bmod.BMod;
import net.bem.bmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BMOD_TAB = CREATIVE_MODE_TABS.register("bmod_tab",()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.SAPPHIRE.get()))
            .title(Component.translatable("creativetab.bmod_tab"))
            .displayItems((pParameters, p0utput)->{
                p0utput.accept(ModItems.SAPPHIRE.get());
                p0utput.accept(ModItems.RAW_SAPPHIRE.get());
                //Bloques
                p0utput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                p0utput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
            })
            .build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
