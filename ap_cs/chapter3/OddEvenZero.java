package chapter3;

import java.util.Scanner;

public class OddEvenZero {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Num: ");
		int num = kbd.nextInt();
		int zero, even, odd;
		zero = even = odd = 0;
		while (num != 0) {
			int digit = num % 10;
			if (digit == 0) {
				zero++;
			} else if (digit % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			num /= 10;
		}
		System.out.println(zero);
		System.out.println(odd);
		System.out.println(even);
		kbd.close();

	}

}
