// Date: 09/07/2014 14:44:51
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package common.cout970.UltraTech.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTesseract extends ModelBase
{
  //fields
    ModelRenderer base;
    ModelRenderer core;
    ModelRenderer pilar1;
    ModelRenderer pilar2;
    ModelRenderer pilar3;
    ModelRenderer pilar4;
  
  public ModelTesseract()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      base = new ModelRenderer(this, 0, 15);
      base.addBox(-8F, 7F, -8F, 16, 1, 16);
      base.setRotationPoint(0F, 16F, 0F);
      base.setTextureSize(64, 32);
      base.mirror = true;
      setRotation(base, 0F, 0F, 0F);
      core = new ModelRenderer(this, 24, 0);
      core.addBox(-3F, -4F, -3F, 6, 6, 6);
      core.setRotationPoint(0F, 16F, 0F);
      core.setTextureSize(64, 32);
      core.mirror = true;
      setRotation(core, 0F, 0F, 0F);
      pilar1 = new ModelRenderer(this, 54, 0);
      pilar1.addBox(4F, -8F, -0.5F, 3, 15, 1);
      pilar1.setRotationPoint(0F, 16F, 0F);
      pilar1.setTextureSize(64, 32);
      pilar1.mirror = true;
      setRotation(pilar1, 0F, 0F, 0F);
      pilar2 = new ModelRenderer(this, 54, 0);
      pilar2.addBox(-7F, -8F, -0.5F, 3, 15, 1);
      pilar2.setRotationPoint(0F, 16F, 0F);
      pilar2.setTextureSize(64, 32);
      pilar2.mirror = true;
      setRotation(pilar2, 0F, 0F, 0F);
      pilar3 = new ModelRenderer(this, 0, 0);
      pilar3.addBox(-0.5F, -8F, 4F, 1, 15, 3);
      pilar3.setRotationPoint(0F, 16F, 0F);
      pilar3.setTextureSize(64, 32);
      pilar3.mirror = true;
      setRotation(pilar3, 0F, 0F, 0F);
      pilar4 = new ModelRenderer(this, 0, 0);
      pilar4.addBox(-0.5F, -8F, -7F, 1, 15, 3);
      pilar4.setRotationPoint(0F, 16F, 0F);
      pilar4.setTextureSize(64, 32);
      pilar4.mirror = true;
      setRotation(pilar4, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    base.render(f5);
    pilar1.render(f5);
    pilar2.render(f5);
    pilar3.render(f5);
    pilar4.render(f5);
  }
  
  public void renderBall(float f5){
	    core.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
  }

}