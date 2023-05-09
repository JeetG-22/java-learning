package chapter3;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Number of computations: ");
		int num = kbd.nextInt();
		int j = 1;
		int sum = 0;
		int addition = 12;
		for(int i = 1; i <= num; i++) {
			sum+=addition*j;
			j*=-1;
			addition+=20;
		}
		System.out.println("Sum: " + sum);
		kbd.close();

	}

}
