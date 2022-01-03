package chapter5.if_elseconstruct;

public class IfElseStatement {

	public static void main(String[] args) {
		int x = 10;
		int y = 25;

		if (x > y) {
			System.out.println("X is greater than Y");
		} else if (x == y) {
			System.out.println("X is equal to Y");
		} else if (false) {
			System.out.println("A");
		} else {
			System.out.println("X is less than Y");
		}

		// if without the else statement
		if (true) {
			System.out.println("Hello");
		}

//		if (x == y) {
//			System.out.println("X is equal to Y");
//		}
//		System.out.println(); //Cannot have a statement in between and if and an else clause (not in braces)
//		else {
//			
//		}

		/*
		 * If-else without braces Executes only a single line of code
		 */

		if (4 + 2 == 2 + 4)
			System.out.println("Equal");
		System.out.println("Not equal"); // prints out the expression regardless of logic due to the way if-else
											// statement work when you don't include braces

		// Example of an expression that wont work in an if statement
//		int z = 25;
//		if(z=10) {
//			System.out.println("code wont compile");
//		}

		// Ternary constructs
		System.out.println(x == y ? "x == y" : "x != y");

		// Won't work if its not assigned to something or if its not used as an argument
//		x == y ? "x == y" : "x != y";

		int z = 75;
		// Nested ternary construct
		System.out.println(
				x == y ? x > z ? "x and y are greater than z" : "x and y are less than z" : "x is not equal to y");
		
		//Example of bad assignment using ternary operator
//		long w = 10000l;
//		int h = x == z ? w : w; //Cannot convert from long to int

	}

}
