package common.cout970.UltraTech.items;

import buildcraft.api.tools.IToolWrench;
import common.cout970.UltraTech.machines.tileEntities.MinerEntity;
import common.cout970.UltraTech.machines.tileEntities.MinerEntity.Mode;
import common.cout970.UltraTech.machines.tileEntities.ReciverEntity;
import common.cout970.UltraTech.machines.tileEntities.SenderEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Linker extends UT_Item implements IToolWrench{


	public Linker(int id,String name) {
		super(id, name);
		this.setMaxStackSize(1);
	}

	@Override
	public boolean onItemUse(ItemStack i, EntityPlayer p, World w, int x, int y, int z, int par7, float par8, float par9, float par10)
	{
		//sender and reciver
		if(i == null)return false;
		if( i.stackTagCompound == null){
			i.setTagCompound( new NBTTagCompound());
			i.stackTagCompound.setIntArray("Coords", new int[]{0,0,0});
		}
		TileEntity te = w.getBlockTileEntity(x, y, z);
		if(te != null){
			if(te instanceof ReciverEntity){
				((ReciverEntity)te).setFrom(i.stackTagCompound.getIntArray("Coords"));
				return true;
			}else if(te instanceof SenderEntity){
				i.stackTagCompound.setIntArray("Coords", new int[]{x,y,z});
				return true;
			}else if(te instanceof MinerEntity){
				((MinerEntity)te).CreateMining();
				((MinerEntity)te).current = 0;
				switch(((MinerEntity)te).mode){
				case Horizontal:{
					((MinerEntity)te).mode = Mode.Vertical;
					break;
				}
				case Vertical:{
					((MinerEntity)te).mode = Mode.two;
					break;
				}
				case two:{
					((MinerEntity)te).mode = Mode.Horizontal;
					break;
				}
				}
				return true;
			}
		}

		return false;
	}
	public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		if( par1ItemStack.stackTagCompound == null)
			par1ItemStack.setTagCompound( new NBTTagCompound());
		par1ItemStack.stackTagCompound.setIntArray("Coords", new int[]{0,0,0});
	}

	@Override
	public boolean canWrench(EntityPlayer player, int x, int y, int z) {
		return true;
	}

	@Override
	public void wrenchUsed(EntityPlayer player, int x, int y, int z) {}
}
