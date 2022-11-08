package com.liam.debrismod.block;

import com.liam.debrismod.DebrisMod;
import com.liam.debrismod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DebrisMod.MODID);
    public static final RegistryObject<Block> MALAKARITE_BLOCK =registerblock("malakarite_block",()-> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(50f, 1200f).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MATERIALS);
    public static final RegistryObject<Block> AQUARITE_BLOCK =registerblock("aquarite_block",()-> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(50f, 1200f).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MATERIALS);
    public static final RegistryObject<Block> ENDERITE_BLOCK =registerblock("enderite_block",()-> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(50f, 1200f).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MATERIALS);
    public static final RegistryObject<Block> ECHORITE_BLOCK =registerblock("echorite_block",()-> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(50f, 1200f).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MATERIALS);
    public static final RegistryObject<Block> SIMPLE_ANCIENT_DEBRIS =registerblock("simple_ancient_debris",()-> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(50f, 1200f).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MATERIALS);
    public static final RegistryObject<Block> WET_ANCIENT_DEBRIS =registerblock("wet_ancient_debris",()-> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(50f, 1200f).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MATERIALS);
    public static final RegistryObject<Block> COSMIC_ANCIENT_DEBRIS =registerblock("cosmic_ancient_debris",()-> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(50f, 1200f).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MATERIALS);
    public static final RegistryObject<Block> DARK_ANCIENT_DEBRIS =registerblock("dark_ancient_debris",()-> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(50f, 1200f).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MATERIALS);
    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name,()-> new BlockItem(block.get(),new Item.Properties().tab(tab)));
    }
    private static <T extends Block>RegistryObject<T> registerblock(String name, Supplier<T> block, CreativeModeTab tab){
       RegistryObject<T> toReturn = BLOCKS.register(name,block);
       registerBlockItem(name,toReturn,tab);
        return toReturn;
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
