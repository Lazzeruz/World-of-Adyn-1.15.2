package com.lazzeruz.worldofadyn.world.biomes;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;

public class MushroomForestBiome extends Biome {

    public MushroomForestBiome(Builder biomeBuilder) {
        super(biomeBuilder);
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.MOOSHROOM, 10, 2, 5));
    }


}
