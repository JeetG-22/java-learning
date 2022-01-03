package chapter6.inheritance;

public class ReferenceTypes {

	public static void main(String[] args) {
		B obj = new B();
		Movable m = new P();
		new ReferenceTypes().walk(m);

	}
	void walk(Movable mov) {
		mov.move();
	}

}

interface Movable{
	void move();
}

class V implements Movable{

	@Override
	public void move() {
		System.out.println("Vehicle move");
		
	}
	
}

class P implements Movable{

	@Override
	public void move() {
		System.out.println("Person move");
		
	}
	
}

class A {
	
	String title = "A";
	
	
	public void write() {
		System.out.println("Class A");
	}
}

class B extends A{
	
	String title = "B";
	
	public void write() {
		System.out.println("Class B");
	}
}
