package ru.mrtenfan.travicraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemMultiTexture;
import net.minecraft.item.ItemStack;

public class ItemMultiBlock extends ItemMultiTexture {

    public ItemMultiBlock(Block block) {
        super(block, block, MultiBlock.metadata);
    }
    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return "tile." + MultiBlock.metadata[stack.getItemDamage()];
    }
}
