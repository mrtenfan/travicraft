package ru.mrtenfan.travicraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import ru.mrtenfan.travicraft.armors.ArmorInit;
import ru.mrtenfan.travicraft.blocks.BlockInit;
import ru.mrtenfan.travicraft.items.ItemInit;
import ru.mrtenfan.travicraft.tools.ToolInit;

@Mod(modid = "Travicraft", name = "TraviCraft", version = "3.2.0")

public class TraviCraftMain {
	//author tweaks
	public static final boolean birthday = false;
	public static final boolean modpackver = false;

	public static final ToolMaterial TRAVI = EnumHelper.addToolMaterial("TRAVI", 3, 906, 7.0F, 4.0F, 10);
	public static final ArmorMaterial MANTLES = EnumHelper.addArmorMaterial("MANTLES", 25, new int[] {0, 7, 0, 0}, 5);
	public static final ArmorMaterial WOLF = EnumHelper.addArmorMaterial("WOLF", 10, new int[] {3, 8, 6, 3}, 25);
	public static final ArmorMaterial PARTYHAT = EnumHelper.addArmorMaterial("PARTYHAT", 3, new int[] {0}, 0);
	public static CreativeTabs tabTravi = new TabTravi("tabTravi");
	public static OresGenerator oresgenerator = new OresGenerator();

	@SidedProxy(clientSide = "ru.mrtenfan.travicraft.ClientProxy", serverSide = "ru.mrtenfan.travicraft.CommonProxy")
	public static CommonProxy proxy; 
	@Instance("travicraft")
	public static TraviCraftMain instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		new ConfigFile(e.getSuggestedConfigurationFile());
		ItemInit.PreInit();
		BlockInit.PreInit();
		ArmorInit.PreInit();
		ToolInit.PreInit();

		proxy.preInit(e);
	}

	@Mod.EventHandler
	public void Init(FMLInitializationEvent e){
		ItemInit.Init();
		BlockInit.Init();
		ArmorInit.Init();
		ToolInit.Init();

		proxy.init(e);
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e){
		GameInit.OreDict();
		GameInit.WorkBench();
		GameInit.Furnace();
		GameInit.WorldGen();

		proxy.postInit(e);
	}
}