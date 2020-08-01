package ru.mrtenfan.travicraft.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ru.mrtenfan.travicraft.ConfigFile;
import ru.mrtenfan.travicraft.tileentity.TileEntitySkull;

public class BlockInit {
    //update +3.2.0
    public static Block multi_ore;
    public static Block multi_block;
    public static Block wolf_skull;

	public static void PreInit() {
		multi_ore = new MultiOre(Material.rock, 3F, 5F, "pickaxe");
		multi_block = new MultiBlock(Material.iron, 5F, 7F, "pickaxe");
		if(ConfigFile.wolfSkull)
	        wolf_skull = new WolfSkull();
	}

	public static void Init() {
		GameRegistry.registerBlock(multi_ore, ItemMultiOre.class, "MultiOre");
		GameRegistry.registerBlock(multi_block, ItemMultiBlock.class, "MultiBlock");
		if(ConfigFile.wolfSkull) {
		    GameRegistry.registerBlock(wolf_skull, "WolfSkull");
		    GameRegistry.registerTileEntity(TileEntitySkull.class, "TileEntitySkull");
		}
	}
}
