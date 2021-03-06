// Date: 08.11.2019 21:32:07
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package ru.mrtenfan.travicraft.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Mantle_of_snow extends ModelBiped
{
  //fields
    ModelRenderer leftsleeve;
    ModelRenderer rightsleeve;
    ModelRenderer leftfront;
    ModelRenderer rightfront;
    ModelRenderer back;
    ModelRenderer right;
    ModelRenderer left;
    ModelRenderer lefthood1;
    ModelRenderer lefthood2;
    ModelRenderer righthood1;
    ModelRenderer rigthhhod2;
    ModelRenderer backhood;
    ModelRenderer amefist1o;
    ModelRenderer amefist1t;
    ModelRenderer amefist2o;
    ModelRenderer amefist2t;
    ModelRenderer emerald1o;
    ModelRenderer emerald1t;
    ModelRenderer emerald2o;
    ModelRenderer emerald2t;
  
  public Mantle_of_snow(float f)
  {
    textureWidth = 128;
    textureHeight = 64;
    
      leftsleeve = new ModelRenderer(this, 8, 9);
      leftsleeve.addBox(-1.5F, -2.2F, -2.5F, 5, 11, 5);
      leftsleeve.setRotationPoint(0F, 0F, 0F);
      leftsleeve.setTextureSize(128, 64);
      leftsleeve.mirror = true;
      setRotation(leftsleeve, 0F, 0F, 0F);
      rightsleeve = new ModelRenderer(this, 100, 9);
      rightsleeve.addBox(-3.5F, -2.2F, -2.5F, 5, 11, 5);
      rightsleeve.setRotationPoint(0F, 0F, 0F);
      rightsleeve.setTextureSize(128, 64);
      rightsleeve.mirror = true;
      setRotation(rightsleeve, 0F, 0F, 0F);
      leftfront = new ModelRenderer(this, 38, 9);
      leftfront.addBox(1F, 0F, -2.5F, 3, 12, 1);
      leftfront.setRotationPoint(0F, 0F, 0F);
      leftfront.setTextureSize(128, 64);
      leftfront.mirror = true;
      setRotation(leftfront, 0F, 0F, 0F);
      rightfront = new ModelRenderer(this, 82, 9);
      rightfront.addBox(-4F, 0F, -2.5F, 3, 12, 1);
      rightfront.setRotationPoint(0F, 0F, 0F);
      rightfront.setTextureSize(128, 64);
      rightfront.mirror = true;
      setRotation(rightfront, 0F, 0F, 0F);
      back = new ModelRenderer(this, 54, 9);
      back.addBox(-4F, 0F, 1.5F, 8, 20, 1);
      back.setRotationPoint(0F, 0F, 0F);
      back.setTextureSize(128, 64);
      back.mirror = true;
      setRotation(back, 0F, 0F, 0F);
      right = new ModelRenderer(this, 80, 25);
      right.addBox(-4.5F, 0F, -2.5F, 1, 17, 5);
      right.setRotationPoint(0F, 0F, 0F);
      right.setTextureSize(128, 64);
      right.mirror = true;
      setRotation(right, 0F, 0F, 0F);
      left = new ModelRenderer(this, 36, 25);
      left.addBox(3.5F, 0F, -2.5F, 1, 17, 5);
      left.setRotationPoint(0F, 0F, 0F);
      left.setTextureSize(128, 64);
      left.mirror = true;
      setRotation(left, 0F, 0F, 0F);
      lefthood1 = new ModelRenderer(this, 4, 2);
      lefthood1.addBox(4F, -1F, -3.5F, 1, 1, 3);
      lefthood1.setRotationPoint(0F, 0F, 0F);
      lefthood1.setTextureSize(128, 64);
      lefthood1.mirror = true;
      setRotation(lefthood1, 0F, 0F, 0F);
      lefthood2 = new ModelRenderer(this, 18, 2);
      lefthood2.addBox(4F, -2F, -0.5F, 1, 2, 3);
      lefthood2.setRotationPoint(0F, 0F, 0F);
      lefthood2.setTextureSize(128, 64);
      lefthood2.mirror = true;
      setRotation(lefthood2, 0F, 0F, 0F);
      righthood1 = new ModelRenderer(this, 116, 2);
      righthood1.addBox(-5F, -1F, -3.5F, 1, 1, 3);
      righthood1.setRotationPoint(0F, 0F, 0F);
      righthood1.setTextureSize(128, 64);
      righthood1.mirror = true;
      setRotation(righthood1, 0F, 0F, 0F);
      rigthhhod2 = new ModelRenderer(this, 100, 2);
      rigthhhod2.addBox(-5F, -2F, -0.5F, 1, 2, 3);
      rigthhhod2.setRotationPoint(0F, 0F, 0F);
      rigthhhod2.setTextureSize(128, 64);
      rigthhhod2.mirror = true;
      setRotation(rigthhhod2, 0F, 0F, 0F);
      backhood = new ModelRenderer(this, 51, 2);
      backhood.addBox(-5F, -2F, 2.5F, 10, 3, 2);
      backhood.setRotationPoint(0F, 0F, 0F);
      backhood.setTextureSize(128, 64);
      backhood.mirror = true;
      setRotation(backhood, 0F, 0F, 0F);
      amefist1o = new ModelRenderer(this, 0, 49);
      amefist1o.addBox(-0.5F, 0F, 2F, 3, 3, 1);
      amefist1o.setRotationPoint(0F, 0F, 0F);
      amefist1o.setTextureSize(128, 64);
      amefist1o.mirror = true;
      setRotation(amefist1o, 0F, 0F, 0F);
      amefist1t = new ModelRenderer(this, 10, 49);
      amefist1t.addBox(0.5F, -1F, 2F, 1, 5, 1);
      amefist1t.setRotationPoint(0F, 0F, 0F);
      amefist1t.setTextureSize(128, 64);
      amefist1t.mirror = true;
      setRotation(amefist1t, 0F, 0F, 0F);
      amefist2o = new ModelRenderer(this, 0, 49);
      amefist2o.addBox(-0.5F, 0F, -3F, 3, 3, 1);
      amefist2o.setRotationPoint(0F, 0F, 0F);
      amefist2o.setTextureSize(128, 64);
      amefist2o.mirror = true;
      setRotation(amefist2o, 0F, 0F, 0F);
      amefist2t = new ModelRenderer(this, 10, 49);
      amefist2t.addBox(0.5F, -1F, -3F, 1, 5, 1);
      amefist2t.setRotationPoint(0F, 0F, 0F);
      amefist2t.setTextureSize(128, 64);
      amefist2t.mirror = true;
      setRotation(amefist2t, 0F, 0F, 0F);
      emerald1o = new ModelRenderer(this, 120, 49);
      emerald1o.addBox(-2.5F, 0F, 2F, 3, 3, 1);
      emerald1o.setRotationPoint(0F, 0F, 0F);
      emerald1o.setTextureSize(128, 64);
      emerald1o.mirror = true;
      setRotation(emerald1o, 0F, 0F, 0F);
      emerald1t = new ModelRenderer(this, 114, 49);
      emerald1t.addBox(-1.5F, -1F, 2F, 1, 5, 1);
      emerald1t.setRotationPoint(0F, 0F, 0F);
      emerald1t.setTextureSize(128, 64);
      emerald1t.mirror = true;
      setRotation(emerald1t, 0F, 0F, 0F);
      emerald2o = new ModelRenderer(this, 120, 49);
      emerald2o.addBox(-2.5F, 0F, -3F, 3, 3, 1);
      emerald2o.setRotationPoint(0F, 0F, 0F);
      emerald2o.setTextureSize(128, 64);
      emerald2o.mirror = true;
      setRotation(emerald2o, 0F, 0F, 0F);
      emerald2t = new ModelRenderer(this, 114, 49);
      emerald2t.addBox(-1.5F, -1F, -3F, 1, 5, 1);
      emerald2t.setRotationPoint(0F, 0F, 0F);
      emerald2t.setTextureSize(128, 64);
      emerald2t.mirror = true;
      setRotation(emerald2t, 0F, 0F, 0F);
      
      this.bipedBody.addChild(leftfront);
      this.bipedBody.addChild(rightfront);
      this.bipedBody.addChild(back);
      this.bipedBody.addChild(left);
      this.bipedBody.addChild(right);
      this.bipedBody.addChild(lefthood1);
      this.bipedBody.addChild(lefthood2);
      this.bipedBody.addChild(righthood1);
      this.bipedBody.addChild(rigthhhod2);
      this.bipedBody.addChild(backhood);
      
      this.bipedLeftArm.addChild(leftsleeve);
      
      this.bipedRightArm.addChild(rightsleeve);
      
      this.bipedLeftArm.addChild(emerald1o);
      this.bipedLeftArm.addChild(emerald1t);
      this.bipedLeftArm.addChild(emerald2o);
      this.bipedLeftArm.addChild(emerald2t);
      
      this.bipedRightArm.addChild(amefist1o);
      this.bipedRightArm.addChild(amefist1t);
      this.bipedRightArm.addChild(amefist2o);
      this.bipedRightArm.addChild(amefist2t);
      
      this.bipedHead.cubeList.clear();
      this.bipedLeftArm.cubeList.clear();
      this.bipedRightArm.cubeList.clear();
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
