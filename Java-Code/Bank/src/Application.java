
public class Application {
	public static void main(String[] args)
			throws InterruptedException {
		Bank bank = new Bank("Ahly Bank");
		
		Account c1 = new Account (bank, "Harry Potter", 50000);
		Account c2 = new Account (bank, "Hermione Granger", 10000);
		
		Thread t1 = new Thread (c1);
		Thread t2 = new Thread (c2);
		
		t1.start();
		t2.start();
		
		Thread.sleep(10000);
		
		t1.interrupt();
		t2.interrupt();
		
	}
}
