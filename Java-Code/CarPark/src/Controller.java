// passive (monitor) class
public class Controller {
	private int capacity;
	private int carCount;

	public Controller(int capacity) {
		this.capacity = capacity;
	}

	public void increment() {
		carCount++;
	}

	public void decrement() {
		carCount--;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getCarCount() {
		return carCount;
	}

	public synchronized void enter() 
			throws InterruptedException {
		while (carCount == capacity) {
			System.out.println("The parking is full!");
			wait();
		}
		this.increment();
	}

	public synchronized void leave() {
		if (carCount > 0) {
			this.decrement();
		}
		notify();
	}
}
