package ru.mrtenfan.travicraft.tools;

import net.minecraft.item.ItemAxe;
import ru.mrtenfan.travicraft.TraviCraftMain;

public class TraviAxe extends ItemAxe {
	
	public TraviAxe() {
		super(TraviCraftMain.TRAVI);
		this.setTextureName("travicraft:travi_axe");
		this.setUnlocalizedName("traviaxe");
		this.setCreativeTab(TraviCraftMain.tabTravi);
	}

}
