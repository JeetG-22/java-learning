package chapter3;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Num: ");
		int num = kbd.nextInt();
		String newString = "";
		while(num!=0) {
			int digit = num%10;
			newString+=digit;
			num/=10;
		}
		String numString = "";
		for(int i = newString.length()-1;i>=0;i--) {
			numString+=newString.charAt(i);
		}
		System.out.println("Palidrome: " + (numString.equals(newString)));
		kbd.close();
	}

}
