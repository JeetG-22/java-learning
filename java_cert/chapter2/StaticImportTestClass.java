package chapter2;

public class StaticImportTestClass {
	public static int num = 10;
	
	public static int add(int num2) {
		return num + num2;
	}
	
	public static int add(int num1, int num2) {
		return num + num1 + num2;
	}
}
