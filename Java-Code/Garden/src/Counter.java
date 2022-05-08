
public class Counter {
	private int value;

	public int getValue() {
		return value;
	}

	public synchronized void increment() {
		value += 1;
	}

	public synchronized void decrement() {
		value -= 1;
	}
	/*
	public void increment(){
        int temp = value; //read value
        Simulate.HWInterrupt();
        value = temp + 1; // set value
    }
    */
}
