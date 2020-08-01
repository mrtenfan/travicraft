// Date: 08.11.2019 17:21:34
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package ru.mrtenfan.travicraft.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class WolfArmorBoots extends ModelBiped
{
  //fields
    ModelRenderer rightbootarmor;
    ModelRenderer leftbootarmor;
  
  public WolfArmorBoots(float f)
  {
    textureWidth = 128;
    textureHeight = 64;
    
      rightbootarmor = new ModelRenderer(this, 104, 54);
      rightbootarmor.addBox(-3F, 9F, -3F, 6, 4, 6);
      rightbootarmor.setRotationPoint(0F, 0F, 0F);
      rightbootarmor.setTextureSize(128, 64);
      rightbootarmor.mirror = true;
      setRotation(rightbootarmor, 0F, 0F, 0F);
      rightbootarmor.mirror = false;
      leftbootarmor = new ModelRenderer(this, 0, 54);
      leftbootarmor.addBox(-3F, 9F, -3F, 6, 4, 6);
      leftbootarmor.setRotationPoint(0F, 0F, 0F);
      leftbootarmor.setTextureSize(128, 64);
      leftbootarmor.mirror = true;
      setRotation(leftbootarmor, 0F, 0F, 0F);
      
      this.bipedLeftLeg.addChild(leftbootarmor);
      this.bipedRightLeg.addChild(rightbootarmor);
      this.bipedLeftLeg.cubeList.clear();
      this.bipedRightLeg.cubeList.clear();
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