package common.cout970.UltraTech.TileEntities.electric.tiers;

import ultratech.api.recipes.Cutter_Recipe;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import common.cout970.UltraTech.managers.MachineData;
import common.cout970.UltraTech.util.ConfigurableMachineWithInventory;

public class TileEntityFurnaceT1 extends ConfigurableMachineWithInventory implements ISidedInventory{

	public float Progres = 0;
	public int maxProgres = 80;
	public boolean hasEnergy;

	public TileEntityFurnaceT1() {
		super(2, "Furnace", MachineData.Furnace);
	}

	@Override
	public void updateEntity(){

		if(worldObj.isRemote)return;
		boolean changes = false;
		if(Progres > 0){
			double extract;
			if(maxProgres > 0)extract = MachineData.Furnace.use/maxProgres;
			else extract = MachineData.Furnace.use;
			removeCharge(extract);
		}
		if(!hasEnergy && shouldWork()){
			hasEnergy = this.getCharge() >= MachineData.Furnace.use;
		}
		if(hasEnergy && canSmelt()){
			Progres++;
			if(Progres >= maxProgres){
				Progres = 0;
				craft();
				changes = true;
				hasEnergy = false;
			}
		}else{
			Progres = 0;
		}
		if(changes){
			this.markDirty();
		}
	}
	
	private boolean canSmelt()
	{
		if (this.inventory[0] == null){
			return false;
		}else{
			ItemStack itemstack = FurnaceRecipes.smelting().getSmeltingResult(this.inventory[0]);
			if (itemstack == null) return false;
			if (this.inventory[1] == null) return true;
			if (!this.inventory[1].isItemEqual(itemstack)) return false;
			int result = inventory[1].stackSize + itemstack.stackSize;
			return (result <= getInventoryStackLimit() && result <= itemstack.getMaxStackSize());
		}
	}


	private void craft() {
		if(canSmelt()){
			ItemStack itemstack = FurnaceRecipes.smelting().getSmeltingResult(this.inventory[0]);

			if (this.inventory[1] == null){
				this.inventory[1] = itemstack.copy();
			}else if (this.inventory[1].isItemEqual(itemstack)){
				inventory[1].stackSize += itemstack.stackSize;
			}
			--this.inventory[0].stackSize;
			if (this.inventory[0].stackSize <= 0){
				this.inventory[0] = null;
			}
		}
	}

	//Synchronization
	
	public void sendGUINetworkData(Container cont,
			ICrafting c) {
		super.sendGUINetworkData(cont, c);
		c.sendProgressBarUpdate(cont, 2, (int)Progres);
		c.sendProgressBarUpdate(cont, 3, maxProgres);
	}


	public void getGUINetworkData(int id, int value) {
		super.getGUINetworkData(id, value);
		if(id == 2)Progres = value;
		if(id == 3)maxProgres = value;
	}
	
	//Save & Load
	
	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		Progres = nbt.getFloat("progres");
	}

	@Override
	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		nbt.setFloat("progres", Progres);
	}
	
	@Override
	public int[] getAccessibleSlotsFromSide(int var1) {
		return new int[]{0,1};
	}

	@Override
	public boolean canInsertItem(int var1, ItemStack var2, int var3) {
		return var1 == 0;
	}

	@Override
	public boolean canExtractItem(int var1, ItemStack var2, int var3) {
		return var1 == 1;
	}

}
