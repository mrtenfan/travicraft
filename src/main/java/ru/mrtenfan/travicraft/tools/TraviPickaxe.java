package ru.mrtenfan.travicraft.tools;

import net.minecraft.item.ItemPickaxe;
import ru.mrtenfan.travicraft.TraviCraftMain;

public class TraviPickaxe extends ItemPickaxe {
	
	public TraviPickaxe() {
		super(TraviCraftMain.TRAVI);
		this.setTextureName("travicraft:travi_pickaxe");
		this.setUnlocalizedName("travipickaxe");
		this.setCreativeTab(TraviCraftMain.tabTravi);
	}

}
