package chapter4;

import java.util.Scanner;

public class RationalOperations {
	
	static Scanner kbd = new Scanner(System.in); //Avoid repeating Scanner declaration
	public static void main(String[] args) {
		int userChoice = 0;
		
		//Asking User
		System.out.println("P1: ");
		int p1 = kbd.nextInt();
		System.out.println("Q1: ");
		int q1 = kbd.nextInt();
		System.out.println("P2: ");
		int p2 = kbd.nextInt();
		System.out.println("Q2: ");
		int q2 = kbd.nextInt();
		do {
			userChoice = menu();
			switch(userChoice) { //Arithmetic operation based on user choice
				case 1:
					addition(p1,q1,p2,q2);
				break;
				case 2:
					substraction(p1,q1,p2,q2);
				break;
				case 3:
					division(p1,q1,p2,q2);
				break;
				case 4:
					multiplication(p1,q1,p2,q2);
				break;
				case -1:
				break;
				default: //Error if user does not enter a valid number
					System.out.println("Error! Only choose the numbers 1,2,3,4, or -1");	
			}
		} while(userChoice!=-1);
		kbd.close();
	}
	public static int menu() {
		System.out.println("Addition = 1, Subtraction = 2, Divison = 3, Multiplication = 4, or -1 "
				+ "if you would like to stop.");
		return kbd.nextInt();
		
	}
	public static int gcf(int numerator, int denominator) { //Finds the greatest common factor
		int gcf = 1; 
		int min = Math.abs(Math.min(denominator, numerator)); 
		for(int i = 2; i <= min; i++) {
			if(numerator%i==0 && denominator%i==0 && i>gcf) {
				gcf=i;
			}
		}
		return gcf;		
	}
	public static void addition(int p1, int q1, int p2, int q2) {
		int numerator = (q1*p2) + (q2*p1); //Cross Multiply
		int denominator = q1*q2; //Multiply Denom
		int gcf = gcf(numerator, denominator);
		System.out.println("Answer: " + (numerator/gcf) + "/" + (denominator/gcf));
	}
	public static void substraction(int p1, int q1, int p2, int q2) {
		int numerator =(q2*p1) - (q1*p2); //Cross Multiply
		int denominator = q1*q2; //Multiply Denom
		int gcf = gcf(numerator, denominator);
		System.out.println("Answer: " + (numerator/gcf) + "/" + (denominator/gcf));
	}
	public static void division(int p1, int q1, int p2, int q2) {
		int numerator = (q2*p1); //Multiply by reciprocal
		int denominator = q1*p2;
		int gcf = gcf(numerator, denominator);
		System.out.println("Answer: " + (numerator/gcf) + "/" + (denominator/gcf));
	}
	public static void multiplication(int p1, int q1, int p2, int q2) {
		int numerator = (p2*p1); //Multiply numerators
		int denominator = q1*q2; //Multiply denom
		int gcf = gcf(numerator, denominator);
		System.out.println("Answer: " + (numerator/gcf) + "/" + (denominator/gcf));
	}

}
