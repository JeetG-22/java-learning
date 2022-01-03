package chapter2;

import java.util.Scanner;
public class CountFive {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Give me a number");
		int num = kbd.nextInt();
		int temp = num;
		int count = 0;
		while(temp != 0) {
			if(temp % 10 == 5) {
				count++;
			}
			temp/=10;
		}
		System.out.println("The number of 5's in " + num + " is " + count);
		kbd.close();

	}

}
