package chapter5.ternary;

public class TernaryTest {

	public static void main(String[] args) {
		boolean var;
		int num1 = 200, num2 = 100;
		var = num1 > num2 ? print1() : print2();
		
		System.out.println(var);
		
		/*
		 * Ternary constructs must define an else
		 * The value returned to a ternary operator must be assigned to a variable
		 * Ternary operators can't include braces
		 * 
		 * Methods called in a ternary statement must return a value and must be of the
		 * specified type of the variable that is being assigned
		 */
		
//		var = num2 > num1 ? print1(); Won't compile (no else)
//		num2 > num1 ? print1() : print2(); Won't compile (must be assigned to variable)
//		var = num2 > num1 ? {print1()} : {print2()}; Won't compile (can't have braces)
	}
	
	public static boolean print1() {
		System.out.println("True");
		return true;
	}
	
	public static boolean print2() {
		System.out.println("False");
		return false;
	}

}
