package ru.mrtenfan.travicraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemMultiTexture;
import net.minecraft.item.ItemStack;

public class ItemMultiOre extends ItemMultiTexture {

    public ItemMultiOre(Block block) {
        super(block, block, MultiOre.metadata);
    }
    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return "tile." + MultiOre.metadata[stack.getItemDamage()];
    }
}
