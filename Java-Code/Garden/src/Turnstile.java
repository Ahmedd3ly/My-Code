
public class Turnstile implements Runnable {
	private Garden garden;
	private Counter people;
	private int sleepScaler = 10;
	private String name = Thread.currentThread().getName();

	public Turnstile(Counter people) {
		this.people = people;
	}

	public void run() {
		try {
			double random = Math.random();
			for (int i = 0; i < garden.MAX; i++) {
				Thread.sleep((long) (random * sleepScaler));
				people.increment();
				System.out.println(people.getValue() + " has entered the garden.");
			}
		} catch (InterruptedException ex) {
			System.out.println(name + " was interrupted.");
			return;
		}
	}
}
