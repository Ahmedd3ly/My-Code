
public class Application {
	public static void main(String[] args) throws InterruptedException {
		Garden garden = new Garden();
		garden.go();
		Thread.sleep(1000);
		System.out.println("Total inside: " + garden.getCount());
		garden.stop();
		System.out.println("Total inside: " + garden.getCount());
	}
}
