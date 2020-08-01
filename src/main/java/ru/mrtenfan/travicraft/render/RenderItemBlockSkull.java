package ru.mrtenfan.travicraft.render;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class RenderItemBlockSkull implements IItemRenderer {

	@Override
	public boolean handleRenderType(ItemStack is, ItemRenderType type) {
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack is, ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack is, Object... data) {
		GL11.glPushMatrix();
		GL11.glTranslated(0, 0, 0);
		GL11.glTranslatef(0.5F, 2.5F, 0.5F);
		GL11.glRotatef(180F, 180.0F, 0.0F, 1.0F);
		GL11.glScalef(1.5F, 1.5F, 1.5F);
		Minecraft.getMinecraft().renderEngine.bindTexture(RenderTileEntitySkull.texture);
		RenderTileEntitySkull.model.render();
		GL11.glPopMatrix();
	}
}
