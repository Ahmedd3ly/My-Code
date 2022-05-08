
public class HelloThread extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " extends Thread.");
	}

}
