package chapter6.interfaces;

public class InterfaceTest implements InterfaceA, InterfaceB {

	public static void main(String[] args) {
		InterfaceA obj2 = new InterfaceTest(); //Is allowed
		
//		InterfaceA a = new InterfaceA(); //Can't instantiate interfaces
		InterfaceTest obj = new InterfaceTest();
		obj.print();
		obj.defaultMethod();
		
		//Must prefix the interface name to prevent ambiguity within the code
		System.out.println(InterfaceA.num);
		System.out.println(InterfaceB.num);
		
		
		
		//Static methods in the interface and class are not related even if they have the same signature
		InterfaceA.staticMethod();
		staticMethod();
	}

	//Provides implementation for both InterfaceA and InterfaceB 
	@Override
	public void print() {
		System.out.println("Testing Interfaces in Classes");
//		defaultMethod();
		
	}
	
	public void emptyMethod() { //Overrides emptyMethod() from InterfaceA and InterfaceB
		System.out.println("Hello");
	}
	
	 static void staticMethod() {
		 System.out.println("Static method in class");
	 }

	 //Comes from BaseInterfaceC
	 @Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	//Compile error when trying to implement two abstract methods with the same name but different return types
//	public String print2() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	

}
