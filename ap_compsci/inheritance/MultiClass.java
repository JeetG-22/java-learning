package inheritance;

import java.util.Scanner;

public class MultiClass {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Give me a string: ");
		String statement = kbd.nextLine();
		
		//Created a new object of that class so I can use the various methods within it
		MultiClass2 test = new MultiClass2();
		test.simpleMessage(statement); //the . separator is used b/c there could be multiple methods in class
		
		//Another method
		System.out.println("First Leg: ");
		double leg1 = kbd.nextDouble();
		System.out.println("Second Leg: ");
		double leg2 = kbd.nextDouble();
		//double hypot = test.simpleMessage(leg1,leg2); //Same method name but different parameters (constructor)
		//System.out.println(hypot);
	
		//Another method
		//System.out.printf("Word: %s", test.message());
		kbd.close();

	}

}
