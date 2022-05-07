
public class Application {
	public static void main(String[] args) throws InterruptedException {
		Garden green = new Garden();
		green.go();
		Thread.sleep(5000);
	}

}
