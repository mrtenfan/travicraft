package ru.mrtenfan.travicraft.blocks;

import java.util.List;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import ru.mrtenfan.travicraft.TraviCraftMain;

public class WolfSkull extends BlockContainer implements ITileEntityProvider {

	public WolfSkull() {
		super(Material.circuits);
		this.setCreativeTab(TraviCraftMain.tabTravi);
		this.setHardness(0.25F);
		this.setBlockName("wolfskull");
		this.setBlockTextureName("soul_sand");
		
	}
    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase player, ItemStack p_149689_6_) {
        //This gets the direction the player is facing as an int from 0 to 3
        int dir = MathHelper.floor_double((player.rotationYaw * 4F) / 360F + 0.5D) & 3;
        //You can use the block metadata to save the direction
        world.setBlockMetadataWithNotify(x, y, z, dir, 3);
        //Or you can save it in a tile entity if you are using one
        //createNewTileEntity(world, world.getBlockMetadata(x, y, z));
        super.onBlockPlacedBy(world, x, y, z, player, p_149689_6_);
    }

	@Override
	public TileEntity createNewTileEntity(World world, int metadata) {
		return new ru.mrtenfan.travicraft.tileentity.TileEntitySkull();
	}

	public int getRenderType() {
		return -1;
	}

	public boolean isOpaqueCube() {
		return false;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}
	
	public boolean isFullCube(IBlockSource state){      
	    return false;  
	}
    public void addCollisionBoxesToList(World p_149743_1_, int p_149743_2_, int p_149743_3_, int p_149743_4_, AxisAlignedBB p_149743_5_, List p_149743_6_, Entity p_149743_7_){
        this.setBlockBounds(0.25F, 0.0F, 0.25F, 0.75F, 0.375F, 0.75F);
        super.addCollisionBoxesToList(p_149743_1_, p_149743_2_, p_149743_3_, p_149743_4_, p_149743_5_, p_149743_6_, p_149743_7_);
        this.setBlockBoundsForItemRender();
    }
}
