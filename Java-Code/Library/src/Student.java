
public class Student implements Runnable {
	private Library library;
	private String name;
	private int sleepScaler = 10000;

	public Student(Library library, String name) {
		this.library = library;
		this.name = name;
	}

	@Override
	public void run() {
		try {
			double random = Math.random();
			library.borrowBook(name);
			System.out.println(name + " is reading the book.");
			Thread.sleep((long) (random * sleepScaler));
			System.out.println(name + " has finished reading");
			library.returnBook(name);
		} catch (InterruptedException ex) {
			System.out.println("Interrupted Student Thread");
			return;
		}
	}
}
