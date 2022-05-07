
public class Counter implements Runnable {
	private static long TALLY;
	
	private long getValue() {
		return TALLY;
	}
	
	@Override
	public void run() {
		for (int i=0; i<1000000; i++) {
			TALLY += 1;
		}
		System.out.println("Tally =" + getValue());
	}
}
