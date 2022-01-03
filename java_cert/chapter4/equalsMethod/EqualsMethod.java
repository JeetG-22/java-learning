package chapter4.equalsMethod;

import java.util.ArrayList;

public class EqualsMethod {

	public static void main(String[] args) {
		
		//Using the java.lang.Object equals() 
		A a = new A();
		A a2 = new A();
		System.out.println(a.equals(a2));
		a = a2;
		System.out.println(a.equals(a2));

		//Using overriden equals() from Cube class
		Cube c = new Cube();
		Cube c2 = new Cube();
		System.out.println(c.equals(c2)); //Overriden equals() compares the value of the "sides" instance
		c2.setSides(7);
		System.out.println(c.equals(c2)); 
		c = c2;
		System.out.println(c.equals(c2)); //Checks to see if they are refer to the same object
		
		//Using overloaded equals() from A class
		A a3 = new A();
		a3.setNum(8);
		A a4 = new A();
		a4.setNum(8);
		System.out.println(a3.equals(a4));
		ArrayList<A> aList = new ArrayList<A>();
		aList.add(a3);
		//Refers to the base Object class equals() (since the method is not overriden)
		System.out.println(aList.contains(a4)); 
		
		//Violating equals() contract
		B b = new B();
		B b2 = new B();
		System.out.println(b.equals(b2)); //Since the overriden equals() always return true, the contract is broken
		
	}

}

class A {
	int num;
	public A () {
		num = 6;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public boolean equals(A a) {
		return num == a.getNum();
	}
}

class B {
	public boolean equals(Object obj) {
		return true;
	}
}
