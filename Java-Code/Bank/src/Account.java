// active class
public class Account implements Runnable {
	private Bank bank;
	private String name;
	private int sleepScaler = 1000;
	private int balance;

	public Account(Bank bank, String name, int balance) {
		this.bank = bank;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public void run() {
		while (true) {
			try {
				double random = Math.random();
				bank.deposit((int) (balance * random));
				System.out.println("Deposited to " + name);
				Thread.sleep((long) (random * sleepScaler));
				bank.withdraw((int) (balance * random));
				System.out.println("Withdrawn from " + name);
			} catch (InterruptedException e) {
				System.out.println("Interrupted " + Thread.currentThread().getName());
				return;
			}
		}
	}
}
