package lazersmoke.playerdump.common.handler;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import net.minecraft.client.Minecraft;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.Phase;
import cpw.mods.fml.common.gameevent.TickEvent.WorldTickEvent;

public final class CommonTickHandler{

	@SubscribeEvent
	public void onTick(WorldTickEvent event) throws IOException{
		if(event.phase == Phase.END){
			Files.write(Paths.get("/home", "sam", "playerDumpInfo"), "Info:".getBytes(), StandardOpenOption.CREATE);
			writeToTextFile("/home/sam/playerDumpInfo", "" + Minecraft.getMinecraft().thePlayer.getHealth());
		}
	}

	public static void writeToTextFile(String fileName, String content)
			throws IOException{
		Files.write(Paths.get(fileName), content.getBytes(),
				StandardOpenOption.CREATE);
	}
}