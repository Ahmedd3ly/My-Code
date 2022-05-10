// passive (monitor) class
public class Bank {
	private int balance;
	private String bankName;

	public Bank(String bankName) {
		this.bankName = bankName;
	}

	public int getBalance() {
		return balance;
	}
	
	public synchronized void deposit(int amount) {
		balance = +amount;
		notify();
	}

	public synchronized void withdraw(int amount) throws InterruptedException {
		if (balance >= amount) {
			balance = -amount;
		} else {
			System.out.println(
					"The balance is not enough to perform the transaction.");
			wait();
		}
	}
}
