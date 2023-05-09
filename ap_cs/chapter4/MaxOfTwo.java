package chapter4;

import java.util.Scanner;

public class MaxOfTwo {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Num: ");
		int num1 = kbd.nextInt();
		System.out.println("Num: ");
		int num2 = kbd.nextInt();
		System.out.println("Max: " + maxOfTwo(num1, num2));
		kbd.close();

	}
	public static int maxOfTwo(int num1, int num2) {
		if(num1>num2) {
			return num1;
		}
		return num2;
	}

}
