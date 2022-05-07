
public class Turnstile implements Runnable {
	private Counter people;
	private int sleepScaler = 10;
	private String name = Thread.currentThread().getName();

	public Turnstile(Counter people) {
		this.people = people;
	}

	public void run() {
		while (true) {
			try {
				double random = Math.random();
				Thread.sleep((long) (random * sleepScaler));
				people.increment();
				System.out.println(people.getValue() + " has entered.");
			} catch (InterruptedException ex) {
				System.out.println(name + " was interrupted.");
				return;
			}
		}
	}
}
