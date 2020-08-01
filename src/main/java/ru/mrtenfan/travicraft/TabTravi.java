package ru.mrtenfan.travicraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ru.mrtenfan.travicraft.items.ItemInit;

public class TabTravi extends CreativeTabs {

	public TabTravi(String lable) {
		super(lable);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public Item getTabIconItem() {
		return getIconItemStack().getItem();
	}
	public ItemStack getIconItemStack() {
		return new ItemStack(ItemInit.multi_item, 1, 0);
	}

}
