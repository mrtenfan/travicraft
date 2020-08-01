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

public class MantleOfSnow extends ItemArmor {

	public MantleOfSnow(int id, int ArmorType) {
		super(TraviCraftMain.MANTLES, id, ArmorType);
		this.setCreativeTab(TraviCraftMain.tabTravi);
		this.setMaxStackSize(1);
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
		return "travicraft:textures/models/armors/mantle_of_snow_model.png";     //текстурка брони на игроке
	}
	ModelBiped MantleSnow = new ModelBiped();            //вместо MantleSnow называем как хотим
	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving,
			ItemStack itemStack, int armorSlot) {
		if(itemStack != null){
			if(itemStack.getItem() instanceof MantleOfSnow){
				MantleSnow = TraviCraftMain.proxy.getMantleModel(0); 
				// TestMOD-ваш гл класс, proxy - это переменная с сервер прокси [пример: public static ServerProxy proxy1;] 
				//Все это,это регистрация модели в прокси .Где (0) это тип брони. 1-нагрудник, 2 - штаны , 3 - ботинки

			}
			if(MantleSnow != null){
				MantleSnow.bipedHead.showModel = armorSlot == 0;
				MantleSnow.bipedHeadwear.showModel = armorSlot == 10;
				MantleSnow.bipedBody.showModel = armorSlot == 1 || armorSlot == 2;
				MantleSnow.bipedRightArm.showModel = armorSlot == 1;
				MantleSnow.bipedLeftArm.showModel = armorSlot == 1;
				MantleSnow.bipedRightLeg.showModel = armorSlot == 2 || armorSlot == 3;
				MantleSnow.bipedLeftLeg.showModel = armorSlot == 2 || armorSlot == 3;
				MantleSnow.isSneak = entityLiving.isSneaking();
				MantleSnow.isRiding = entityLiving.isRiding();
				MantleSnow.isChild = entityLiving.isChild();
				if(entityLiving instanceof EntityPlayer){
					MantleSnow.aimedBow =((EntityPlayer)entityLiving).getItemInUseDuration() > 2;
				}
			}
		}
		return MantleSnow;
	}
}
