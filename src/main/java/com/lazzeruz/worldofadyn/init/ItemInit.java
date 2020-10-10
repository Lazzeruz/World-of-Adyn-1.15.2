package com.lazzeruz.worldofadyn.init;

import com.lazzeruz.worldofadyn.WorldOfAdyn;
import com.lazzeruz.worldofadyn.objects.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = WorldOfAdyn.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemInit
{
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, WorldOfAdyn.MOD_ID);


    //block items
    public static final RegistryObject<Item> MISTWOOD_PLANKS_ITEM = ITEMS.register("mistwood_planks", () -> new ItemBase.BlockItemBase(BlockInit.MISTWOOD_PLANKS.get()));
    public static final RegistryObject<Item> MISTWOOD_LOG_ITEM = ITEMS.register("mistwood_log", () -> new ItemBase.BlockItemBase(BlockInit.MISTWOOD_LOG.get()));
    public static final RegistryObject<Item> MISTWOOD_LEAVES_ITEM = ITEMS.register("mistwood_leaves", () -> new ItemBase.BlockItemBase(BlockInit.MISTWOOD_LEAVES.get()));
    public static final RegistryObject<Item> MISTWOOD_SAPLING_ITEM = ITEMS.register("mistwood_sapling", () -> new ItemBase.BlockItemBase(BlockInit.MISTWOOD_SAPLING.get()));
}
