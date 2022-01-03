package chapter4;

import java.util.Scanner;

public class Alarm {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Num: ");
		int num = kbd.nextInt();
		alarm(num);
		kbd.close();
	}
	public static void alarm(int num) {
		if(num<1) {
			System.out.println("Error!");
		}
		else {
			for(int i = 0; i<num; i++) {
				System.out.println("Alarm!");
			}
		}
	}

}
