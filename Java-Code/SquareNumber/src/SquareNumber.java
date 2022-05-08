import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareNumber {
	Scanner in = new Scanner(System.in);
	
	public void getNumber() {
	      try {
	    	 System.out.print("Enter a number ");
	    	 int num = in.nextInt();
	    	 int squared = square(num);
	    	 System.out.println("The square of "+ num +" is " + squared);
	    	 System.out.print("Another number? " +"(anything else to quit) ");
	    	 if (in.hasNextInt()) {
	    		 getNumber();
	    	 }
	      }catch (InputMismatchException e) {
	     	 System.out.println("Invalid input! Try again.");
	     	 in.next();
	     	 getNumber();
	    }
	}
    static int square(int num) {
         return num * num;
    }   
}
