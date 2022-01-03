package chapter3;

public class TestQuestions {

	public static void main(String[] args) {
//		Cube c = new Cube();
//		Cube c2 = new Cube();
//		c.setSides(10);
//		c2 = c; // c2 and c point to the same reference
//		c2.setSides(4);
//		System.out.println(c);
		
//		int num = 36;
//		someMethod(num);
//		System.out.println(num);
//		
//		char c = 'c';
//		a(c);
//		a("Hello");
		
//		Cube c2 = new Cube();
		
		ConstructorTestClass c = new ConstructorTestClass();

	}
	
	public static void a(String a) {
		System.out.println("String");
	}
	public static void a(int a) {
		System.out.println("int");
	}
	public static void a(long a) {
		System.out.println("long");
	}
	public static void a(Object a) {
		System.out.println("Object");
	}
	
	public static void someMethod(int num) {
		num = 25;
	}

	public static int returnNum() { // Proves A & D
		byte num = 10;
		return num;
	}

	// Both prove B
	public static void voidTest() { // Proves C
		return;
	}

}

class Cube {
	
	public Cube() {
		this(7);
		System.out.println("public");
	}
	private Cube(int val) {
		this("Sunday");
		System.out.println("private");
	}
	protected Cube(String val) {
		System.out.println("protected");
	}

	
	private int sides;

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}

	public String toString() {
		return "" + sides;
	}
}

class A {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}