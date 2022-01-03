package foundationtest;

public interface Test {
	
	int num = 10;
	public default void print() {
		System.out.println("Hello World");
	}
	int sub();
	
	static void testingPrint() {
		System.out.println("Test");
	}
	
	int add();
	
	
}
