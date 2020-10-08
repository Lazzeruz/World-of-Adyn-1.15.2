package com.lazzeruz.worldofadyn.world.dimension;

import com.google.common.collect.ImmutableSet;
import com.lazzeruz.worldofadyn.init.BiomeInit;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.provider.BiomeProvider;

import java.util.Random;
import java.util.Set;

public class WorldOfAdynBiomeProvider extends BiomeProvider {

    private Random rand;

    public WorldOfAdynBiomeProvider() {
        super(biomeList);
        rand = new Random();
    }

private static final Set<Biome> biomeList = ImmutableSet.of(BiomeInit.MUSHROOM_FOREST.get());

    @Override
    public Biome getNoiseBiome(int x, int y, int z) {
    return BiomeInit.MUSHROOM_FOREST.get();
    }
}
