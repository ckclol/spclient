package spiritualclient;

import spiritualclient.event.ClientTickEvent;
import spiritualclient.event.EventTarget;

public class TestClass {

	@EventTarget
	public void fooBlah4395439(ClientTickEvent e) {
		System.out.println("Client tick thingy actvated");
	}
	
}
