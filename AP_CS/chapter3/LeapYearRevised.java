package chapter3;

import java.util.Scanner;

public class LeapYearRevised {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Year: ");
		int year = kbd.nextInt();
		
		while(year!=7777) {
			if(year<1582) {
				System.out.println("Only enter years after 1582");
			}
			else if(year % 400 == 0) {
				System.out.println("Year " + year + " is a leap year");
			}
			else if(year % 4 == 0 && year % 100 != 0) {
				System.out.println("Year " + year + " is a leap year");
			}
			else {
				System.out.println("Year " + year + " is not a leap year");
			}
			System.out.println("Year(Enter 7777 to quit) : ");
			year = kbd.nextInt();
		}

		kbd.close();

	}

}
