package common.cout970.UltraTech.managers;


import java.util.logging.Level;

import net.minecraftforge.common.config.Configuration;
import ultratech.api.power.multipart.MicroPartUtil;
import common.cout970.UltraTech.handlers.FuelHandler;
import common.cout970.UltraTech.handlers.GuiHandler;
import common.cout970.UltraTech.handlers.WorldGen;
import common.cout970.UltraTech.microparts.MicroRegistry;
import common.cout970.UltraTech.network.Net_Utils;
import common.cout970.UltraTech.network.PacketUpdate;
import common.cout970.UltraTech.packets.PacketClimateStation;
import common.cout970.UltraTech.packets.PacketController;
import common.cout970.UltraTech.packets.PacketCrafter;
import common.cout970.UltraTech.packets.PacketMachineMode;
import common.cout970.UltraTech.packets.PacketPainter;
import common.cout970.UltraTech.packets.PacketTesseract;
import common.cout970.UltraTech.proxy.CommonProxy;
import common.cout970.UltraTech.util.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;



@Mod(modid = InformationManager.MOD_ID, name = InformationManager.MOD_ID,version = "0.9.0.4",guiFactory = InformationManager.GUI_FACTORY)


public class UltraTech {

	@Instance("UltraTech")
	public static UltraTech instance;
	
	@SidedProxy(clientSide="common.cout970.UltraTech.proxy.ClientProxy",serverSide="common.cout970.UltraTech.proxy.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		LogHelper.log("Starting PreInit");
		ConfigManager.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigManager());
		
		if (Loader.isModLoaded("ForgeMultipart") && Loader.isModLoaded("CodeChickenCore")){
			MicroPartUtil.isMicroPartActived = true;
		}
		ItemManager.InitItems();
		ItemManager.RegisterItems();
		
		BlockManager.InitBlocks();
		BlockManager.RegisterBlocks();
		
		FluidManager.InitFluids();
		FluidManager.RegisterFluids();
		
		LogHelper.log("Finishing PreInit");
		if(InformationManager.debug)Language.setupLangFile(); //for lag file only in debug
	}

	@EventHandler
	public void load(FMLInitializationEvent event){
		LogHelper.log("Starting Init");
		Net_Utils.PipeLine.channels = NetworkRegistry.INSTANCE.newChannel("UltraTech", Net_Utils.PipeLine);
		Net_Utils.PipeLine.RegisterPackets();
		
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
		if(MicroPartUtil.isMicroPartActived) new MicroRegistry().load();
		CompatibilityManager.initCompatibilitys();
		GameRegistry.registerFuelHandler(new FuelHandler());
		CraftManager.registerCraft();
		GameRegistry.registerWorldGenerator(new WorldGen(), 10);
		proxy.registerRenders();
		LogHelper.log("Finishing Init");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		Net_Utils.PipeLine.postInitialise();
	}
}