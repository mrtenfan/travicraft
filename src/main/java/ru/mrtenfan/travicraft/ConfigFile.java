package ru.mrtenfan.travicraft;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigFile {
	
    public static boolean ic2Integration;
    public static boolean ieIntegration;
    public static boolean eIOIntegration;
    public static boolean deIntegration;
    public static boolean gears;
    public static boolean greenium;
    public static boolean shadowTravi;
    public static boolean amefist;
    public static boolean wolfFur;
    public static boolean wolfSkull;
    public static boolean traviTools;
	public static boolean mantleSnow;
	public static boolean wolfArmor;
	public static boolean partyhat;
	public static boolean modelmantle;
	public static boolean corMantleSnowCraft;
	public static boolean corWolfArmorCraft;
	public static boolean mfIntegration;

	public ConfigFile(File file) {
		Configuration config = new Configuration(file);
		
		config.addCustomCategoryComment("integration", "Enable or Disable any integration with other mods");
		config.addCustomCategoryComment("resource", "Enable or Disable any resources/tools");
		config.addCustomCategoryComment("checkerror", "Enable or Disable for checking errors");
		
		ic2Integration=config.get("integration", "Industrial Craft 2 Integration", false).getBoolean(false);
		ieIntegration=config.get("integration", "Immersive Ingineering Integration", false).getBoolean(false);
		eIOIntegration=config.get("integration", "EnderIO Integration", false).getBoolean(false);
		deIntegration=config.get("integration", "Draconic Evolution Integration", false).getBoolean(false);
		gears=config.get("resource", "Disable all gears", false).getBoolean(false);
		greenium=config.get("resource", "Enable greenium(In 3.2.0 DOESN'T WORK!)", true).getBoolean(true);
		shadowTravi=config.get("resource", "Enable shadow travi(In 3.2.0 DOESN'T WORK!)", true).getBoolean(true);
		amefist=config.get("resource", "Enable amefist(In 3.2.0 DOESN'T WORK!)", true).getBoolean(true);
		wolfFur=config.get("resource", "Enable wolf fur(In 3.2.0 DOESN'T WORK!)", true).getBoolean(true);
		wolfSkull=config.get("resource", "Enable wolf Skull", true).getBoolean(true);
		traviTools=config.get("resource", "Enable travi tools", true).getBoolean(true);
		mantleSnow=config.get("resource", "Enable mantle of snow", true).getBoolean(true);
		wolfArmor=config.get("resource", "Enable wolf armor", true).getBoolean(true);
		partyhat=config.get("resource", "Enable partyhats", true).getBoolean(true);
		corMantleSnowCraft=config.get("checkerror", "Do standart craft of Mantle of Snow correctly", true).getBoolean(true);
		corWolfArmorCraft=config.get("checkerror", "Do standart craft of all Wolf Armors correctly", true).getBoolean(true);
		mfIntegration=config.get("integration", "Metal Fever Integration", false).getBoolean(false);
		
		if (config.hasChanged())
			if(wolfSkull == false || wolfArmor == false && mantleSnow == true && corMantleSnowCraft == true) {
				mantleSnow = false;
			    System.out.println("WARNING![checkerror]: Disable Mantle of Snow.");
			    //Отключает мантию снега если не включены амефисты, волчья шкура или волчья броня и включена проверка правильности крафта
			}
		    if(wolfSkull == false && corWolfArmorCraft == true) {
		    	wolfArmor = false;
		    	System.out.println("WARNING![checkerror]: Disable wolf armorset."); 
		    	//Отключает волчью броню, если не включена волчья шкура
		    }
		config.save();
	}
}
