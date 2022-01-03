package chapter3;

import java.util.Scanner;

public class SumOfAll {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int i = 2, sum = 0;
		System.out.println("Give me a postive integer and I will print out"
				+ "the sum of all the even numbers between 2 and the number you entered");
		System.out.println("Num: ");
		int num = kbd.nextInt();
		
		if(num>2) {
			while(i<=num) {
				sum +=i;
				i+=2;
			}
			System.out.println("Sum: " + sum);
		}
		else {
			System.out.println("Error! Enter a number greater than 2");
		}
		kbd.close();

	}

}
