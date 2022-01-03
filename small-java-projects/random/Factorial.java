package random;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		//Jeet Gupta 6/5/19
		//Asking user for an integer and finding the factorial of it
		
		//Declare
		Scanner kbd = new Scanner(System.in);
		int num;
		int i = 1;
		int answer = 1;
		
		//Ask User
		System.out.println("Give me a postive integer and I will find the factorial of it");
		System.out.println("Give me a postive integer:");
		num = kbd.nextInt();
		
		//Calculate
		while(i<=num) {
			answer = answer * i;
			i++;
		}
		
		//Print Answer
		System.out.println(answer);
		kbd.close();

	}

}
