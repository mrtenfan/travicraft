package ru.mrtenfan.travicraft.render;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import ru.mrtenfan.travicraft.models.ModelWolfSkull;

public class RenderItemSkull implements IItemRenderer {

	public static final ModelWolfSkull model = new ModelWolfSkull();
	public static final ResourceLocation texture = new ResourceLocation("Travicraft:textures/blocks/wolf_skull.png");

	@Override
	public boolean handleRenderType(ItemStack is, ItemRenderType type) {
		if (type == ItemRenderType.INVENTORY) return false;
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack is, ItemRendererHelper helper) {
		if (type == ItemRenderType.INVENTORY) return false;
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack is, Object... data) {
		GL11.glPushMatrix();
		GL11.glTranslatef(0.5F, 1.5F, 0.5F);
		GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
		Minecraft.getMinecraft().renderEngine.bindTexture(texture);
		model.render();
		GL11.glPopMatrix();
	}
}
