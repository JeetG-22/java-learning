package chapter6.inheritance;

public class TwistTale {

	public static void main(String[] args) {
		new Programmer ("Harry").getName();

	}

}

class Employee{
	String name;
}

class Programmer extends Employee{
	Programmer(String val){
		name = val;
	}
	
	String getName() {
		return name;
	}
	
}
