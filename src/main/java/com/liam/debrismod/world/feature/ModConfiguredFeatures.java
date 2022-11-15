package com.liam.debrismod.world.feature;

import com.google.common.base.Suppliers;
import com.liam.debrismod.DebrisMod;
import com.liam.debrismod.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;


public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?,?>> CONFIGURED_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, DebrisMod.MODID);
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_SIMPLE_ANCIENT_DEBRIS = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.f_195072_, ModBlocks.SIMPLE_ANCIENT_DEBRIS.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_WET_ANCIENT_DEBRIS = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.f_195072_, ModBlocks.WET_ANCIENT_DEBRIS.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_DARK_ANCIENT_DEBRIS = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.f_195073_, ModBlocks.DARK_ANCIENT_DEBRIS.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_COSMIC_ANCIENT_DEBRIS = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.COSMIC_ANCIENT_DEBRIS.get().defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?,?>> SIMPLE_ANCIENT_DEBRIS = CONFIGURED_FEATURES.register("simple_ancient_debris", ()-> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_SIMPLE_ANCIENT_DEBRIS.get(),10)));
    public static final RegistryObject<ConfiguredFeature<?,?>> WET_ANCIENT_DEBRIS = CONFIGURED_FEATURES.register("wet_ancient_debris", ()-> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_WET_ANCIENT_DEBRIS.get(),3)));
    public static final RegistryObject<ConfiguredFeature<?,?>> DARK_ANCIENT_DEBRIS = CONFIGURED_FEATURES.register("dark_ancient_debris", ()-> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_DARK_ANCIENT_DEBRIS.get(),3)));
    public static final RegistryObject<ConfiguredFeature<?,?>> COSMIC_ANCIENT_DEBRIS = CONFIGURED_FEATURES.register("cosmic_ancient_debris", ()-> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_COSMIC_ANCIENT_DEBRIS.get(),3)));
    public static void register(IEventBus eventBus){
        CONFIGURED_FEATURES.register(eventBus);
    }
}
