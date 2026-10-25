package com.dirtystudyo.immersivebiome;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ModIdentityTest {
    @Test
    void modIdMatchesProposedMetadata() {
        assertEquals("immersive_biome", ImmersiveBiome.MOD_ID);
    }
}
