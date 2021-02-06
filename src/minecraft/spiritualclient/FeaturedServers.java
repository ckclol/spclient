package spiritualclient;

import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.util.ResourceLocation;

public class FeaturedServers extends ServerData{
    public static final ResourceLocation STAR_ICON = new ResourceLocation("spiritualclient/star.png");
	public FeaturedServers(String serverName, String serverIP) {
		super(serverName, serverIP, false);
		
	}

}
