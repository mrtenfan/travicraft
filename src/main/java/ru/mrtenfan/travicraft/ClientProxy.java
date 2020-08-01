package ru.mrtenfan.travicraft;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import ru.mrtenfan.travicraft.blocks.BlockInit;
import ru.mrtenfan.travicraft.models.Mantle_of_snow;
import ru.mrtenfan.travicraft.models.WolfArmorBoots;
import ru.mrtenfan.travicraft.models.WolfArmor_model;
import ru.mrtenfan.travicraft.models.partyhat_model;
import ru.mrtenfan.travicraft.render.RenderItemBlockSkull;
import ru.mrtenfan.travicraft.render.RenderTileEntitySkull;
import ru.mrtenfan.travicraft.tileentity.TileEntitySkull;

public class ClientProxy extends CommonProxy {
	private static final partyhat_model partyhat = new partyhat_model(-1.0F);
	public static ModelBiped partyhatBiped;
    @Override
    public ModelBiped getPartyhatModel(int id){
    	return partyhat;
    }
	private static final WolfArmor_model wolfarmor = new WolfArmor_model(-1.0F);
    public static ModelBiped wolfarmorBiped;
    @Override
    public ModelBiped getWolfArmorModel(int id){
    	return wolfarmor;
    }
	private static final WolfArmorBoots wolfboots = new WolfArmorBoots(-1.0F);
    public static ModelBiped wolfBootsBiped;
    @Override
    public ModelBiped getWolfBootsModel(int id){
    	return wolfboots;
    }
    private static final Mantle_of_snow mantlesnow = new Mantle_of_snow(-1.0F);
	public static ModelBiped mantlesnowBiped;
    @Override
    public ModelBiped getMantleModel(int id) {
    	return mantlesnow;
    }
    @Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e){
	}
    @Mod.EventHandler
    public void init(FMLInitializationEvent e){
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySkull.class, new RenderTileEntitySkull());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockInit.wolf_skull), new RenderItemBlockSkull());
    }
    @Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e){	
	}
}
