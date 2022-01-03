package chapter3;

public class Chapter3ReviewQuiz {

	public static void main(String[] args) {
//		Integer n = 7;
//		System.out.println(method(n));
//		
//		new Bird("parrot");
//		Chapter3ReviewQuiz c = new Chapter3ReviewQuiz();
//		System.out.println(c.x);
//		int arr[] = {1,2,3};
//		change(arr);
//		System.out.println(arr[1]);
//		Animal a = new Bird();
//		String n = null;
//		System.out.println(n);
//		Chapter3ReviewQuiz.change(arr);
//		a.add(a, b);
//		private int i = 10;
//		double d = 9000;
//		String model;
//		if(d > 10000) {
//			model = "X";
//		} else if(d <= 10000) {
//			model = "s";
//		}
//		System.out.println(model);
		int i = '5';
		test(i);
		test('5');
		
	}
	
	public static void test(char c) {
		System.out.println("C");
	}
	
	public static void test(int c) {
		System.out.println("I");
	}
	
	public static void change(int[] arr) {
		arr[1] = 16;
	}
	
	private static  String method(Object c) {
		return c.toString();
	}
	

}

class Animal{
	public int add(int a, int b) {
		return a + b;
	}
	protected void meth1() {
		
	}
}
class Bird extends Animal{
	final void meth1(int i) {
		
	}
	
	void meth1(double i) {
		
	}
	private Bird(String name) {
		System.out.print(name);
	}
	Bird(){
		System.out.print("unkown");
	}
	public double add(double a, double b) {
		return a + b;
	}
}

class Whiz {
	protected int x = 10;
}
