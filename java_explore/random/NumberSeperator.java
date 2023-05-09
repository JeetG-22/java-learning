package random;
import java.util.Scanner;
public class NumberSeperator {

	public static void main(String[] args) {
		//Declare
		Scanner kbd = new Scanner(System.in);
		int v1, v2,input;
		//Ask user
		System.out.println("Give me your non negative six digit number.");
		input = kbd.nextInt();
		
		//Calculate
		v1 = input / 100000;
		System.out.println(v1);
		v2 = input / 10000%10;
		System.out.println(v2);
		kbd.close();

	}

}
