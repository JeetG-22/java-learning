package chapter4;

import java.util.Scanner;

public class Translate {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Num: ");
		System.out.println(translate(kbd.nextInt()));
		kbd.close();
	}
	public static double translate(int x) {
		return x;
	}

}
