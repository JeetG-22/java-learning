package chapter3;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Give me a capital alaphabet character as a unicode value: ");
		int letter = kbd.nextInt();
		for(int i = 65; i<letter; i+=2) {
			System.out.print((char)i + " ");
		}
		kbd.close();

	}

}
