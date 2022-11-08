package com.liam.debrismod.item;

import com.liam.debrismod.DebrisMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DebrisMod.MODID);
    public static final RegistryObject<Item> MALAKARITE_SCRAP = ITEMS.register("malakarite_scrap",()-> new Item((new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> MALAKARITE_INGOT = ITEMS.register("malakarite_ingot",()-> new Item((new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> AQURARITE_SCRAP = ITEMS.register("aquarite_scrap",()-> new Item((new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> AQUARITE_INGOT = ITEMS.register("aquarite_ingot",()-> new Item((new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> ECHORITE_SCRAP = ITEMS.register("echorite_scrap",()-> new Item((new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> ECHORITE_INGOT = ITEMS.register("echorite_ingot",()-> new Item((new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> ENDERITE_SCRAP = ITEMS.register("enderite_scrap",()-> new Item((new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> ENDERITE_INGOT = ITEMS.register("enderite_ingot",()-> new Item((new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
