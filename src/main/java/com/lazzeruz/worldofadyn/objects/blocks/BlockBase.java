package com.lazzeruz.worldofadyn.objects.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

import java.util.Random;

public class BlockBase extends Block {


    public BlockBase(Properties properties) {
        super(properties);
    }

    public static class LeavesBase extends LeavesBlock {
        public LeavesBase() {
            super(Properties.from(Blocks.OAK_LEAVES)
            );
        }
    }

    public static class LogBase extends LogBlock {
        public LogBase() {
            super(MaterialColor.WOOD,Properties.from(Blocks.OAK_LOG)

            );
        }
    }

    public static class PlanksBase extends Block {
        public PlanksBase() {
            super(Properties.from(Blocks.OAK_PLANKS)
            );
        }
    }

    public static class SaplingBase extends SaplingBlock {
        public SaplingBase(Tree tree) {
            super(tree
            ,Properties.from(Blocks.OAK_SAPLING));

        }
    }
}
