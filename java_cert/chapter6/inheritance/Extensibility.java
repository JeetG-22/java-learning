package chapter6.inheritance;

public class Extensibility {

	/*
	 * Extensibility of inheritance tells us that code that works for the base class
	 * can also work with all the classes that inherit that base class
	 */
	public static void main(String[] args) {
		new Extensibility().print(new Programmer("Steve"));
		print(new Integer(25)); //Integer is a subclass of the Number class

	}
	
	public static void print(Number n) {
		System.out.println(n);
	}
	
	public void print(Employee emp) { //static method also works
		
		//You cannot call emp.test() b/c that's part of the subclass not the superclass
		System.out.println(emp.name); 
	}

}

class Employee {
	String name;
	
}

class Programmer extends Employee {
	public Programmer(String name) { 
		this.name = name; //A derived class can directly access non private members of the base class
	}
	public String test() {
		return "hello";
	}
}
