package learn;
import java.util.Scanner;
public class MultiClass1 {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		Scanner kbd2 = new Scanner(System.in);
		
		//Using MultiClass2
		MultiClass2 class2Object = new MultiClass2();
		double leg1,leg2;
		System.out.println("Give me the first leg:");
		leg1 = kbd.nextDouble();
		System.out.println("Give me the second leg:");
		leg2 = kbd.nextDouble();
		System.out.println(class2Object.hypotenuse(leg1, leg2));
		class2Object.simpleMessage();
		class2Object.simpleMessage2();		
		
		//Using MultiClass3
		MultiClass3 class3Object = new MultiClass3();
		System.out.println("Enter your name here:");
		String name = kbd2.nextLine();
		class3Object.simpleMessage(name);
		kbd.close();
		kbd2.close();

	}

}
