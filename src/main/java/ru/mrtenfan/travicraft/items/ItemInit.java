package ru.mrtenfan.travicraft.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import ru.mrtenfan.travicraft.ConfigFile;

public class ItemInit {
    //update +3.2.0
    public static Item travi_multi_item;
    public static Item greenium_multi_item;
    public static Item shadow_multi_item;
    public static Item multi_item;
    public static Item multi_gear;
    public static Item integ_ic2;
    public static Item integ_ie;
    public static Item integ_eio;
    public static Item integ_de;
    public static Item integ_mf;

	public static void PreInit() {
		travi_multi_item = new TraviMultiItem();
		greenium_multi_item = new GreeniumMultiItem();
		shadow_multi_item = new ShadowMultiItem();
		multi_item = new MultiItem();
		if(!ConfigFile.gears)
			multi_gear = new MultiGear();
		if(ConfigFile.ic2Integration)
			integ_ic2 = new MultiIC();
		if(ConfigFile.ieIntegration)
			integ_ie = new MetalPlateTravi();
		if(ConfigFile.eIOIntegration)
			integ_eio = new MultiEIO();
		if(ConfigFile.deIntegration)
			integ_de = new MultiDE();
		if(ConfigFile.mfIntegration)
			integ_mf = new MultiMF();
	}

	public static void Init() {
		GameRegistry.registerItem(travi_multi_item, "TraviMultiItem");
		GameRegistry.registerItem(greenium_multi_item, "GreeniumMultiItem");
		GameRegistry.registerItem(shadow_multi_item, "ShadowMultiItem");
		GameRegistry.registerItem(multi_item, "MultiItem");
		if(!ConfigFile.gears)
			GameRegistry.registerItem(multi_gear, "MultiGear");
		if(ConfigFile.ic2Integration)
			GameRegistry.registerItem(integ_ic2, "MultiIC");
		if(ConfigFile.ieIntegration)
			GameRegistry.registerItem(integ_ie, "MultiIE");
		if(ConfigFile.eIOIntegration)
			GameRegistry.registerItem(integ_eio, "MultiEIO");
		if(ConfigFile.deIntegration)
			GameRegistry.registerItem(integ_de, "MultiDE");
		if(ConfigFile.mfIntegration)
			GameRegistry.registerItem(integ_mf, "MultiMF");
	}
}
