package spiritualclient;

public class ClientHandler {
	private static final ClientHandler INSTANCE = new ClientHandler();
	public static final ClientHandler getInstance() {
		return INSTANCE;
	}
	
	private DiscordRP discordRP = new DiscordRP();

	 public void init() {
		 discordRP.start();
	 }
	 public void shutdown() {
		 discordRP.shutdown();
	 }
	 public DiscordRP getDiscordRP() {
		 return discordRP;
	 }
}
