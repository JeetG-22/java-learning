package chapter5.loops;

public class BreakContinuteLabelStatements {
	public static void main(String[] args) {
		/*
		 * break statements let you exit or break out of a loop (see examples below)
		 * 
		 * continue statement lets you skip the remaining steps in the current iteration
		 * and starts the next loop iterations
		 * 
		 */

		for (int i = 0; i < 10; i++) {
			break;
		}

		int i = 0;
		while (i < 5) {
			if (i == 3) {
				System.out.println("New statement");
				i++;
				continue;
			}
			System.out.println("Printed statement");
			i++;
		}

		/*
		 * Labeled statement can be used on: 
		 * A code block defined using {} 
		 * All looping statements (for, enhanced for,
		 * while, do-while) 
		 * Conditional constructs (if and switch statements)
		 * Expressions 
		 * Assignments
		 * return statements 
		 * try blocks 
		 * throws statements
		 */
		System.out.println();
		for(int k = 0; k < 3; k++) {
			outer: {
				while(true) {
					break outer;
				}
			}
			System.out.println("test");
		}
	}
}
