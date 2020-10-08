package com.lazzeruz.worldofadyn.util;

import com.lazzeruz.worldofadyn.WorldOfAdyn;
import com.lazzeruz.worldofadyn.init.DimensionInit;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.world.RegisterDimensionsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = WorldOfAdyn.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ForgeEventBusSubscriber {

    @SubscribeEvent
    public static void registerDimensions(final RegisterDimensionsEvent event) {
        if(DimensionType.byName(WorldOfAdyn.WORLD_OF_ADYN_DIM_TYPE) == null){
        DimensionManager.registerDimension(WorldOfAdyn.WORLD_OF_ADYN_DIM_TYPE, DimensionInit.ADYN_DIMENSION.get(), null, true);
        }
    }
}
