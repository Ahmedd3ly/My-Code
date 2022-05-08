import java.util.InputMismatchException;
import java.util.Scanner;

public class oldestYoungest {
	public final int ARRAY_LENGTH = 5;
	private int[] age = new int[ARRAY_LENGTH];
	private String[] name = new String[ARRAY_LENGTH];

	private int oldest = age[0];
	private int youngest = age[0];
	private int counter = 0;

	private Scanner in = new Scanner(System.in);

	public void getNameAge() {
		for (int i=0; i<ARRAY_LENGTH; i++) {
			try {
				System.out.println("Your name: ");
				name[i] = in.next();
				if (name[i].equalsIgnoreCase("done")) {
					getOldYoung();
				}else {
					System.out.println("Your age: ");
					age[i] = in.nextInt();
					counter++;
				}	
				
			} catch (InputMismatchException e) {
				System.out.println("Invalid Input! Try again.");
				in.next();
				getNameAge();
			}
		}
			getOldYoung();
	}	
	private void getOldYoung() {
		for (int j = 0; j<counter; j++) {
			if (youngest > age[j]) {
				youngest = j;
			}else if (oldest < age[j]) {
				oldest = j;
			}
			System.out.println(
					"The " + j + " name in the list is " + name[j] + " and their age is: " + age[j]);
		}
			System.out.println("The youngest one is " + name[youngest]);
			System.out.println("The oldest one is " + name[oldest]);
	}	

	public static void main(String[] args) {
		oldestYoungest age = new oldestYoungest();
		age.getNameAge();
	}
}
