package ru.mrtenfan.travicraft.render;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import ru.mrtenfan.travicraft.models.ModelWolfSkull;
import ru.mrtenfan.travicraft.tileentity.TileEntitySkull;

public class RenderTileEntitySkull extends TileEntitySpecialRenderer {

	public static final ModelWolfSkull model = new ModelWolfSkull();
	public static final ResourceLocation texture = new ResourceLocation("Travicraft:textures/blocks/wolf_skull.png");

	@Override
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float f) {
		render((TileEntitySkull)tile, x, y, z, f);
	}

	private void render(TileEntitySkull tile, double x, double y, double z, float f) {
		GL11.glPushMatrix();
		GL11.glTranslated(x, y, z);
		GL11.glTranslatef(0.5F, 1.5F, 0.5F);
//		GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
        int dir = tile.blockMetadata;
//        if (dir == 0){
//            GL11.glRotatef(-180F, 0.0F, 0.0F, 1.0F);
//        }
//        if (dir % 2 != 0){
//            GL11.glRotatef(-90F, 0.0F, 1.0F, 0.0F);
//        }
//        if (dir % 2 == 0){
//            GL11.glRotatef(-180F, 1.0F, 0.0F, 0.0F);
//        }
        switch(dir) {
        case 0:
        	GL11.glRotatef(-180F, 0.0F, 0.0F, 1.0F);//South
        	break;
        case 1:
        	GL11.glRotatef(180F, -1.0F, 0.0F, 1.0F);//West
        	break;
        case 2:
        	GL11.glRotatef(-180F, 1.0F, 0.0F, 0.0F);//North
        	break;
        case 3:
        	GL11.glRotatef(180F, 1.0F, 0.0F, 1.0F);//East
        	break;
        }
		bindTexture(texture);
		model.render();
		GL11.glPopMatrix();
	}
}
