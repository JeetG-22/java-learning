package random;
import java.util.Scanner;
public class GreatestOfS {

	public static void main(String[] args) {
		//Jeet Gupta 6/5/19
		//Asking user for an integer and finding the factorial of it
		
		//Declare
		Scanner kbd = new Scanner(System.in);
		int num,greatestInt;
		
		//Ask User
		System.out.println("Give me numbers and I will find the greatest num");
		System.out.println("Give me num");
		num = kbd.nextInt();
		greatestInt=num;
		
		//Calculate
		while(num!=-999) {
			System.out.println("Give me a num but if you dont want to give anymore then type -999.");
			num = kbd.nextInt();
			if(greatestInt<num) {
				greatestInt=num;
			}
		}
		
		//Print Answer
		System.out.println(greatestInt);
		kbd.close();
	}

}
