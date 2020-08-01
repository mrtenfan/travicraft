// Date: 06.11.2019 13:04:02
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package ru.mrtenfan.travicraft.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWolfSkull extends ModelBase
{
	float rn = 0.0625F;
  //fields
    ModelRenderer jawcenter;
    ModelRenderer skullcenter;
    ModelRenderer jawright;
    ModelRenderer jawleft;
    ModelRenderer leftfang;
    ModelRenderer rightfang;
    ModelRenderer lefttooth1;
    ModelRenderer righttooth1;
    ModelRenderer templeleft;
    ModelRenderer templeright;
    ModelRenderer lefttooth2;
    ModelRenderer righttooth2;
    ModelRenderer back;
    ModelRenderer center;
    ModelRenderer lefttooth3;
    ModelRenderer righttooth3;
  
  public ModelWolfSkull()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      jawcenter = new ModelRenderer(this, 23, 0);
      jawcenter.addBox(-0.5F, -1F, -4F, 1, 3, 4);
      jawcenter.setRotationPoint(0F, 22F, 0F);
      jawcenter.setTextureSize(64, 32);
      jawcenter.mirror = true;
      setRotation(jawcenter, 0F, 0F, 0F);
      skullcenter = new ModelRenderer(this, 0, 17);
      skullcenter.addBox(-1F, -4F, 0F, 2, 3, 2);
      skullcenter.setRotationPoint(0F, 22F, 0F);
      skullcenter.setTextureSize(64, 32);
      skullcenter.mirror = true;
      setRotation(skullcenter, 0F, 0F, 0F);
      jawright = new ModelRenderer(this, 23, 14);
      jawright.addBox(-1.5F, -1F, -3F, 1, 1, 3);
      jawright.setRotationPoint(0F, 22F, 0F);
      jawright.setTextureSize(64, 32);
      jawright.mirror = true;
      setRotation(jawright, 0F, 0F, 0F);
      jawleft = new ModelRenderer(this, 23, 14);
      jawleft.addBox(0.5F, -1F, -3F, 1, 1, 3);
      jawleft.setRotationPoint(0F, 22F, 0F);
      jawleft.setTextureSize(64, 32);
      jawleft.mirror = true;
      setRotation(jawleft, 0F, 0F, 0F);
      leftfang = new ModelRenderer(this, 23, 9);
      leftfang.addBox(0.5F, 0F, -4F, 1, 2, 1);
      leftfang.setRotationPoint(0F, 22F, 0F);
      leftfang.setTextureSize(64, 32);
      leftfang.mirror = true;
      setRotation(leftfang, 0F, 0F, 0F);
      rightfang = new ModelRenderer(this, 23, 9);
      rightfang.addBox(-1.5F, 0F, -4F, 1, 2, 1);
      rightfang.setRotationPoint(0F, 22F, 0F);
      rightfang.setTextureSize(64, 32);
      rightfang.mirror = true;
      setRotation(rightfang, 0F, 0F, 0F);
      lefttooth1 = new ModelRenderer(this, 29, 9);
      lefttooth1.addBox(0.5F, 1F, -3F, 1, 1, 1);
      lefttooth1.setRotationPoint(0F, 22F, 0F);
      lefttooth1.setTextureSize(64, 32);
      lefttooth1.mirror = true;
      setRotation(lefttooth1, 0F, 0F, 0F);
      righttooth1 = new ModelRenderer(this, 29, 9);
      righttooth1.addBox(-1.5F, 1F, -3F, 1, 1, 1);
      righttooth1.setRotationPoint(0F, 22F, 0F);
      righttooth1.setTextureSize(64, 32);
      righttooth1.mirror = true;
      setRotation(righttooth1, 0F, 0F, 0F);
      templeleft = new ModelRenderer(this, 10, 17);
      templeleft.addBox(1F, 1F, 0F, 2, 1, 2);
      templeleft.setRotationPoint(0F, 17F, 0F);
      templeleft.setTextureSize(64, 32);
      templeleft.mirror = true;
      setRotation(templeleft, 0F, 0F, 0F);
      templeright = new ModelRenderer(this, 10, 17);
      templeright.addBox(-3F, 1F, 0F, 2, 1, 2);
      templeright.setRotationPoint(0F, 17F, 0F);
      templeright.setTextureSize(64, 32);
      templeright.mirror = true;
      setRotation(templeright, 0F, 0F, 0F);
      lefttooth2 = new ModelRenderer(this, 29, 9);
      lefttooth2.addBox(0.5F, 0F, -2F, 1, 1, 1);
      lefttooth2.setRotationPoint(0F, 22F, 0F);
      lefttooth2.setTextureSize(64, 32);
      lefttooth2.mirror = true;
      setRotation(lefttooth2, 0F, 0F, 0F);
      righttooth2 = new ModelRenderer(this, 29, 9);
      righttooth2.addBox(-1.5F, 0F, -2F, 1, 1, 1);
      righttooth2.setRotationPoint(0F, 22F, 0F);
      righttooth2.setTextureSize(64, 32);
      righttooth2.mirror = true;
      setRotation(righttooth2, 0F, 0F, 0F);
      back = new ModelRenderer(this, 0, 0);
      back.addBox(-3F, -4F, 2F, 6, 6, 2);
      back.setRotationPoint(0F, 22F, 0F);
      back.setTextureSize(64, 32);
      back.mirror = true;
      setRotation(back, 0F, 0F, 0F);
      center = new ModelRenderer(this, 0, 10);
      center.addBox(-3F, -1F, 0F, 6, 3, 2);
      center.setRotationPoint(0F, 22F, 0F);
      center.setTextureSize(64, 32);
      center.mirror = true;
      setRotation(center, 0F, 0F, 0F);
      lefttooth3 = new ModelRenderer(this, 29, 9);
      lefttooth3.addBox(0.5F, 1F, -1F, 1, 1, 1);
      lefttooth3.setRotationPoint(0F, 22F, 0F);
      lefttooth3.setTextureSize(64, 32);
      lefttooth3.mirror = true;
      setRotation(lefttooth3, 0F, 0F, 0F);
      righttooth3 = new ModelRenderer(this, 29, 9);
      righttooth3.addBox(-1.5F, 1F, -1F, 1, 1, 1);
      righttooth3.setRotationPoint(0F, 22F, 0F);
      righttooth3.setTextureSize(64, 32);
      righttooth3.mirror = true;
      setRotation(righttooth3, 0F, 0F, 0F);
  }
  
  public void render()
  {
		jawcenter.render(rn);
		skullcenter.render(rn);
		jawleft.render(rn);
		jawright.render(rn);
		leftfang.render(rn);
		rightfang.render(rn);
		templeleft.render(rn);
		templeright.render(rn);
		lefttooth1.render(rn);
		righttooth1.render(rn);
		lefttooth2.render(rn);
		righttooth2.render(rn);
		lefttooth3.render(rn);
		righttooth3.render(rn);
		center.render(rn);
		back.render(rn);
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
