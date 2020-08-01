package ru.mrtenfan.travicraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.client.model.ModelBiped;

public class CommonProxy {
	public ModelBiped getPartyhatModel(int i) {
        return null;
	}
	public ModelBiped getWolfArmorModel(int i) {
        return null;
	}
    public ModelBiped getMantleModel(int id) {
        return null;
    }
    public ModelBiped getWolfBootsModel(int id){
    	return null;
    }
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e){
	}
	@Mod.EventHandler
    public void init(FMLInitializationEvent e){
    }
    @Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e){	
	}
}
