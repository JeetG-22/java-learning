package chapter3;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Num: ");
		int num = kbd.nextInt();
		int numTemp = num; 
		String revNum = "";
		while(numTemp!=0) {
			int digit = numTemp % 10;
			revNum += digit;
			numTemp/=10;
		}
		boolean isPalindrome = Integer.parseInt(revNum) == num;
		System.out.println(isPalindrome);
		kbd.close();
	}

}
