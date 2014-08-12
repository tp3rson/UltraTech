// Date: 25/05/2014 0:50:25
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package common.cout970.UltraTech.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEngine extends ModelBase
{
  //fields
    ModelRenderer base;
    ModelRenderer pipe;
    ModelRenderer move;
    ModelRenderer bellows;
  
  public ModelEngine()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      base = new ModelRenderer(this, 0, 44);
      base.addBox(-8F, 4F, -8F, 16, 4, 16);
      base.setRotationPoint(0F, 16F, 0F);
      base.setTextureSize(128, 64);
      base.mirror = true;
      setRotation(base, 0F, 0F, 0F);
      pipe = new ModelRenderer(this, 41, 23);
      pipe.addBox(-4F, 0F, -4F, 8, 12, 8);
      pipe.setRotationPoint(0F, 8F, 0F);
      pipe.setTextureSize(128, 64);
      pipe.mirror = true;
      setRotation(pipe, 0F, 0F, 0F);
      move = new ModelRenderer(this, 0, 0);
      move.addBox(-7F, 0F, -7F, 14, 2, 14);
      move.setRotationPoint(0F, 8F, 0F);
      move.setTextureSize(128, 64);
      move.mirror = true;
      setRotation(move, 0F, 0F, 0F);
      bellows = new ModelRenderer(this, 0, 23);
      bellows.addBox(-5F, 0F, -5F, 10, 6, 10);
      bellows.setRotationPoint(0F, 10F, 0F);
      bellows.setTextureSize(128, 64);
      bellows.mirror = true;
      setRotation(bellows, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    base.render(f5);
    pipe.render(f5);
  }
  
  public void renderMove(float f5){
	  move.render(f5);
  }
  
  public void renderBellows(float f5){
	  bellows.render(f5);
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
