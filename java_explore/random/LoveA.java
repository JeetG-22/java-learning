package random;

import java.util.Scanner;

public class LoveA {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		String input = kbd.nextLine();
		int halfLength = input.length() / 2 + 1;
		if (countA(input) >= halfLength) {
			System.out.println(input.length());
		} else {
			int numA = countA(input);
			System.out.println(numA + (numA - 1));
		}
		kbd.close();
	}

	private static int countA(String input) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a') {
				count++;
			}
		}
		return count;
	}

}
