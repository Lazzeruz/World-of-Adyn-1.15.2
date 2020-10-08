package com.lazzeruz.worldofadyn;


import com.lazzeruz.worldofadyn.init.BiomeInit;
import com.lazzeruz.worldofadyn.init.DimensionInit;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

@Mod("worldofadyn")
@Mod.EventBusSubscriber(modid = WorldOfAdyn.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class WorldOfAdyn
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "worldofadyn";
    public static WorldOfAdyn instance;

    public static final ResourceLocation WORLD_OF_ADYN_DIM_TYPE = new ResourceLocation(MOD_ID, "adyn");

    public WorldOfAdyn() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        BiomeInit.BIOMES.register(modEventBus);
        DimensionInit.MOD_DIMENSIONS.register(modEventBus);

        instance = this;
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }

    @SubscribeEvent
    public static void onRegisterBiomes(final RegistryEvent.Register<Biome> event) {
        BiomeInit.RegisterBiomes();
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {

    }
}
