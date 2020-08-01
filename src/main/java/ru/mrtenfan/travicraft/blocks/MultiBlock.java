package ru.mrtenfan.travicraft.blocks;

import java.util.List;

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

public class MultiBlock extends Block {

	public static final String[] metadata = new String[] {
			"travi_block",//0
			"greenium_block",//1
			"ShadowTravi_block"//2
	};
	
    @SideOnly(Side.CLIENT)
    private IIcon[] icon_array;
    
	public MultiBlock(Material mat, Float hard, Float resist, String tool) {
		super(mat);
        setCreativeTab(TraviCraftMain.tabTravi);
        setHardness(hard);
        setResistance(resist);
        setHarvestLevel(tool, 1);
    }
	
    @Override
    public int damageDropped(int metadata) {
        return metadata;
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata) {
    	return icon_array[Math.min(MultiBlock.metadata.length - 1, metadata)];
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
}
