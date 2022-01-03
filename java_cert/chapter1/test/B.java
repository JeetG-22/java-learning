package chapter1.test;

public interface B {
	void testMethod();
	default void show() {
		System.out.println("Hello World");
	}
}
