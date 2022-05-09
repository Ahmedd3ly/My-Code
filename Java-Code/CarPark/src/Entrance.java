
public class Entrance implements Runnable {
	private Controller controller;
	private String name;
	private int sleepScaler = 10;
	
	public Entrance(Controller controller, String name) {
		this.controller = controller;
		this.name = name;
	}

	@Override
	public void run() {
		while (true) {
			try {
				double random = Math.random();
				Thread.sleep((long) (random * sleepScaler));
				int tmp = controller.getCarCount();
				controller.enter();
				int current = controller.getCarCount();
				System.out.println("Arrived: " + (current-tmp));
			} catch (InterruptedException ex) {
				System.out.println("Interrupted Arrival Thread");
				return;
			}
		}
	}
}