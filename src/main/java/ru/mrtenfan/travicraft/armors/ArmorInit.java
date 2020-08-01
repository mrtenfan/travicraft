package ru.mrtenfan.travicraft.armors;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import ru.mrtenfan.travicraft.ConfigFile;

public class ArmorInit {
	
	public static Item mantle_of_snow;
    public static Item wolf_cap;
    public static Item wolf_chest;
    public static Item wolf_legg;
    public static Item wolf_boots;
    public static Item Partyhatcyan;
    public static Item Partyhatgreen;
    public static Item Partyhatblue;

	public static void PreInit() {
		if(ConfigFile.mantleSnow)
	        mantle_of_snow = new MantleOfSnow(0, 1).setUnlocalizedName("mantleofsnow").setTextureName("travicraft:mantle_of_snow");
		if(ConfigFile.wolfArmor) {
	        wolf_cap = new WolfArmor(0, 0).setUnlocalizedName("wolfcap").setTextureName("travicraft:wolf_cap");
	        wolf_chest = new WolfArmor(0, 1).setUnlocalizedName("wolfchest").setTextureName("travicraft:wolf_chest");
	        wolf_legg = new WolfArmor(0, 2).setUnlocalizedName("wolflegg").setTextureName("travicraft:wolf_legg");
	        wolf_boots = new WolfBoot(0, 3).setUnlocalizedName("wolfboots").setTextureName("travicraft:wolf_boots");
		}
		if(ConfigFile.partyhat) {
	        Partyhatcyan = new PartyhatCyan(0, 0).setUnlocalizedName("partyhatcyan").setTextureName("travicraft:item_Partyhatcyan");
	        Partyhatgreen = new PartyhatGreen(0, 0).setUnlocalizedName("partyhatgreen").setTextureName("travicraft:item_Partyhatgreen");
	        Partyhatblue = new PartyhatBlue(0, 0).setUnlocalizedName("partyhatblue").setTextureName("travicraft:item_Partyhatblue");
		}
	}

	public static void Init() {
		if(ConfigFile.mantleSnow)
		    GameRegistry.registerItem(mantle_of_snow, "MantleOfSnow");
		if(ConfigFile.wolfArmor) {
		    GameRegistry.registerItem(wolf_cap, "WolfCap");
		    GameRegistry.registerItem(wolf_chest, "WolfChest");
		    GameRegistry.registerItem(wolf_legg, "WolfLegg");
		    GameRegistry.registerItem(wolf_boots, "WolfBoots");
		}
		if(ConfigFile.partyhat) {
		    GameRegistry.registerItem(Partyhatcyan, "Partyhatcyan");
		    GameRegistry.registerItem(Partyhatgreen, "Partyhatgreen");
		    GameRegistry.registerItem(Partyhatblue, "Partyhatblue");
		}
	}
}
