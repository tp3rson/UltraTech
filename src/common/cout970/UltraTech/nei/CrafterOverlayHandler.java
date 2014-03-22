package common.cout970.UltraTech.nei;

import common.cout970.UltraTech.TileEntities.Tier1.CrafterEntity;
import common.cout970.UltraTech.lib.UT_Utils;
import common.cout970.UltraTech.machines.gui.CrafterGui;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.item.ItemStack;
import codechicken.nei.api.IOverlayHandler;
import codechicken.nei.recipe.IRecipeHandler;

public class CrafterOverlayHandler implements IOverlayHandler {

	@Override
	public void overlayRecipe(GuiContainer firstGui, IRecipeHandler recipe,
			int recipeIndex, boolean shift) {

		if(firstGui instanceof CrafterGui){
			CrafterGui crafter = (CrafterGui) firstGui;
			
			CrafterEntity entity = (CrafterEntity) crafter.entity.worldObj.getBlockTileEntity(crafter.entity.xCoord, crafter.entity.yCoord, crafter.entity.zCoord);
			
			
			for(int z = 0; z < 9; z++){
				entity.craft.setInventorySlotContents(z, null);
				UT_Utils.sendPacket(entity, z,0);
			}
			
			for(int z = 0; z < recipe.getIngredientStacks(recipeIndex).size(); z++){
				
				int x,y;
				x = recipe.getIngredientStacks(recipeIndex).get(z).relx;
				y = recipe.getIngredientStacks(recipeIndex).get(z).rely;
				
				int slot = 0;
				if(x == 25){
					if(y == 6){
						slot = 0;
					}
					if(y == 24){
						slot = 3;
					}
					if(y == 42){
						slot = 6;
					}
				}
				if(x == 43){
					if(y == 6){
						slot = 1;
					}
					if(y == 24){
						slot = 4;
					}
					if(y == 42){
						slot = 7;
					}
				}
				if(x == 61){
					if(y == 6){
						slot = 2;
					}
					if(y == 24){
						slot = 5;
					}
					if(y == 42){
						slot = 8;
					}
				}
				ItemStack i = recipe.getIngredientStacks(recipeIndex).get(z).item;
				entity.craft.setInventorySlotContents(slot, i);
				UT_Utils.sendPacket(entity, slot,0);
			}
			entity.update();
		}
	}
}
