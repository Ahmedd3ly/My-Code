// controller class
public class Parking {
	private String name;
	private Entrance entrance;
	private Exit exit;
	private Controller controller;
	private int capacity;

	Thread enter;
	Thread leave;

	public Parking(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
	}

	public void start() {
		controller = new Controller(this.capacity);
		// create entrance and exit
		this.entrance = new Entrance(controller, "In");
		this.exit = new Exit(controller, "Out");
		
		this.open();
	}

	public void open() {
		System.out.println("Opening the car park.");
		// threads for entering and leaving cars
		enter = new Thread(entrance);
		leave = new Thread(exit);
		// starting threads
		enter.start();
		leave.start();
	}

	public void close() {
		System.out.println("Closing the car park.");
		// killing the threads that are facilitating accessing and
		// leaving feature.
		enter.interrupt();
		leave.interrupt();
	}
	
	public void end() {
		this.close();
		
		while(controller.getCarCount()>0) {
			controller.leave();
			System.out.println("Cars left: " + controller.getCarCount());
		}
			System.out.println("All cars departed.");
	}
}
