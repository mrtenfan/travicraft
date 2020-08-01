package ru.mrtenfan.travicraft.tools;

import net.minecraft.item.ItemSpade;
import ru.mrtenfan.travicraft.TraviCraftMain;

public class TraviShovel extends ItemSpade {
	
	public TraviShovel() {
		super(TraviCraftMain.TRAVI);
		this.setTextureName("travicraft:travi_shovel");
		this.setUnlocalizedName("travishovel");
		this.setCreativeTab(TraviCraftMain.tabTravi);
	}

}
