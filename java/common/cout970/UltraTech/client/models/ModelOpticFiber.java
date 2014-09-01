// Date: 16/08/2014 19:36:16
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX


package common.cout970.UltraTech.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelOpticFiber extends ModelBase
{
  //fields
    ModelRenderer baseRF;
    ModelRenderer baseFL;
    ModelRenderer baseLB;
    ModelRenderer baseBR;
    ModelRenderer connL;
    ModelRenderer connR;
    ModelRenderer connB;
    ModelRenderer connF;
    ModelRenderer FL;
    ModelRenderer LF;
    ModelRenderer LB;
    ModelRenderer BL;
    ModelRenderer BR;
    ModelRenderer RB;
    ModelRenderer RF;
    ModelRenderer FR;
    ModelRenderer pillarRF;
    ModelRenderer pillarFL;
    ModelRenderer pillarLB;
    ModelRenderer pillarBR;
  
  public ModelOpticFiber()
  {
    textureWidth = 32;
    textureHeight = 32;
    
      baseRF = new ModelRenderer(this, 20, 0);
      baseRF.addBox(-6F, 6F, -6F, 2, 2, 2);
      baseRF.setRotationPoint(0F, 16F, 0F);
      baseRF.setTextureSize(32, 32);
      baseRF.mirror = true;
      setRotation(baseRF, 0F, 0F, 0F);
      baseFL = new ModelRenderer(this, 20, 0);
      baseFL.addBox(4F, 6F, -6F, 2, 2, 2);
      baseFL.setRotationPoint(0F, 16F, 0F);
      baseFL.setTextureSize(32, 32);
      baseFL.mirror = true;
      setRotation(baseFL, 0F, 0F, 0F);
      baseLB = new ModelRenderer(this, 20, 0);
      baseLB.addBox(4F, 6F, 4F, 2, 2, 2);
      baseLB.setRotationPoint(0F, 16F, 0F);
      baseLB.setTextureSize(32, 32);
      baseLB.mirror = true;
      setRotation(baseLB, 0F, 0F, 0F);
      baseBR = new ModelRenderer(this, 20, 0);
      baseBR.addBox(-6F, 6F, 4F, 2, 2, 2);
      baseBR.setRotationPoint(0F, 16F, 0F);
      baseBR.setTextureSize(32, 32);
      baseBR.mirror = true;
      setRotation(baseBR, 0F, 0F, 0F);
      connL = new ModelRenderer(this, 0, 22);
      connL.addBox(4F, 6F, -4F, 2, 2, 8);
      connL.setRotationPoint(0F, 16F, 0F);
      connL.setTextureSize(32, 32);
      connL.mirror = true;
      setRotation(connL, 0F, 0F, 0F);
      connR = new ModelRenderer(this, 0, 22);
      connR.addBox(-6F, 6F, -4F, 2, 2, 8);
      connR.setRotationPoint(0F, 16F, 0F);
      connR.setTextureSize(32, 32);
      connR.mirror = true;
      setRotation(connR, 0F, 0F, 0F);
      connB = new ModelRenderer(this, 0, 18);
      connB.addBox(-4F, 6F, 4F, 8, 2, 2);
      connB.setRotationPoint(0F, 16F, 0F);
      connB.setTextureSize(32, 32);
      connB.mirror = true;
      setRotation(connB, 0F, 0F, 0F);
      connF = new ModelRenderer(this, 0, 18);
      connF.addBox(-4F, 6F, -6F, 8, 2, 2);
      connF.setRotationPoint(0F, 16F, 0F);
      connF.setTextureSize(32, 32);
      connF.mirror = true;
      setRotation(connF, 0F, 0F, 0F);
      FL = new ModelRenderer(this, 12, 4);
      FL.addBox(4F, 6F, -8F, 2, 2, 2);
      FL.setRotationPoint(0F, 16F, 0F);
      FL.setTextureSize(32, 32);
      FL.mirror = true;
      setRotation(FL, 0F, 0F, 0F);
      LF = new ModelRenderer(this, 12, 8);
      LF.addBox(6F, 6F, -6F, 2, 2, 2);
      LF.setRotationPoint(0F, 16F, 0F);
      LF.setTextureSize(32, 32);
      LF.mirror = true;
      setRotation(LF, 0F, 0F, 0F);
      LB = new ModelRenderer(this, 12, 12);
      LB.addBox(6F, 6F, 4F, 2, 2, 2);
      LB.setRotationPoint(0F, 16F, 0F);
      LB.setTextureSize(32, 32);
      LB.mirror = true;
      setRotation(LB, 0F, 0F, 0F);
      BL = new ModelRenderer(this, 20, 4);
      BL.addBox(4F, 6F, 6F, 2, 2, 2);
      BL.setRotationPoint(0F, 16F, 0F);
      BL.setTextureSize(32, 32);
      BL.mirror = true;
      setRotation(BL, 0F, 0F, 0F);
      BR = new ModelRenderer(this, 20, 8);
      BR.addBox(-6F, 6F, 6F, 2, 2, 2);
      BR.setRotationPoint(0F, 16F, 0F);
      BR.setTextureSize(32, 32);
      BR.mirror = true;
      setRotation(BR, 0F, 0F, 0F);
      RB = new ModelRenderer(this, 20, 12);
      RB.addBox(-8F, 6F, 4F, 2, 2, 2);
      RB.setRotationPoint(0F, 16F, 0F);
      RB.setTextureSize(32, 32);
      RB.mirror = true;
      setRotation(RB, 0F, 0F, 0F);
      RF = new ModelRenderer(this, 20, 16);
      RF.addBox(-8F, 6F, -6F, 2, 2, 2);
      RF.setRotationPoint(0F, 16F, 0F);
      RF.setTextureSize(32, 32);
      RF.mirror = true;
      setRotation(RF, 0F, 0F, 0F);
      FR = new ModelRenderer(this, 12, 0);
      FR.addBox(-6F, 6F, -8F, 2, 2, 2);
      FR.setRotationPoint(0F, 16F, 0F);
      FR.setTextureSize(32, 32);
      FR.mirror = true;
      setRotation(FR, 0F, 0F, 0F);
      pillarRF = new ModelRenderer(this, 0, 0);
      pillarRF.addBox(-6F, -8F, -6F, 2, 14, 2);
      pillarRF.setRotationPoint(0F, 16F, 0F);
      pillarRF.setTextureSize(32, 32);
      pillarRF.mirror = true;
      setRotation(pillarRF, 0F, 0F, 0F);
      pillarFL = new ModelRenderer(this, 0, 0);
      pillarFL.addBox(4F, -8F, -6F, 2, 14, 2);
      pillarFL.setRotationPoint(0F, 16F, 0F);
      pillarFL.setTextureSize(32, 32);
      pillarFL.mirror = true;
      setRotation(pillarFL, 0F, 0F, 0F);
      pillarLB = new ModelRenderer(this, 0, 0);
      pillarLB.addBox(4F, -8F, 4F, 2, 14, 2);
      pillarLB.setRotationPoint(0F, 16F, 0F);
      pillarLB.setTextureSize(32, 32);
      pillarLB.mirror = true;
      setRotation(pillarLB, 0F, 0F, 0F);
      pillarBR = new ModelRenderer(this, 0, 0);
      pillarBR.addBox(-6F, -8F, 4F, 2, 14, 2);
      pillarBR.setRotationPoint(0F, 16F, 0F);
      pillarBR.setTextureSize(32, 32);
      pillarBR.mirror = true;
      setRotation(pillarBR, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    baseRF.render(f5);
    baseFL.render(f5);
    baseLB.render(f5);
    baseBR.render(f5);
    connL.render(f5);
    connR.render(f5);
    connB.render(f5);
    connF.render(f5);
    FL.render(f5);
    LF.render(f5);
    LB.render(f5);
    BL.render(f5);
    BR.render(f5);
    RB.render(f5);
    RF.render(f5);
    FR.render(f5);
    pillarRF.render(f5);
    pillarFL.render(f5);
    pillarLB.render(f5);
    pillarBR.render(f5);
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