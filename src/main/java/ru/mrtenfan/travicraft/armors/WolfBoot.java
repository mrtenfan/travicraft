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

public class WolfBoot extends ItemArmor {

	public WolfBoot(int id, int armorType) {
		super(TraviCraftMain.WOLF, id, armorType);
		this.setCreativeTab(TraviCraftMain.tabTravi);
		this.setMaxStackSize(1);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
		return "travicraft:textures/models/armors/WolfArmor.png";     //текстурка брони на игроке
	}
	ModelBiped WolfBoots = new ModelBiped();            //вместо WolfBoots называем как хотим
	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving,
			ItemStack itemStack, int armorSlot) {
		if(itemStack != null){
			if(itemStack.getItem() instanceof WolfArmor){
				WolfBoots = TraviCraftMain.proxy.getWolfBootsModel(3); 
				// TestMOD-ваш гл класс, proxy - это переменная с сервер прокси [пример: public static ServerProxy proxy1;] 
				//Все это,это регистрация модели в прокси .Где (0) это тип брони. 1-нагрудник, 2 - штаны , 3 - ботинки

			}
			if(WolfBoots != null){
				WolfBoots.bipedHead.showModel = armorSlot == 0;
				WolfBoots.bipedHeadwear.showModel = armorSlot == 10;
				WolfBoots.bipedBody.showModel = armorSlot == 1 || armorSlot == 2;
				WolfBoots.bipedRightArm.showModel = armorSlot == 1;
				WolfBoots.bipedLeftArm.showModel = armorSlot == 1;
				WolfBoots.bipedRightLeg.showModel = armorSlot == 2 || armorSlot == 3;
				WolfBoots.bipedLeftLeg.showModel = armorSlot == 2 || armorSlot == 3;
				WolfBoots.isSneak = entityLiving.isSneaking();
				WolfBoots.isRiding = entityLiving.isRiding();
				WolfBoots.isChild = entityLiving.isChild();
				if(entityLiving instanceof EntityPlayer){
					WolfBoots.aimedBow =((EntityPlayer)entityLiving).getItemInUseDuration() > 2;
				}
			}
		}
		return WolfBoots;
	}
}
