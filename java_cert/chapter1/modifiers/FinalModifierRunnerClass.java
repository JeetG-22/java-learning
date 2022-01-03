package chapter1.modifiers;

import java.util.ArrayList;

//Classes with a final modifier cannot be extended
public class FinalModifierRunnerClass extends FinalModifierTestClass {
	
	static final double PIE_VALUE = 3.1415;

	public static void main(String[] args) {
		//Cannot change the value of a constant once it has been initialized
		PIE_VALUE = 3.14159;
		
		/*
		 * Final objects cannot be reassigned to another object
		 * You can change the state of the object through the service methods of the class
		 */
		final ArrayList<Integer> aList = new ArrayList<Integer>();
		
		aList = new ArrayList<Integer>();
		aList = null;
		
		aList.add(25);
		
		//Prints out [25]
		System.out.println(aList);

	}
	
	//Derived classes cannot override final methods in the base class
	public void a(){
		System.out.println("Cannot Override Method");
	}

}

//Interfaces (nested or not) cannot be marked with a final keyword (only abstract and static)
final interface finalInterface{
	
}
