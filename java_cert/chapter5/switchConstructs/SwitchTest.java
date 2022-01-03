package chapter5.switchConstructs;

public class SwitchTest {

	public static void main(String[] args) {
		twist();
		
		/*
		 * Switch statements can accept char, byte, short
		 * int, String, enum, Character, Byte, Integer, Short
		 * 
		 * The switch argument must not be null or decimal numbers (double and float)
		 * or long/Long
		 * 
		 * The value of the case label must be known at compile time.
		 * Ex: case a+b: (invalid if a & b are not constant variables)
		 * case 10 + 20: (valid)
		 * 
		 * 
		 */

	}
	
	public static void validStatements() {
		switch(10 + 20) { //Can pass expressions
		case 30:
			System.out.println("Test");
			break;
		case 10:
			System.out.println("Test2");
			break;
		}
	}

	public static void twist() {
		String day = new String("Sun");
		switch (day) {
		case "Sun":
			System.out.println("Weekend");
			break;
		default:
			System.out.println("Invalid day!");
		}
	}

}
