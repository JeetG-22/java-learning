package chapter3;

public class MethodOverloadingTest {

	public static void main(String[] args) {

	}
	
	public static int subtract(int a, int b) {return 0;}
	
	public static String subtract(int a, int b) {return null;} //Compiler can't differentiate based off of return type
	
	
	private static void multiply(int a, int b) {}
	void multiply(int a, int b) {} //Compiler can't differntiate based off of access/nonaccess modifiers

	public static void add(int a, int b) {}

	public static void add(int a, int b, int c) {} // Methods that differ by number

	public static void add(int a, String b) {} //Methods that differ by type

}
