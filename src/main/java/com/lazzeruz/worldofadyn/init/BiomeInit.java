package com.lazzeruz.worldofadyn.init;

import com.lazzeruz.worldofadyn.WorldOfAdyn;
import com.lazzeruz.worldofadyn.world.biomes.MushroomForestBiome;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeInit {
    public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES, WorldOfAdyn.MOD_ID);

    public static final RegistryObject<Biome> MUSHROOM_FOREST = BIOMES.register("mushroom_forest", () -> new MushroomForestBiome());

    public static void RegisterBiomes() {
        registerBiome(MUSHROOM_FOREST.get(), BiomeDictionary.Type.FOREST, BiomeDictionary.Type.OVERWORLD);
    }

    private static void registerBiome(Biome biome, BiomeDictionary.Type... types) {
        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addSpawnBiome(biome);

    }
}
