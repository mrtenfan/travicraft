package ru.mrtenfan.travicraft.tools;

import net.minecraft.item.ItemSword;
import ru.mrtenfan.travicraft.TraviCraftMain;

public class TraviSword extends ItemSword {
	
	public TraviSword() {
		super(TraviCraftMain.TRAVI);
		this.setTextureName("travicraft:travi_sword");
		this.setUnlocalizedName("travisword");
		this.setCreativeTab(TraviCraftMain.tabTravi);
	}

}
