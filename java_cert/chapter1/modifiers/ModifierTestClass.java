package chapter1.modifiers;

public class ModifierTestClass { //Top-Level Classes cannot have protected/private access
	
	protected static String word = "Hello";
	
	protected static void print() {
		System.out.println(word);
	}
	

}
