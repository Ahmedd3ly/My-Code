
public class Exit implements Runnable{
	private Controller controller;
	private String name;
	private int sleepScaler = 1000;
	
	public Exit (Controller controller, String name) {
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
				controller.leave();
				int current = controller.getCarCount();
				System.out.println("Departed: " + (tmp-current));
			} catch (InterruptedException ex) {
				System.out.println("Interrupted Departure Thread");
				return;
			}
		}
	}
}
