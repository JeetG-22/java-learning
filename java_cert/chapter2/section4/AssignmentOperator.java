package chapter2.section4;

public class AssignmentOperator {

	public static void main(String[] args) {
		
		/*
		 * Integer range: -2,147,483,648 to 2,147,483,647
		 * a = top bound + abs(bottom bound) + 1
		 * the print message illustrates how casting a value outside the range of int
		 * circulates the number. If the number is one above the top bound  of an int
		 * then the print message will circulate to the bottom bound and print that number
		 */
		
		long a = 4_294_967_296L;
		int b = (int) a; //Casting because you are fitting a larger number into a smaller container
		System.out.println(b);
		
		long c = b; //Casting is not necessary b/c long holds more than int
		
		/*
		 * Differents ways to assign variables 
		 * 1) Same line initialization
		 * 2) Chain statement
		 */
		boolean b1 = true, b2 = false, b3 = false;
		b1 = b2 = b3 = b1;
		System.out.println("b1:" + b1 + " " + "b2:" + b2 + " " + "b3:" + b3);

	}

}
