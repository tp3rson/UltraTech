package common.cout970.UltraTech.util;

import net.minecraft.nbt.NBTTagCompound;
import cofh.api.tileentity.IRedstoneControl;
import cofh.api.tileentity.IRedstoneControl.ControlMode;
import common.cout970.UltraTech.managers.MachineData;
import common.cout970.UltraTech.misc.IUpdatedEntity;
import common.cout970.UltraTech.util.power.Machine;

public class ConfigurableMachine extends Machine implements IUpdatedEntity,IRedstoneControl{
	
	public boolean isRedstonePower;
	public ControlMode Mode = ControlMode.LOW;

	public ConfigurableMachine(MachineData a) {
		super(a);
	}

	@Override
	public void onNeigUpdate() {
		setPowered(worldObj.isBlockIndirectlyGettingPowered(xCoord, yCoord, zCoord));
	}
	
	public boolean shouldWork(){
		if(Mode == ControlMode.DISABLED)return true;
		if(Mode == ControlMode.LOW && !isRedstonePower)return true;
		if(Mode == ControlMode.HIGH && isRedstonePower)return true;
		return false;
	}

	@Override
	public void setPowered(boolean isPowered) {
		isRedstonePower = isPowered;
	}

	@Override
	public boolean isPowered() {
		return isRedstonePower;
	}

	@Override
	public void setControl(ControlMode control) {
		Mode = control;
	}

	@Override
	public ControlMode getControl() {
		return Mode;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbtTagCompound) {
		super.readFromNBT(nbtTagCompound);
		Mode = ControlMode.values()[nbtTagCompound.getInteger("rsMode")];
	}
	
	@Override
	public void writeToNBT(NBTTagCompound nbtTagCompound) {
		super.writeToNBT(nbtTagCompound);
		nbtTagCompound.setInteger("rsMode", Mode.ordinal());
	}
}