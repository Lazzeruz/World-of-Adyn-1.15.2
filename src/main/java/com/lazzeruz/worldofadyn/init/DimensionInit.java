package com.lazzeruz.worldofadyn.init;

import com.lazzeruz.worldofadyn.WorldOfAdyn;
import com.lazzeruz.worldofadyn.world.dimension.WorldOfAdynDimension;
import net.minecraftforge.common.ModDimension;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DimensionInit {
    public static final DeferredRegister<ModDimension> MOD_DIMENSIONS = new DeferredRegister<>(ForgeRegistries.MOD_DIMENSIONS, WorldOfAdyn.MOD_ID);

    public static final RegistryObject<ModDimension> ADYN_DIMENSION = MOD_DIMENSIONS.register("adyn_dim", () -> new WorldOfAdynDimension());
}
