
public class Counter {
	private int value;

	public int getValue() {
		return value;
	}

	public void increment() {
		for (int i = 0; i < 1000000; i++) {
			value += 1;
		}
	}
}
