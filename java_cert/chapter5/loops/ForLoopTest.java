package chapter5.loops;

public class ForLoopTest {

	public static void main(String[] args) {
		// Testing valid statements

		/////////////////////////////////////////////////

		// Multiple initializations and updates in one for loop
		for (int i = 0, j = 10; j > i; j--, i++) {
			System.out.println(i);
		}
		/////////////////////////////////////////////////

		// Invalid b/c the initialization variables have to be the same type
//		for(int i = 0, long j = 10; i < 10; i++) {
//			
//		}

		/////////////////////////////////////////////////

		System.out.println();
		// You can put a method in a for loop under the update clause
		for (int i = 0; i < 3; i++, System.out.println("Space")) {
			System.out.println("Hello World");
		}

		/////////////////////////////////////////////////

		System.out.println();
		// Allowed but must not remove semicolon
		int k = 0;
		for (; k < 3; k++) {

		}

		for (int i = 0; ;i++) {
			break;
		}

		for (int i = 0; i < 3;) {
			i++;
		}
		
		for(;;) { //Infinite loop if you don't have a break statement
			System.out.println(1);
			break;
		}

		/////////////////////////////////////////////////

	}

}
