package string;
import java.util.Scanner;
public class String4 {

	public static void main(String[] args) {
		//Jeet Gupta 5/7/19
		//Asking user for social security number and removing the hyphens
				
		//Declare
		Scanner kbd = new Scanner(System.in);
		String securityNum, answer;
		
		//Ask User			
		System.out.println("Give me your social security number.");
		securityNum = kbd.next();
				
		//Calculate
		answer = securityNum.substring(0,3)+securityNum.substring(4,6)+securityNum.substring(7);
				
		//Print Answer
		System.out.println(answer);
		kbd.close();

	}

}
