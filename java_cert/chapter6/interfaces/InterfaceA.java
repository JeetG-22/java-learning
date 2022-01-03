package chapter6.interfaces;

public interface InterfaceA {
	int num = 10;
	public void print();
	
//	public void print2();
	
	default void defaultMethod() {
		System.out.println("Default Method");
	}
	
	default void emptyMethod() {} //Empty method is not the same as an abstract method
	
//	default void errorMethod(); //Won't Compile b/c default methods must have a starting and ending brace
	
	static void staticMethod() {
		System.out.println("Static method in interface");
	}
}
