package chapter5.loops;

public class ForLoops {

	public static void main(String[] args) {
		/*
		 * For loops are usually used when you know the number of iterations
		 */
		for (int i = 0; i < 10; i++) {
			break;
		} // initialization, condition, update
		for (int i = 0, j = 0; i < 10; i++) {
			break;
		} // multiple variable in initialization (must be of the same type)
		for (int i = 0; i < 10; i++, print()) {
			
		} // Termination block can print methods

		int j = 0;
		for (; j < 10; j++) {
			break;
		} // Valid but you need the semicolon
		for (;; j++) { // Valid but you need the semi colon (could result in infinite loop unless break
			break;			// statement is used)
		}

		for(int i = 0; i <= 10;) {break;}  //Valid but there must be an ending semicolon
		
		for(;;) {
			System.out.println("for(;;)");
			break;
		}

		// You can have an infinite amount of nested for loops
		/*
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < 5; k++) {
				for (int w = 0; w < 5; w++) {
					
				}
			}
		} */
		
		//Enhanced for loop
		String phrase = "Hello World";
		for(String word : phrase.split(" ")) {
			System.out.println(word);
		}
	}

	public static void print() {
		System.out.println("in print()");
	}

}
