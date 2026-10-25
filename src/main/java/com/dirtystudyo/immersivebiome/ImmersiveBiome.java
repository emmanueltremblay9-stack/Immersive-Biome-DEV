package com.dirtystudyo.immersivebiome;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

/**
 * Initial registration point only.
 * No biome/worldgen/region physics or persistence is implemented here.
 */
@Mod(ImmersiveBiome.MOD_ID)
public final class ImmersiveBiome {
    public static final String MOD_ID = "immersive_biome";

    public ImmersiveBiome(IEventBus modEventBus) {
        // Intentionally empty until a bounded, approved feature is ready.
    }
}
