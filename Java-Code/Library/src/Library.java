import java.util.concurrent.Semaphore;

public class Library {
	private final int MAX_AVAILABLE = 2;
	private boolean[] booksInUse = new boolean [MAX_AVAILABLE];
	private Semaphore semaphore = new Semaphore(MAX_AVAILABLE);
	
	public void borrowBook (String name)
			throws InterruptedException {
		System.out.println(name + " is trying to borrow a book.");
		semaphore.acquire();
		takeFirstAvailableBook(name);
	}

	public synchronized void takeFirstAvailableBook(String name) {
		for (int i=0; i<MAX_AVAILABLE; i++) {
			if(booksInUse[i]==false) {
				booksInUse[i]=true;
				System.out.println(name + " has borrowed a book.");
				break;
			}
		}
	}
	public void returnBook(String name) {
		System.out.println(name + " is trying to return a book.");
		returnFirstAvailableSlot(name);
		semaphore.release();
	}

	public synchronized void returnFirstAvailableSlot(String name) {
		for(int i=0; i<MAX_AVAILABLE; i++) {
			if(booksInUse[i]==true) {
				booksInUse[i]=false;
				System.out.println(name + " has returned a book.");
				break;
			}
		}
	}
}
