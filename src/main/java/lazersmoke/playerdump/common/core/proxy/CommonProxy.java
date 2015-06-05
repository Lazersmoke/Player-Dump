package lazersmoke.playerdump.common.core.proxy;

import lazersmoke.playerdump.common.PlayerDump;
import lazersmoke.playerdump.common.handler.ConfigHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.event.FMLServerStoppingEvent;

public class CommonProxy{

	public void preInit(FMLPreInitializationEvent event){
		ConfigHandler.loadConfig(event.getSuggestedConfigurationFile());
	}

	public void init(FMLInitializationEvent event){}

	public void postInit(FMLPostInitializationEvent event){
		PlayerDump.logger
				.info("PlayerDump posted!");
	}

	public void serverStarting(FMLServerStartingEvent event){
		// NO-OP

	}

	public void serverStopping(FMLServerStoppingEvent event){
		// NO-OP
	}
}