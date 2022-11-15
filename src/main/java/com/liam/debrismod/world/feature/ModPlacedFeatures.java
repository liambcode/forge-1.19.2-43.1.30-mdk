package com.liam.debrismod.world.feature;

import com.liam.debrismod.DebrisMod;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.f_194567_, DebrisMod.MODID);

    public static final RegistryObject<PlacedFeature> SIMPLE_ANCIENT_DEBRIS_PLACED = PLACED_FEATURES.register("simple_ancient_debris_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.SIMPLE_ANCIENT_DEBRIS.getHolder().get(),
                    m_195343_(100, // VeinsPerChunk
                            HeightRangePlacement.m_191692_(VerticalAnchor.absolute(70), VerticalAnchor.absolute(0)))));
    public static final RegistryObject<PlacedFeature> WET_ANCIENT_DEBRIS_PLACED = PLACED_FEATURES.register("wet_ancient_debris_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.WET_ANCIENT_DEBRIS.getHolder().get(),
                    m_195349_(2, // VeinsPerChunk
                            HeightRangePlacement.m_191692_(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> COSMIC_ANCIENT_DEBRIS_PLACED = PLACED_FEATURES.register("cosmic_ancient_debris_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.COSMIC_ANCIENT_DEBRIS.getHolder().get(),
                    m_195349_(2, // VeinsPerChunk
                            HeightRangePlacement.m_191692_(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> DARK_ANCIENT_DEBRIS_PLACED = PLACED_FEATURES.register("dark_ancient_debris_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.DARK_ANCIENT_DEBRIS.getHolder().get(),
                    m_195349_(1, // VeinsPerChunk
                            HeightRangePlacement.m_191692_(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    private static List<PlacementModifier> m_195346_(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.m_191715_(), p_195348_, BiomeFilter.m_191561_());
    }

    private static List<PlacementModifier> m_195343_(int p_195344_, PlacementModifier p_195345_) {
        return m_195346_(CountPlacement.m_191628_(p_195344_), p_195345_);
    }

    private static List<PlacementModifier> m_195349_(int p_195350_, PlacementModifier p_195351_) {
        return m_195346_(RarityFilter.m_191900_(p_195350_), p_195351_);
    }
    public static void register(IEventBus eventBus){
        PLACED_FEATURES.register(eventBus);
    }
}
