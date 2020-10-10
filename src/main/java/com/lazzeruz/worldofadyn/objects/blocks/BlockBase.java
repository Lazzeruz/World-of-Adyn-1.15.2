package com.lazzeruz.worldofadyn.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;

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

    public static class LogBase extends Block {
        public LogBase() {
            super(Properties.from(Blocks.OAK_LOG)

            );
        }
    }

    public static class PlanksBase extends Block {
        public PlanksBase() {
            super(Properties.from(Blocks.OAK_PLANKS)
            );
        }
    }

    public static class SaplingBase extends Block {
        public SaplingBase() {
            super(Properties.from(Blocks.OAK_SAPLING));

        }
    }
}
