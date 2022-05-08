
public class Application {
	public static void main(String[] args) throws InterruptedException {
		Garden garden = new Garden();
		garden.go(); // run the garden
		Thread.sleep(1000); // sleep for one second 
		// count at the end
		System.out.println("People count at closing -> " + garden.getCount());
		garden.stop();// stop the garden
		Thread.sleep(1000);// sleep for one second 
	}
}
