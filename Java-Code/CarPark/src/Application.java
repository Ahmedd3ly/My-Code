
public class Application {
	 public static void main(String[] args) throws InterruptedException {
	        String name = "ParKing";
	        int capacity = 10;
	        Parking parking = new Parking(name, capacity);
	        parking.start();
	        Thread.sleep(60000);
	        parking.end();
	    }
}
