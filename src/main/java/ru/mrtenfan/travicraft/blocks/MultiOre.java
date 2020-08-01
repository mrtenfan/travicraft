package ru.mrtenfan.travicraft.blocks;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import ru.mrtenfan.travicraft.TraviCraftMain;
import ru.mrtenfan.travicraft.items.ItemInit;

public class MultiOre extends Block {

	public static Random random;
	public static final String[] metadata = new String[] {
			"travi_ore_stone",//0
			"travi_ore_netherrack",//1
			"travi_ore_endstone",//2
			"amefist_ore"//3
	};
	
    @SideOnly(Side.CLIENT)
    private IIcon[] icon_array;
    
	public MultiOre(Material mat, Float hard, Float resist, String tool) {
		super(mat);
        setCreativeTab(TraviCraftMain.tabTravi);
        setHardness(hard);
        setResistance(resist);
        setHarvestLevel(tool, 3);
    }
	
    @Override
    public int damageDropped(int metadata) {
    	if(metadata == 3)
    		return 0;
    	else
    		return metadata;
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata) {
    	return icon_array[Math.min(MultiOre.metadata.length - 1, metadata)];
    }
    
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item id, CreativeTabs table, List list) {
        for (int j = 0; j < metadata.length; ++j) {
            list.add(new ItemStack(id, 1, j));
        }
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister ir) {
        super.registerBlockIcons(ir);
        icon_array = new IIcon[metadata.length];
        for (int i = 0; i < metadata.length; ++i) {
            icon_array[i] = ir.registerIcon("Travicraft:" + metadata[i]);
        }
    }
	@Override
	public Item getItemDropped(int meta, Random rand, int luck) {
		if(meta == 3) {
			random = new Random();
			int dropped = 1;
			if(luck > 0)
	 			dropped = 1 + random.nextInt(luck);
			return new ItemStack(ItemInit.multi_item, dropped, 0).getItem();
		}else
			return new ItemStack(BlockInit.multi_ore, 1, meta).getItem();
	}
}
