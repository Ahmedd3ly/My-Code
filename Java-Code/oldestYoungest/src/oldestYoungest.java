/* get 5 names and ages, print them and get
 * the oldest and the youngest of them.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class oldestYoungest {
	public final int ARRAY_LENGTH = 5;
	private int[] age = new int[ARRAY_LENGTH];
	private String[] name = new String[ARRAY_LENGTH];
	// let the oldest and youngest be the first person.
	private int oldest = age[0];
	private int youngest = age[0];

	private Scanner in = new Scanner(System.in);

	public void getNameAge() {
		for (int i=0; i<ARRAY_LENGTH; i++) {
			try {
				System.out.println("Your name: ");
				name[i] = in.next();
				if (name[i].equalsIgnoreCase("done")) {
					getOldYoung(i);
				}else {
					System.out.println("Your age: ");
					age[i] = in.nextInt();
				}	
				
			} catch (InputMismatchException e) {
				System.out.println("Invalid Input! Try again.");
				in.next();
				getNameAge();
			}
		}
			getOldYoung(ARRAY_LENGTH);
	}	
	private void getOldYoung(int counter) {
		int y = 0, o=0;
		for (int j=0; j<counter; j++) {
			if (oldest < age[j]) {
				oldest = age[j];
				o = j; // get the index of the oldest
			}else if (youngest > age[j]) {
				youngest = age[j];
				y = j; // get the index of the youngest
			}
			System.out.println(
					"Name " + j + " is " + name[j] + " and has " + age[j] + " years old.");
		}
			System.out.println("The oldest is " + name[o]);	
			System.out.println("The youngest is " + name[y]);
	}	

	public static void main(String[] args) {
		oldestYoungest age = new oldestYoungest();
		age.getNameAge();
	}
}
