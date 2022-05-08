
public class Garden {
	public static final int MAX = 100;
	private Counter counter;
	private Turnstile west;
	private Turnstile east;

	Thread gateWest;
	Thread gateEast;

	public int getCount(){
        if (counter!=null)
            return counter.getValue();
        else
            return 0;
    }

	public void go() throws InterruptedException {
		counter = new Counter();
		// create Turnstiles
		west = new Turnstile(counter);
		east = new Turnstile(counter);
		// create threads
		gateWest = new Thread(west, "west");
		gateEast = new Thread(east, "east");
		// start threads
		gateWest.start();
		gateEast.start();
		// wait for threads to die
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
		System.out.println("Everyone has left the garden.");
	}

	private void leave() {
		try {
			double random = Math.random();
			Thread.sleep((long) (random * random));
			counter.decrement();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
