package chapter5.loops;

public class WhileLoops {

	public static void main(String[] args) {
		/*
		 * Similar to if-else, if you leave out the braces, only the first line of code
		 * will be executed each time in the loop
		 * 
		 * While loops are usually used when you don't know the number of iterations
		 */
		while (true) {
			break;
		} // Takes in a boolean expression (you can update variables inside the while
			// block)
		do {
			System.out.println("Inside do-while loop");
		} while (false); // Similar to a while loop except that it executes the block at least one time
							// regardless of the condition (checks after the first execution)

	}

}
