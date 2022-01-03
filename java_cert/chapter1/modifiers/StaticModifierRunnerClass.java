package chapter1.modifiers;

//Top level classes cannot be prefixed with a static modifier 
public class StaticModifierRunnerClass {

	public static void main(String[] args) {
		
		//Using class names and objects to access static members and methods
		StaticModifierTestClass test = new StaticModifierTestClass();
		test.number = 25;
		StaticModifierTestClass.print();
		StaticModifierTestClass.number = 35;
		test.print();
	}
	
	//Inner classes can have a static modifier
	static class A {
		
	}
}

