package chapter1.modifiers;

public class ModifierRunnerClass extends ModifierTestClass{
	
	/*
	 * B/c word is a protected variable in ModifierTestClass a
	 * reference is not needed to use the data member 
	 */
	public static void setWord() {
		word = "Hello World"; 
	}
	public static void main(String[] args) {
		setWord();
		print();
	}

}
