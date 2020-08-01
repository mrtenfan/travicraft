package ru.mrtenfan.travicraft.armors;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import ru.mrtenfan.travicraft.TraviCraftMain;

public class WolfArmor extends ItemArmor {

	public WolfArmor(int id, int armorType) {
		super(TraviCraftMain.WOLF, id, armorType);
		this.setCreativeTab(TraviCraftMain.tabTravi);
		this.setMaxStackSize(1);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
		return "travicraft:textures/models/armors/WolfArmor.png";     //текстурка брони на игроке
	}
	ModelBiped WolfArmor = new ModelBiped();            //вместо WolfArmor называем как хотим
	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving,
			ItemStack itemStack, int armorSlot) {
		if(itemStack != null){
			if(itemStack.getItem() instanceof WolfArmor){
				WolfArmor = TraviCraftMain.proxy.getWolfArmorModel(0);  
				WolfArmor = TraviCraftMain.proxy.getWolfArmorModel(1); 
				WolfArmor = TraviCraftMain.proxy.getWolfArmorModel(2);
				// TestMOD-ваш гл класс, proxy - это переменная с сервер прокси [пример: public static ServerProxy proxy1;] 
				//Все это,это регистрация модели в прокси .Где (0) это тип брони. 1-нагрудник, 2 - штаны , 3 - ботинки

			}
			if(WolfArmor != null){
				WolfArmor.bipedHead.showModel = armorSlot == 0;
				WolfArmor.bipedHeadwear.showModel = armorSlot == 10;
				WolfArmor.bipedBody.showModel = armorSlot == 1 || armorSlot == 2;
				WolfArmor.bipedRightArm.showModel = armorSlot == 1;
				WolfArmor.bipedLeftArm.showModel = armorSlot == 1;
				WolfArmor.bipedRightLeg.showModel = armorSlot == 2 || armorSlot == 3;
				WolfArmor.bipedLeftLeg.showModel = armorSlot == 2 || armorSlot == 3;
				WolfArmor.isSneak = entityLiving.isSneaking();
				WolfArmor.isRiding = entityLiving.isRiding();
				WolfArmor.isChild = entityLiving.isChild();
				if(entityLiving instanceof EntityPlayer){
					WolfArmor.aimedBow =((EntityPlayer)entityLiving).getItemInUseDuration() > 2;
				}
			}
		}
		return WolfArmor;
	}
}
