package chapter1.test;

public interface C {
	void testMethod();
	default void show() {
		System.out.println("Not Hello World");
	}
}
