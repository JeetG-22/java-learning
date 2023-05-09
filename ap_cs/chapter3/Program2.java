package chapter3;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		// #1
		System.out.print("(I): ");
		for(int i = 64; i > 1; i/=2) {
			System.out.print(i + " ");
		}
		
		// #2
		System.out.println("\n" + "Num: ");
		int num = kbd.nextInt();
		System.out.print("(II): ");
		for(int i = 1; i < num; i*=3) {
			System.out.print(i + " ");
		}
		
		// #3
		System.out.println("\n" + "Num: ");
		num = kbd.nextInt();
		int count = 1;
		System.out.print("(III): ");
		for(int i = 8; i < num; i+=4) {
			if(count%3==0) { //Every 3rd digit the addition from the previous number is 1 more
				System.out.print(i + 1 + " ");	
			}
			else if (count%4==0) {//Every 4th digit the addition from the previous number is 4 more
				System.out.print(i + 4 + " ");
				i+=4; //i must be added by 4 so the next number is by addition of 4
			} else {
				System.out.print(i + " ");
			}
			count++; //Count to check if the numbers are added by +4, +5, +7
			if(count%7==0) { //This restarts the count
				i+=4; 
				count=1;
			}
			
		}
		
		// #4
		int j = 1;
		System.out.print("\n(IV): ");
		for(int i = 1; i <= 40; i+=3) {
			System.out.print(i * j + " ");
			j*=-1;
		}
		
		// #5
		System.out.print("\n(V): ");
		for(int i = 1; i <= 40; i+=3) {
			System.out.print(i + " ");
		}
		kbd.close();
		

	}

}
