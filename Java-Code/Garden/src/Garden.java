
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

	public void go() throws InterruptedException {
		counter = new Counter();

		west = new Turnstile(counter);
		east = new Turnstile(counter);

		gateWest = new Thread(west);
		gateEast = new Thread(east);

		gateWest.start();
		System.out.println("Opened west gate.");

		gateEast.start();
		System.out.println("Opened east gate.");

		gateWest.join();
		gateEast.join();
	}

	public void stop() throws InterruptedException {
		gateWest.interrupt();
		System.out.println("Closed west gate.");

		gateEast.interrupt();
		System.out.println("Closed east gate.");

		while (counter.getValue() > 0) {
			leave();
		}
	}

	private void leave() {
		try {
			double random = Math.random();
			Thread.sleep((long) (random * random));
			counter.decrement();
			System.out.println(counter.getValue() + " is leaving.");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
