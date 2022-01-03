package chapter6.reference_objectTypes;

public class A extends B implements C{
	
	public static void main(String[] args) {
		
		//Example of using a variable of a class that refers to its own self
		A a = new A();
		a.print();
		System.out.println(a.add(5, 10));
		
		//Example of using a variable of a superclass that refers to the derived class
		B b = new A(); //Works
		D d = new A(); //Works as well b/c class A's superclass extends class D
		
		b.m1();
		System.out.println(b.add(10, 20));
		d.m1();
		
		//Example of using a variable of an implemented interface that refers to the class that imeplements it
		C c = new A();
		
		//Usage of variables of type base class or implemented interface
		C arr[] = new C[1];
		arr[0] = new A();
		
		
	}

	@Override
	public void print() {
		System.out.println("Hello");
		
	}
	
}
