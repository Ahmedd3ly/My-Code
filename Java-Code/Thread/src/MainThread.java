
public class MainThread {

	public static void main(String[] args) 
			throws InterruptedException {
		Counter count = new Counter();
		
		Thread t1 = new Thread(count);
		Thread t2 = new Thread(count);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		HelloRunnable c1 = new HelloRunnable();
		HelloThread c2 = new HelloThread();
		
		Thread tc1 = new Thread(c1);
		Thread tc2 = new Thread(c2);
		
		tc1.start();
		tc2.start();
		
		tc1.join();
		tc2.join();
		
		
		
		

	}

}
