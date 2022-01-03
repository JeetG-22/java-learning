package chapter4;

import java.util.Scanner;

public class PigGame {
	
	static int d1,d2,pr,cr,pt,ct;
	static Scanner kbd = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("PIG GAME!");
		System.out.println("__________________________________");
		while(ct < 100 && pt < 100) {
			player();
			if(pt>=100) {
				break;
			}
			computer();	
		}
		//Conditions to check who won
		if(ct>pt) {
			System.out.println("Computer Wins!");
		}
		else {
			System.out.println("Player Wins!");
		}
		kbd.close();
	}
	public static void rollDice() {
		d1 = (int)(Math.random()*6+1);
		d2 = (int)(Math.random()*6+1);	
	}
	public static void displayRoll() {
		System.out.println("Roll: " + d1 + "," + d2);
	}
	public static int sumRoll() {
		return d1+d2;
	}
	public static boolean isSE() {
		if(d1 == 1 && d2 == 1) {
			return true;
		}
		return false;
	}
	public static boolean isHSE() {
		if(d1 != 1 && d2 != 1) {
			return false;
		}
		return true;
	}
	public static void displayTotals() { //Adds round total to total points and displays
		pt+=pr;
		ct+=cr;
		System.out.println("Player Total: " + pt + " , " + "Computer Total: " + ct);
	}
	public static void player() {
		cr = 0; //To prevent cr from being added to ct from the previous round. Resets it
		int userChoice = 0; 
		System.out.println("Player: ");
		do {
			rollDice(); //Initializes d1/d2
			displayRoll(); //Uses rollDice() to display the roll
			if(isHSE() == false) {
				pr += sumRoll(); //Adds the sum of the 2 die	
				System.out.println("Running Total: " + pr);
			}
			else {
				pr = 0; //set to 0 if one of the die = 1
				break; //Breaks out, not asking for user choice
			}
			System.out.println("Hold = 1, Continue = 2");
			userChoice = kbd.nextInt();
				
		} while(userChoice != 1); 
		
		if(isSE()==true) { //Checks if HSE is true and resets pt
			pt = 0;
		}
		displayTotals();
		System.out.println("__________________________________");
	}
	public static void computer() {
		pr = 0; //Prevent pr from being added to pt from the previous round. Resets it
		System.out.println("Computer: ");
		do {
			rollDice();
			displayRoll();
			if(isHSE() == false) {
				cr += sumRoll();	
				System.out.println("Running Total: " + cr);
			}
			else {
				cr = 0;
				break;
			}
		} while(cr < 20);
		if(isSE()==true) {
			ct = 0;
		}
		displayTotals();
		System.out.println("__________________________________");
	}


}
