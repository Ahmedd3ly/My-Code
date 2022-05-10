
public class Application {
	public static void main(String[] args) throws InterruptedException {
		Garden garden = new Garden();
		garden.go(); // run the garden
		Thread.sleep(1000); // sleep for one second 
		garden.stop();// stop the garden
		Thread.sleep(1000);// sleep for one second 
	}
}
