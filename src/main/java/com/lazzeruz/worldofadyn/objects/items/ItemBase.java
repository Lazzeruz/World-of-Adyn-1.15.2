package com.lazzeruz.worldofadyn.objects.items;

import com.lazzeruz.worldofadyn.WorldOfAdyn;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase(Properties properties) {
        super(new Item.Properties().group(WorldOfAdyn.TAB));
    }

    public static class BlockItemBase extends BlockItem {

        public BlockItemBase(Block block) {
            super(block, new Item.Properties().group(WorldOfAdyn.TAB));
        }
    }

}
