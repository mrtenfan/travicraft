package ru.mrtenfan.travicraft.tools;

import net.minecraft.item.ItemHoe;
import ru.mrtenfan.travicraft.TraviCraftMain;

public class TraviHoe extends ItemHoe {
	
	public TraviHoe() {
		super(TraviCraftMain.TRAVI);
		this.setTextureName("travicraft:travi_hoe");
		this.setUnlocalizedName("travihoe");
		this.setCreativeTab(TraviCraftMain.tabTravi);
	}

}
