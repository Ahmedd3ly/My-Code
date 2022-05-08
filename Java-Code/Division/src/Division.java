import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
	int dividend;
	int divisor;
	
	Scanner in = new Scanner(System.in);
	
	public void getInteger() {
		  try {
			 System.out.print("Enter the divident= ");
			 dividend = in.nextInt();
			 System.out.print("Enter the divisor= ");
			 divisor = in.nextInt();
			 
			 checkDivision();

	         }catch (InputMismatchException e) {
	        	 System.out.println("Not an integer! Try again.");
	        	 in.next();
	        	 getInteger();
	    }
	}
	
	private void checkDivision() {
		if(dividend%divisor == 0) {
			System.out.println("divisable.");
		}else {
			System.out.println("not divisable.");
		}
		
	}

	public static void main(String[] args) {
		Division number = new Division ();
		number.getInteger();
	}
}
