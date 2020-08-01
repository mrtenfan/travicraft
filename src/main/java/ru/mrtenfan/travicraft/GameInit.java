package ru.mrtenfan.travicraft;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import ru.mrtenfan.travicraft.armors.ArmorInit;
import ru.mrtenfan.travicraft.blocks.BlockInit;
import ru.mrtenfan.travicraft.items.ItemInit;
import ru.mrtenfan.travicraft.tools.ToolInit;

public class GameInit {

	public static void WorkBench() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemInit.travi_multi_item, 9, 2), "I", 'I', "ingotTravi"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemInit.travi_multi_item, 1, 0), "TTT", "TTT", "TTT", 'T', "nuggetTravi"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemInit.travi_multi_item, 9, 0), "B", 'B', "blockTravi"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockInit.multi_block, 1, 0), "TTT", "TTT", "TTT", 'T', "ingotTravi"));
		if(!ConfigFile.gears) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemInit.multi_gear, 1, 0), " T ", "TIT", " T ", 'T', "ingotTravi", 'I', "ingotIron"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemInit.multi_gear, 1, 1), " G ", "GIG", " G ", 'G', "ingotGreenium", 'I', "ingotIron"));
		}
		if(ConfigFile.ic2Integration) {
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemInit.integ_ic2, 1, 0), "ingotTravi", "craftingToolForgeHammer"));
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemInit.integ_ic2, 1, 1), "plateTravi", "craftingToolForgeHammer"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemInit.integ_ic2, 1, 2), "ETD", "LCL", "DTE", 'L', "dustLithium", 'T', "plateTravi", 'D', "gemAmefist", 'E', "gemEmerald", 'C', "circuitAdvanced"));
		}
		if(ConfigFile.eIOIntegration) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemInit.integ_eio, 1, 0), "NNN", "NCN", "NNN", 'N', "nuggetTravi", 'C', "itemPulsatingCrystal"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemInit.integ_eio, 1, 1), "NNN", "NCN", "NNN", 'N', "nuggetGreenium", 'C', "itemVibrantCrystal"));
		}
		if(ConfigFile.mfIntegration) {
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemInit.integ_mf, 1, 0), "ingotTravi", "ingotTravi", "anyHammers"));
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemInit.integ_mf, 1, 1), "ingotGreenium",  "ingotGreenium", "anyHammers"));
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemInit.integ_mf, 1, 2), "ingotShadowTravi", "ingotShadowTravi", "anyHammers"));
		}

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemInit.greenium_multi_item, 9, 2), "I", 'I', "ingotGreenium"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemInit.greenium_multi_item, 1, 0), "GGG", "GGG", "GGG", 'G', "nuggetGreenium"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemInit.greenium_multi_item, 9, 0), "B", 'B', "blockGreenium"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockInit.multi_block, 1, 1), "GGG", "GGG", "GGG", 'G', "ingotGreenium"));

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemInit.shadow_multi_item, 9, 2), "I", 'I', "ingotShadowTravi"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemInit.shadow_multi_item, 1, 0), "SSS", "SSS", "SSS", 'S', "nuggetShadowTravi"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemInit.shadow_multi_item, 9, 0), "B", 'B', "blockShadowTravi"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockInit.multi_block, 1, 2), "SSS", "SSS", "SSS", 'S', "ingotShadowTravi"));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.dye, 7, 15), "blockWolfSkull"));

		if(ConfigFile.mantleSnow)
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ArmorInit.mantle_of_snow),
					"W W", "ETA", "BCB",
					'W', "itemWolfFur",
					'E', "gemEmerald",
					'T', "blockTravi",
					'A', "gemAmefist",
					'B', new ItemStack(Blocks.wool, 1, 11),
					'C', new ItemStack(ArmorInit.wolf_chest)));
		if(ConfigFile.wolfArmor) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ArmorInit.wolf_cap), "WWW", "WSW", 'W', "itemWolfFur", 'S', "blockWolfSkull"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ArmorInit.wolf_chest), "W W", "WWW", "WWW", 'W', "itemWolfFur"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ArmorInit.wolf_legg), "WWW", "W W", "W W", 'W', "itemWolfFur"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ArmorInit.wolf_boots), "W W", "W W", 'W', "itemWolfFur"));
		}
		if(ConfigFile.partyhat && CheckData.getBoolDate15()) {
            GameRegistry.addRecipe(new ItemStack(ArmorInit.Partyhatcyan, 1),
          		  new Object[]{
          		    " X ", "XYX",
          		    ('X'), Items.paper,
          		    ('Y'), new ItemStack(Items.dye, 1, 6)
          		  }
          		);
             GameRegistry.addRecipe(new ItemStack(ArmorInit.Partyhatgreen, 1),
           		  new Object[]{
           		    " X ", "XYX",
           		    ('X'), Items.paper,
           		    ('Y'), new ItemStack(Items.dye, 1, 10)
           		  }
           		);
             GameRegistry.addRecipe(new ItemStack(ArmorInit.Partyhatblue, 1),
           		  new Object[]{
           		    " X ", "XYX", " B ",
           		    ('X'), Items.paper,
           		    ('Y'), new ItemStack(Items.dye, 1, 4),
           		    ('B'), new ItemStack(Items.dye, 1, 11)
           		  }
           		);
		}
		if(ConfigFile.traviTools) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ToolInit.travi_sword),
					"T", "T", "S", 
					'T', "ingotTravi",
					'S', "stickWood"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ToolInit.travi_pickaxe),
					"TTT", " S ", " S ", 
					'T', "ingotTravi",
					'S', "stickWood"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ToolInit.travi_shovel),
					"T", "S", "S", 
					'T', "ingotTravi",
					'S', "stickWood"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ToolInit.travi_axe),
					"TT", "TS", " S", 
					'T', "ingotTravi",
					'S', "stickWood"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ToolInit.travi_axe),
					"TT", "ST", "S ", 
					'T', "ingotTravi",
					'S', "stickWood"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ToolInit.travi_hoe),
					"TT", " S", " S", 
					'T', "ingotTravi",
					'S', "stickWood"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ToolInit.travi_hoe),
					"TT", "S ", "S ", 
					'T', "ingotTravi",
					'S', "stickWood"));
		}
	}

	public static void Furnace() {
		for(int i = 0; i < 3; i++) {
			GameRegistry.addSmelting(new ItemStack(BlockInit.multi_ore, 1, i), new ItemStack(ItemInit.travi_multi_item, 1, 0), 0.6F);
		}
		GameRegistry.addSmelting(new ItemStack(BlockInit.multi_ore, 1, 3), new ItemStack(ItemInit.multi_item, 1, 0), 0.75F);
		GameRegistry.addSmelting(new ItemStack(ItemInit.travi_multi_item, 1, 1), new ItemStack(ItemInit.travi_multi_item, 1, 0), 0.6F);
	}

	public static void WorldGen() {
	    GameRegistry.registerWorldGenerator(TraviCraftMain.oresgenerator, 0); 
	    ChestGenHooks.addItem(ChestGenHooks.MINESHAFT_CORRIDOR,
	    	    new WeightedRandomChestContent(new ItemStack(BlockInit.multi_ore, 1, 0), 1, 2, 1));
	    ChestGenHooks.addItem(ChestGenHooks.PYRAMID_DESERT_CHEST,
	    	    new WeightedRandomChestContent(new ItemStack(ItemInit.travi_multi_item, 1, 0), 2, 6, 3));
	    ChestGenHooks.addItem(ChestGenHooks.PYRAMID_JUNGLE_CHEST,
	    	    new WeightedRandomChestContent(new ItemStack(ItemInit.travi_multi_item, 1, 0), 2, 6, 3));
	    ChestGenHooks.addItem(ChestGenHooks.VILLAGE_BLACKSMITH,
	    	    new WeightedRandomChestContent(new ItemStack(ItemInit.travi_multi_item, 1, 0), 1, 2, 5));
	    ChestGenHooks.addItem(ChestGenHooks.PYRAMID_DESERT_CHEST, 
	    		new WeightedRandomChestContent(new ItemStack(ItemInit.multi_item, 1, 0), 1, 1, 1));
	    ChestGenHooks.addItem(ChestGenHooks.PYRAMID_JUNGLE_CHEST, 
	    		new WeightedRandomChestContent(new ItemStack(ItemInit.multi_item, 1, 0), 1, 1, 1));
	    MinecraftForge.EVENT_BUS.register(new MobsDrops());
	}

	public static void OreDict() {
		String[] travi = new String[] {"ingotTravi", "dustTravi", "nuggetTravi"};
		String[] greenium = new String[] {"ingotGreenium", "dustGreenium", "nuggetGreenium"};
		String[] shadow = new String[] {"ingotShadowTravi", "dustShadowTravi", "nuggetShadowTravi"};
		String[] other = new String[] {"gemAmefist", "itemWolfFur"};
		String[] gears = new String[] {"gearTravi", "gearGreenium"};
		String[] ic2 = new String[] {"plateTravi", "plateDenseTravi", "circuitTravi"};
		String[] eio = new String[] {"itemTraviCrystal", "itemGreeniumCrystal"};
		String[] ores = new String[] {"oreStoneTravi", "oreNetherTravi", "oreEndTravi", "oreAmefist"};
		String[] blocks = new String[] {"blockTravi", "blockGreenium", "blockShadowTravi"};
		String[] mf = new String[] {"plateGreenium", "plateShadowTravi"};
		for(int i = 0; i < travi.length; i++) {
			OreDictionary.registerOre(travi[i], new ItemStack(ItemInit.travi_multi_item, 1, i));
		}
		for(int i = 0; i < greenium.length; i++) {
			OreDictionary.registerOre(greenium[i], new ItemStack(ItemInit.greenium_multi_item, 1, i));
		}
		for(int i = 0; i < shadow.length; i++) {
			OreDictionary.registerOre(shadow[i], new ItemStack(ItemInit.shadow_multi_item, 1, i));
		}
		for(int i = 0; i < other.length; i++) {
			OreDictionary.registerOre(other[i], new ItemStack(ItemInit.multi_item, 1, i));
		}
		for(int i = 0; i < ores.length; i++) {
			OreDictionary.registerOre(ores[i], new ItemStack(BlockInit.multi_ore, 1, i));
		}
		for(int i = 0; i < blocks.length; i++) {
			OreDictionary.registerOre(blocks[i], new ItemStack(BlockInit.multi_block, 1, i));
		}
		if(!ConfigFile.gears)
			for(int i = 0; i < gears.length; i++) {
				OreDictionary.registerOre(gears[i], new ItemStack(ItemInit.multi_gear, 1, i));
			}
		if(ConfigFile.ic2Integration)
			OreDictionary.registerOre(ic2[1], new ItemStack(ItemInit.integ_ie, 1, 0));
		if(ConfigFile.ieIntegration)
			for(int i = 0; i < travi.length; i++) {
				OreDictionary.registerOre(travi[i], new ItemStack(ItemInit.travi_multi_item, 1, i));
			}
		if(ConfigFile.eIOIntegration)
			for(int i = 0; i < eio.length; i++) {
				OreDictionary.registerOre(eio[i], new ItemStack(ItemInit.integ_eio, 1, i));
			}
		if(ConfigFile.mfIntegration)
			for(int i = 0; i < mf.length; i++) {
				if(i < 1)
					OreDictionary.registerOre(ic2[i], new ItemStack(ItemInit.integ_mf, 1, i));
				else
					OreDictionary.registerOre(mf[i-1], new ItemStack(ItemInit.integ_mf, 1, i));
			}
		OreDictionary.registerOre("blockWolfSkull", new ItemStack(BlockInit.wolf_skull));
	}
}
