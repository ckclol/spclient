package spiritualclient.event;

public class EventCancellable {

	private boolean cancelled = false;
	public boolean isCancelled() {
		return cancelled;
	}
	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}
	
}
