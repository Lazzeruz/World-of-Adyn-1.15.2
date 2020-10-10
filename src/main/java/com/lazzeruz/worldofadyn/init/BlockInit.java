package com.lazzeruz.worldofadyn.init;

import com.lazzeruz.worldofadyn.WorldOfAdyn;
import com.lazzeruz.worldofadyn.objects.blocks.BlockBase;
import net.minecraft.block.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, WorldOfAdyn.MOD_ID);

    public static final RegistryObject<Block> MISTWOOD_PLANKS = BLOCKS.register("mistwood_planks", BlockBase.PlanksBase::new);
    public static final RegistryObject<Block> MISTWOOD_LOG = BLOCKS.register("mistwood_log", BlockBase.LogBase::new);
    public static final RegistryObject<Block> MISTWOOD_LEAVES = BLOCKS.register("mistwood_leaves", BlockBase.LeavesBase::new);
    //public static final RegistryObject<Block> MISTWOOD_SAPLING = BLOCKS.register("mistwood_sapling", () -> new BlockBase.SaplingBase(new MistwoodTree()));
}
