package chapter1.modifiers;

public class StaticModifierTestClass {
	
	/*
	 * Class variables can be accessed by the class name and by instances of the class (not recommended)
	 * They belong to the class and are common to all instances of the class
	 */
	public static int number = 10;
	
	public final static double PI_VALUE = 3.14159;
	
	/*
	 * Static methods can be accessed by the class name and by instances of the class (not recommended)
	 * Static methods can access static data members but not instances variables and non-static methods 
	 */
	public static void print() {
		System.out.println(number);
	}
	
	/*
	 * Non-static methods can access non-static and static data members and methods
	 */
	public void printPI_VALUE() {
		System.out.println(PI_VALUE);
	}
}
