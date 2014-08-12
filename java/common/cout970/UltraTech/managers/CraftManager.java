package common.cout970.UltraTech.managers;

import static common.cout970.UltraTech.managers.BlockManager.*;
import static common.cout970.UltraTech.managers.ItemManager.ItemName;
import ultratech.api.power.multipart.MultipartReference;
import ultratech.api.recipes.Boiler_Recipes;
import ultratech.api.recipes.Chemical_Recipe;
import ultratech.api.recipes.Refinery_Recipe;
import ultratech.api.recipes.Fermenter_Recipe;
import ultratech.api.recipes.RecipeRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import common.cout970.UltraTech.TileEntities.electric.tiers.FluidGeneratorT1_Entity;
import common.cout970.UltraTech.microparts.MicroRegistry;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftManager {

	public static void registerCraft(){

		//crafting laminator
		//blocks
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Chasis,1,0),new Object[]{"aaa","a a","aaa",'a',"ingotAluminum"}));																							//chasis mk1
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Chasis,1,1),new Object[]{"aaa","aba","aaa",'a',"plateGrafeno",'b',"itemPlastic"}));																		//chasis mk2
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Chasis,1,2),new Object[]{"aaa","aba","aaa",'a',"plateDiamond",'b',new ItemStack(Chasis,1,1)}));															//chasis mk3
		//tier1
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Crafter,1,0),new Object[]{"a","b","c",'a',Blocks.crafting_table,'b',new ItemStack(Chasis,1,0),'c',Blocks.chest})); 										//crafter
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CVD_T1,1,0),new Object[]{"aca","cbc","aca",'a',"ingotIron",'b',new ItemStack(Chasis,1,0),'c',"ingotAluminum"}));   										//cvd t1
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Furnace_T1,1,0),new Object[]{"aaa","aba","aaa",'a',"ingotIron",'b',new ItemStack(Chasis,1,0)}));   				 										//furnace t1
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Cutter_T1,1,0),new Object[]{"aca","cbc","aca",'a',"ingotTin",'b',new ItemStack(Chasis,1,0),'c',"dustDiamond"}));   										//cutter t1
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Purifier_T1,1,0),new Object[]{"aca","cbc","aca",'c',"ingotTin",'b',new ItemStack(Chasis,1,0),'a',"ingotAluminum"}));										//purifier t1
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Laminator_T1,1,0),new Object[]{"aaa","aba","aaa",'a',"ingotTin",'b',new ItemStack(Chasis,1,0)}));															//laminator t1
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Generator_T1,1,0),new Object[]{"aaa","cba","aaa",'a',"ingotIron",'b',new ItemStack(Chasis,1,0),'c',ItemName.get("Dynamo")}));								//generator t1
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(FluidGenerator_T1,1,0),new Object[]{"aaa","cba","aaa",'a',"ingotTin",'b',new ItemStack(Chasis,1,0),'c',ItemName.get("Dynamo")}));							//fluid generator t1

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ChargeStation,1,0),new Object[]{"aaa","aba","ccc",'a',"plateCopper",'b',new ItemStack(Chasis,1,0),'c',"plateIron"}));										//charge station
		//tier2
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Painter,1,0),new Object[]{"aca","aba","aca",'a',Blocks.wool,'b',new ItemStack(Chasis,1,0),'c',"ingotCopper"}));											//painter 
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Fermenter,1,0),new Object[]{"ata","aba","aca",'a',"plateAluminum",'b',new ItemStack(Chasis,1,0),'c',"plateTin",'t',Tank}));								//fermenter 
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Tank,1,0),new Object[]{"aca","cxc","aca",'a',"plateCopper",'c',"paneGlass"}));																				//tank 
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ChemicalPlant_T1,1,0),new Object[]{"bbb","ama","bbb",'b',Items.glass_bottle,'a',"plateGrafeno",'m',new ItemStack(Chasis,1,0)}));							//chemical plant t1
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ChemicalPlant_T2,1,0),new Object[]{"bbb","ama","bbb",'b',Items.glass_bottle,'a',"plateGrafeno",'m',new ItemStack(Chasis,1,1)}));							//chemical plant t2
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Heater,1,0),new Object[]{"bbb","aaa","bbb",'b',"plateGrafeno",'a',ItemName.get("HeatCoil")}));																//heater
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(LavaGenerator_T1,1,0),new Object[]{"ooo","tmt","ooo",'o',"plateObsidian",'t',Tank,'m',new ItemStack(Chasis,1,0)}));										//lava generator T1
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(LavaGenerator_T2,1,0),new Object[]{"ooo","tmt","ooo",'o',"plateObsidian",'t',Tank,'m',new ItemStack(Chasis,1,1)}));										//lava generator T2

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CVD_T2,1,0),new Object[]{"aca","cbc","aca",'a',"plateIron",'b',new ItemStack(Chasis,1,1),'c',"plateAluminum"}));   										//cvd t2
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Furnace_T2,1,0),new Object[]{"aaa","aba","aaa",'a',"plateIron",'b',new ItemStack(Chasis,1,1)}));   				 										//furnace t2
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Cutter_T2,1,0),new Object[]{"aca","cbc","aca",'a',"plateTin",'b',new ItemStack(Chasis,1,1),'c',"dustDiamond"}));   										//cutter t2
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Purifier_T2,1,0),new Object[]{"aca","cbc","aca",'c',"plateTin",'b',new ItemStack(Chasis,1,1),'a',"plateAluminum"}));										//purifier t2
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Laminator_T2,1,0),new Object[]{"aaa","aba","aaa",'a',"plateTin",'b',new ItemStack(Chasis,1,1)}));															//laminator t2
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Generator_T2,1,0),new Object[]{"aaa","cba","aaa",'a',"plateIron",'b',new ItemStack(Chasis,1,1),'c',ItemName.get("Dynamo")}));								//generator t2
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(FluidGenerator_T2,1,0),new Object[]{"aaa","cba","aaa",'a',"plateTin",'b',new ItemStack(Chasis,1,1),'c',ItemName.get("Dynamo")}));							//fluid generator t2

		//tier 3
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Tier3,1,0),new Object[]{"dpd","gmg","scs",'m',new ItemStack(Chasis,1,2),'d',"plateDiamond",'g',"plateGold",'s',"plateSilver",'c',ItemName.get("AdvCircuit"),'p',Items.diamond_pickaxe}));//miner
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Tier3,1,1),new Object[]{"oio","csc","omo",'m',new ItemStack(Chasis,1,2),'i',"plateSilicon",'s',"plateSilver",'c',ItemName.get("Circuit")}));				//hologram emiter
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Tier3,1,2),new Object[]{"rrr","ggg","cmc",'m',new ItemStack(Chasis,1,2),'r',"plateObalti",'g',"plateSilver",'c',ItemName.get("Circuit")}));				//molecular assembly
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Tier3,1,3),new Object[]{"zxz","xmx","zxz",'m',new ItemStack(Chasis,1,2),'z',"plateSilver",'x',ItemName.get("AdvCircuit")}));								//climate station
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Tier3,1,4),new Object[]{"aga","gmg","aga",'m',new ItemStack(Chasis,1,2),'g',Items.ender_pearl,'a',ItemName.get("AdvCircuit")}));							//tesseract

		//models
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SolarPanel_T1,1), new Object[]{"hhh","aaa","bbb",'h',"plateSilicon",'a',"plateSilver",'b', "plateGrafeno"}));												//solarPanel
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SolarPanel_T2,1), new Object[]{"hhh","hah","hhh",'h',SolarPanel_T1,'a',"plateSilver"}));																	//solarPanel 2
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(WindMill,1),new Object[]{"dff","poo","coo",'d',ItemName.get("Dynamo"),'f',ItemName.get("Fan"),'p',"plateGrafeno",'c',new ItemStack(Chasis,1,1)}));			//windmil
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Engine,1),new Object[]{"sss","xlx","gpg",'p',Blocks.piston,'g',ItemName.get("AluminumGear"),'l',"blockGlass",'s',"plateSilver"}));							//engine
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(KineticGenerator,1),new Object[]{"gsg","sds","gsg",'d',ItemName.get("Dynamo"),'g',ItemName.get("AluminumGear"),'s',stoneblockblack}));						//kineticgenerator
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CopperPipe,8),new Object[]{"aga",'a',"plateCopper",'g',Blocks.glass_pane}));																				//copper pipe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Boiler,1),new Object[]{"ctc","cac","ccc",'c',"plateCopper",'t',CopperPipe}));																				//boiler
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Turbine,1),new Object[]{"xrx","iri","xdx",'x',"plateGrafeno",'i',Blocks.glass,'r',ItemName.get("Fan"),'d',ItemName.get("Dynamo")}));						//turbine
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Dynamo,1),new Object[]{"xsx","gag","ara",'s',"plateSilver",'g',ItemName.get("AluminumGear"),'a',"plateAluminum",'r',Items.redstone}));						//Dynamo
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Pump,1),new Object[]{"gtg","gpg","gmg",'g',"plateGrafeno",'m',ItemName.get("Motor"),'p',CopperPipe,'t',Tank}));											//pump

		//multiblocks
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Refinery_Base,9), new Object[]{"sss","sps","sss",'s',stoneblockblack,'p',CopperPipe}));																	//refinery base
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Refinery_IO,1), new Object[]{"sts","bpb","sbs",'t',Tank,'p',Refinery_Base,'s',stoneblockblack}));															//refinery IO
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Refinery_Structure,9), new Object[]{"sts","tpt","sts",'p',CopperPipe,'t',"plateCopper"}));																	//refinery structure
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Refinery_Core,1), new Object[]{"sss","sps","sss",'s',CopperPipe,'p',Refinery_Base}));																		//refinery core

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Reactor_Wall,8),new Object[]{"ooo","olo","ooo",'l',"plateLead",'o',"plateGrafeno"}));																		//reactor wall
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Reactor_Control,1),new Object[]{"ooo","rlr","ooo",'l',Reactor_Wall,'o',"plateGrafeno",'r',"plateRedstone"}));												//reactor control
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Reactor_IO,1),new Object[]{"oho","olo","oho",'l',Reactor_Wall,'o',"plateGrafeno",'h',Blocks.hopper}));														//reactor io
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Reactor_Tank,1), Reactor_Wall, Tank));																													//reactor tank
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Reactor_Water,1),new Object[]{"ooo","hlh","ooo",'l',Reactor_Wall,'o',"plateGrafeno",'h',ItemName.get("Circuit")}));										//reactor water
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Reactor_Redstone,1),new Object[]{"ooo","olo","ooo",'l',Reactor_Wall,'o',"plateRedstone"}));																//reactor redstone
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Reactor_Chamber,1),new Object[]{"eoe","olo","eoe",'l',new ItemStack(Chasis,1,2),'o',"plateLead"}));														//reactor chamber
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Reactor_Core,1),new Object[]{"eoe","olo","eoe",'l',Reactor_Chamber,'o',ItemName.get("Circuit"),'e',"plateLead"}));											//reactor core

		//storage
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage,1,0),new Object[]{"ccc","aaa","ccc",'a',ItemName.get("ElectricCell"),'c',"plateGrafeno"}));														//storage mk1
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage,1,1),new Object[]{"cpc","ama","cpc",'m',new ItemStack(Chasis,1,1),'c',"plateGrafeno",'p',"plateSilver",'a',ItemName.get("MediumElectricCell")}));	//storage mk2
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage,1,2),new Object[]{"cpc","ama","cpc",'m',new ItemStack(Chasis,1,2),'c',"plateGrafeno",'p',"plateSilver",'a',ItemName.get("BigElectricCell")}));		//storage mk3
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage,1,3),new Object[]{"aaa","ama","aaa",'m',new ItemStack(Chasis,1,2),'a',ItemName.get("BigElectricCell")}));											//storage mk4

		//items
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemName.get("Dynamo"),1),new Object[]{"sa ","iii","sa ",'i',"ingotIron",'s',"ingotSilver",'a',"ingotAluminum"}));											//dynamo
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemName.get("Fan"),1), new Object[]{"rxr","xgx","rxr",'g',"plateGrafeno",'r',"itemRubber"}));																//fan
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemName.get("AluminumGear"),1), new Object[]{"rxr","xgx","rxr",'x',"plateAluminum",'g',"ingotIron"}));													//gear
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemName.get("SulfuricAcid"),1),new Object[]{"ws",'w',Items.potionitem,'s',"dustSulfur"}));																//sulfuric acid
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemName.get("ElectricCell"),1),new Object[]{"cal",'c',"plateCopper",'l',"plateLead",'a',ItemName.get("SulfuricAcid")}));									//electric cell
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemName.get("MediumElectricCell"),1),new Object[]{"ccc","ccc","ccc",'c',ItemName.get("ElectricCell")}));													//medium electric cell
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemName.get("BigElectricCell"),1),new Object[]{"ccc","ccc","ccc",'c',ItemName.get("MediumElectricCell")}));												//big electric cell
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.gunpowder,3),new Object[]{"cs",'c',Items.coal,'s',"dustSulfur"}));																					//gunpowder
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemName.get("Battery"),1),new Object[]{"ese","clc","glg",'s',"plateSilver",'l',ItemName.get("ElectricCell"),'c',"plateCopper",'g',"plateGrafeno"}));		//battery
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemName.get("Tablet"),1),new Object[]{"gga","gga","aaa",'g',"blockGlass",'a',"ingotAluminum"}));															//tablet
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemName.get("AdvCircuit"),1), new Object[]{"hph","hah","hlh",'h',ItemName.get("SilverCable"),'a',"plateSilicon",'p',"plateDiamond",'l',"itemPlastic"}));	//adv circuit
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemName.get("Motor"),1), new Object[]{"rc ","iii","rc ",'c',ItemName.get("Coil"),'r', "plateSilver",'i',"plateIron"}));									//motor
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemName.get("Coil"),2), new Object[]{"r","p","r",'p',"plateIron",'r',"plateRedstone"}));																	//redstone coil
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemName.get("Circuit"),1),new Object[]{"igi","iri","igi",'g',"plateGrafeno",'r',"plateRedstone",'i',Items.redstone}));									//Circuit
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemName.get("Linker"),1),new Object[]{"iio","iio","oox",'i',"plateIron",'x',"plateRedstone"}));															//Linker
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemName.get("RadioniteCell"),1),new Object[]{"ioi","ioi","ioi",'i',"plateIron",'o',"plateRadionite"}));													//Radionite Cell
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemName.get("UraniumCell"),1),new Object[]{"ioi","ioi","ioi",'i',"plateIron",'o',"ingotUranium"}));														//Uranium Cell
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemName.get("ThoriumCell"),1),new Object[]{"ioi","ioi","ioi",'i',"plateIron",'o',"ingotThorium"}));														//Thorium Cell
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemName.get("PlutoniumCell"),1),new Object[]{"ioi","ioi","ioi",'i',"plateIron",'o',"ingotPlutonium"}));													//Plutonium Cell
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemName.get("Ingot"),2,0),new Object[]{"ii",'i',"ingotAluminium"}));																						//aluminium change
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemName.get("GrafenoPlate"),1),new Object[]{"iii","iii","iii",'i',"plateGrafeno"}));																		//plate grafeno
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemName.get("LaserSword"),1),new Object[]{"c","c","i",'i',"plateObalti",'c',"plateDiamond"}));															//sword
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemName.get("HeatCoil"),1), new Object[]{"pp","pp",'p',"plateLead"}));																					//heat coil
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemName.get("Dust"),3,5), new Object[]{"abc",'a',"dustObsidian",'b',"dustAluminum",'c',"dustTin"}));														//obalti
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemName.get("Bottle"),8,0), new Object[]{"xcx","cgc","xcx",'x',"itemPlastic",'g',Blocks.glass}));															//bottle
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemName.get("Radionite"),9), new ItemStack(Misc, 0)));																									//Radionite
		
		//upgrades
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemName.get("UpgradeBase"),4),new Object[]{"iii","ici","iii",'i',"plateIron",'c',ItemName.get("Circuit")}));												//upgrade base
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemName.get("SpeedUpgrade"),1),new Object[]{"iii","ici","iii",'i',"plateSilver",'c',ItemName.get("UpgradeBase")}));										//speed upgrade
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemName.get("MiningUpgrade"),1),new Object[]{"iii","ici","iii",'i',"plateGold",'c',ItemName.get("UpgradeBase")}));										//mining upgrade
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemName.get("RangeUpgrade"),4),new Object[]{"iii","ici","iii",'i',"plateRedstone",'c',ItemName.get("UpgradeBase")}));										//range upgrade
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemName.get("AutoEjectUpgrade"),1),new Object[]{"iii","ici","iii",'i',"plateTin",'c',ItemName.get("UpgradeBase")}));										//auto eject upgrade
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemName.get("FortuneUpgrade"),1),new Object[]{"iii","ici","iii",'i',"plateDiamond",'c',ItemName.get("UpgradeBase")}));									//fortune upgrade
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemName.get("SilkTouchUpgrade"),1),new Object[]{"iui","ucu","iui",'i',Items.diamond,'u',Items.emerald,'c',ItemName.get("UpgradeBase")}));					//silktouch upgrade

		if(!MultipartReference.isMicroPartActived){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CableBlock,6), new Object[]{"sss","lll","sss",'s',Items.string,'l',ItemName.get("SilverCable")}));
		}else{
			//cables
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MicroRegistry.PlaneCable,2), new Object[]{"ttt","tst","ttt",'s',ItemName.get("SilverCable"),'t',Items.string}));											//plane cable (ribbon)
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MicroRegistry.BigCable,1),new Object[]{"ttt","tst","ttt",'s',"plateSilver",'t',Items.string}));															//Big cable
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MicroRegistry.PlaneCable,6), new Object[]{"ttt","sss","ttt",'s',ItemName.get("SilverCable"),'t',Blocks.wool}));											//plane cable (ribbon)
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MicroRegistry.BigCable,3),new Object[]{"ttt","sss","ttt",'s',"plateSilver",'t',Blocks.wool}));																//Big cable
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MicroRegistry.PlaneCable,12), new Object[]{"ttt","sss","ttt",'s',ItemName.get("SilverCable"),'t',ItemName.get("Rubber_vulcanized")}));						//plane cable (ribbon)
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MicroRegistry.BigCable,8),new Object[]{"ttt","tst","ttt",'s',"plateSilver",'t',ItemName.get("Rubber_vulcanized")}));										//Big cable
		}

		//deco
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AlienBlock,8),new Object[]{"oo","oo",'o',"plateObalti"}));																										//alien block
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CovedGlass,4),new Object[]{"oo","oo",'o',"plateSilicon"}));																									//coved glass
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(DiamondGlass,6),new Object[]{"xx","xx",'x',"plateDiamond"}));																									//diamond glass
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MultiTank,4),new Object[]{"pgp","ggg","pgp",'p',"plateAluminum",'g',"blockGlass"}));																			//MultiTank
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockManager.Misc,1,0),new Object[]{"iii","iii","iii",'i',ItemName.get("Radionite")}));																		//Radionite block
		

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockManager.stoneblockblack,4,1),new Object[]{"ii","ii",'i',new ItemStack(BlockManager.stoneblockblack,4,0)}));												//stoneblock black bricks
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockManager.stoneblockwhite,4,1),new Object[]{"ii","ii",'i',new ItemStack(BlockManager.stoneblockwhite,4,0)}));												//stoneblock white bricks
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(stoneblockblack,1,2), new ItemStack(stoneblockblack,1,1)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(stoneblockblack,1,3), new ItemStack(stoneblockblack,1,2)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(stoneblockblack,1,4), new ItemStack(stoneblockblack,1,3)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(stoneblockblack,1,5), new ItemStack(stoneblockblack,1,4)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(stoneblockblack,1,6), new ItemStack(stoneblockblack,1,5)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(stoneblockblack,1,7), new ItemStack(stoneblockblack,1,6)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(stoneblockblack,1,8), new ItemStack(stoneblockblack,1,7)));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(stoneblockwhite,1,2), new ItemStack(stoneblockwhite,1,1)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(stoneblockwhite,1,3), new ItemStack(stoneblockwhite,1,2)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(stoneblockwhite,1,4), new ItemStack(stoneblockwhite,1,3)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(stoneblockwhite,1,5), new ItemStack(stoneblockwhite,1,4)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(stoneblockwhite,1,6), new ItemStack(stoneblockwhite,1,5)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(stoneblockwhite,1,7), new ItemStack(stoneblockwhite,1,6)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(stoneblockwhite,1,8), new ItemStack(stoneblockwhite,1,7)));

		//decoblocks
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(deco.get(0),9),new Object[]{"iii","isi","iii",'i',Blocks.stonebrick,'s',new ItemStack(stoneblockblack,1,0)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(deco.get(1),8),new Object[]{"iii","isi","iii",'s',Items.redstone,'i',new ItemStack(stoneblockblack,1,1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(deco.get(2),9),new Object[]{"iii","isi","iii",'s',Blocks.stone,'i',new ItemStack(stoneblockblack,1,0)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(deco.get(3),8),new Object[]{"rir","isi","rir",'s',Items.redstone,'i',new ItemStack(stoneblockblack,1,0),'r',new ItemStack(stoneblockblack,1,1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(deco.get(4),8),new Object[]{"rrr","isi","rrr",'i',Blocks.stone,'s',Items.redstone,'r',new ItemStack(stoneblockblack,1,1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(deco.get(5),9),new Object[]{"rir","iii","rir",'r',Blocks.stone,'i',new ItemStack(stoneblockblack,1,0)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(deco.get(6),9),new Object[]{"rir","iii","rir",'i',Blocks.stone,'r',new ItemStack(stoneblockblack,1,0)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(deco.get(7),8),new Object[]{"iii","isi","iii",'s',Items.redstone,'i',new ItemStack(stoneblockblack,1,0)}));

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(deco.get(8),9),new Object[]{"iii","isi","iii",'i',Blocks.stonebrick,'s',new ItemStack(stoneblockwhite,1,0)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(deco.get(9),8),new Object[]{"iii","isi","iii",'s',Items.redstone,'i',new ItemStack(stoneblockwhite,1,1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(deco.get(10),9),new Object[]{"iii","isi","iii",'s',Blocks.stone,'i',new ItemStack(stoneblockwhite,1,0)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(deco.get(11),8),new Object[]{"rir","isi","rir",'s',Items.redstone,'i',new ItemStack(stoneblockwhite,1,0),'r',new ItemStack(stoneblockwhite,1,1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(deco.get(12),8),new Object[]{"rrr","isi","rrr",'i',Blocks.stone,'s',Items.redstone,'r',new ItemStack(stoneblockwhite,1,1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(deco.get(13),9),new Object[]{"rir","iii","rir",'r',Blocks.stone,'i',new ItemStack(stoneblockwhite,1,0)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(deco.get(14),9),new Object[]{"rir","iii","rir",'i',Blocks.stone,'r',new ItemStack(stoneblockwhite,1,0)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(deco.get(15),8),new Object[]{"iii","isi","iii",'s',Items.redstone,'i',new ItemStack(stoneblockwhite,1,0)}));


		Smelting();//furnace laminator
	}

	public static void Smelting(){

		for(int r = 0;r < 5;r++)//dust to ingots
			GameRegistry.addSmelting(new ItemStack(ItemName.get("Dust"),1, r), new ItemStack(ItemName.get("Ingot"),1,r), 0.5f);
		GameRegistry.addSmelting(new ItemStack(ItemName.get("Dust"),1, 6), new ItemStack(Items.iron_ingot,1), 0.5f);
		GameRegistry.addSmelting(new ItemStack(ItemName.get("Dust"),1, 7), new ItemStack(Items.gold_ingot,1), 0.5f);

		for(int r = 1;r < 5;r++)//ores to ingots
			GameRegistry.addSmelting(new ItemStack(Ores,1,r),new ItemStack(ItemName.get("Ingot"),1,r-1), 0.5f);

		for(int r=0;r<5;r++)GameRegistry.addSmelting(new ItemStack(ItemName.get("MetalPlate"),1,r), new ItemStack(ItemName.get("Ingot"),1,r), 0.5f);
		GameRegistry.addSmelting(new ItemStack(ItemName.get("MetalPlate"),1,5), new ItemStack(Items.iron_ingot), 0.5f);
		GameRegistry.addSmelting(new ItemStack(ItemName.get("MetalPlate"),1,6), new ItemStack(Items.gold_ingot), 0.5f);

		//other
		GameRegistry.addSmelting(ItemName.get("RawMeal"), new ItemStack(ItemName.get("ProcesedFood")), 0.35f);
	}

}
