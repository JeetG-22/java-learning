package chapter4;

import java.util.Scanner;

public class AvMinMax {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Num1: ");
		int num1 = kbd.nextInt();
		System.out.println("Num2: ");
		int num2 = kbd.nextInt();
		int userChoice = -1;
		while(userChoice!=0) {
			userChoice = menu();
			if(userChoice == 1) {
				maxOfTwo(num1, num2);
			}
			else if(userChoice == 2) {
				minOfTwo(num1,num2);
			}
			else if(userChoice == 3) {
				averageOfTwo(num1, num2);
			}
			else if(userChoice != 0) {
				System.out.println("Error! Invalid Number");
			}
		}
		kbd.close();
	}
	public static int menu(){
		Scanner kbd = new Scanner(System.in);
		System.out.println("Max = 1, Min = 2, Average = 3, Quit = 0");
		return kbd.nextInt();
	}
	public static void maxOfTwo(int num1, int num2) {
		if(num1>num2) {
			System.out.println(num1);
		}
		else {
			System.out.println(num2);
		}
	}
	public static void minOfTwo(int num1, int num2) {
		if(num1<num2) {
			System.out.println(num1);
		}
		else {
			System.out.println(num2);
		}
	}
	public static void averageOfTwo(int num1, int num2) {
		System.out.println((num1+num2)/2);
	}

}
