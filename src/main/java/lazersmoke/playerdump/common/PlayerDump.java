package lazersmoke.playerdump.common;

import lazersmoke.playerdump.common.core.proxy.CommonProxy;
import lazersmoke.playerdump.common.lib.LibMisc;
import net.minecraft.creativetab.CreativeTabs;

import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.event.FMLServerStoppingEvent;

@Mod(modid = LibMisc.MOD_ID, name = LibMisc.MOD_NAME, version = LibMisc.VERSION, dependencies = LibMisc.DEPENDENCIES)
public class PlayerDump{

	public static Logger logger;

	public static boolean botaniaLoaded = false;
	public static boolean thaumcraftLoaded = false;
	public static boolean bloodMagicLoaded = false;

	@Instance(LibMisc.MOD_ID)
	public static PlayerDump instance;

	@SidedProxy(serverSide = LibMisc.PROXY_COMMON, clientSide = LibMisc.PROXY_CLIENT)
	public static CommonProxy proxy;

	public static CreativeTabs creativeTab;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		logger = event.getModLog();

		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event){
		proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		proxy.postInit(event);
	}

	@EventHandler
	public void serverStarting(FMLServerStartingEvent event){
		proxy.serverStarting(event);
	}

	@EventHandler
	public void serverStopping(FMLServerStoppingEvent event){
		proxy.serverStopping(event);
	}
}