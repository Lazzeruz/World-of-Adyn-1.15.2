package com.lazzeruz.worldofadyn.init;

import com.lazzeruz.worldofadyn.WorldOfAdyn;
import com.lazzeruz.worldofadyn.world.biomes.MushroomForestBiome;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeInit {
    public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES, WorldOfAdyn.MOD_ID);

    public static final RegistryObject<Biome> MUSHROOM_FOREST_BIOME = BIOMES.register("mushroom_forest_biome", () -> new MushroomForestBiome(new Biome.Builder()));
}
