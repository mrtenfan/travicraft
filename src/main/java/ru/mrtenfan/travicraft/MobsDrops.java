package ru.mrtenfan.travicraft;

import java.util.Random;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import ru.mrtenfan.travicraft.blocks.BlockInit;
import ru.mrtenfan.travicraft.items.ItemInit;

public class MobsDrops {
	
    public static Random random;

	@SubscribeEvent
	public void onEntityDrop(LivingDropsEvent event) {
		random = new Random();
		double chance = Math.random();
		double chanceFur = 0.35;
		if(chance < chanceFur) {
			int dropped = random.nextInt(2) + 1;
			if(event.entityLiving instanceof EntityWolf) {
				event.entityLiving.entityDropItem(new ItemStack(ItemInit.multi_item, dropped, 1), 0);
			}
		}
		double chanceSkull = 0.03125;
		if(chance < chanceSkull) {
			if(event.entityLiving instanceof EntityWolf && ConfigFile.wolfSkull) {
				event.entityLiving.entityDropItem(new ItemStack(BlockInit.wolf_skull, 1), 0);
			}
		}
	}
}
