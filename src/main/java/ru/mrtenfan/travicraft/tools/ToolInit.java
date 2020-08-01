package ru.mrtenfan.travicraft.tools;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ToolInit {

	public static Item travi_sword;
	public static Item travi_pickaxe;
	public static Item travi_shovel;
	public static Item travi_axe;
	public static Item travi_hoe;
	
	public static void PreInit() {
	    travi_sword = new TraviSword();
	    travi_pickaxe = new TraviPickaxe();
	    travi_shovel = new TraviShovel();
	    travi_axe = new TraviAxe();
	    travi_hoe = new TraviHoe();
	}

	public static void Init() {
	    GameRegistry.registerItem(travi_sword, "TraviSword");
	    GameRegistry.registerItem(travi_pickaxe, "TraviPickaxe");
	    GameRegistry.registerItem(travi_shovel, "TraviShovel");
	    GameRegistry.registerItem(travi_axe, "TraviAxe");
	    GameRegistry.registerItem(travi_hoe, "TraviHoe");
	}
}
