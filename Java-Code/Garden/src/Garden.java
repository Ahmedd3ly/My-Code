
public class Garden {
	public static final int MAX = 100;
	private Counter counter;
	private Turnstile west;
	private Turnstile east;

	Thread gateWest;
	Thread gateEast;
	
	public int getCount() {
		return counter.getValue();
	}

	public void go() {
		while (counter.getValue() < MAX) {
			gateWest = new Thread(west);
			gateEast = new Thread(east);
			gateWest.start();
			gateEast.start();
		}
		gateWest.interrupt();
		gateEast.interrupt();
	}
}
