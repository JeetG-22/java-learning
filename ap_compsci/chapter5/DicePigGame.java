package chapter5;

import java.util.Scanner;

public class DicePigGame {
	public static int cr,pr,pt,ct;
	public static Scanner kbd = new Scanner(System.in);
	public static void main(String[] args) {
		PairOfDice p = new PairOfDice();
		System.out.println("PIG GAME!");
		System.out.println("__________________________________");
		while(ct < 100 && pt < 100) {
			player(p);
			if(pt>=100) {
				break;
			}
			computer(p);	
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
	public static void player(PairOfDice p) {
		int userChoice = 0;
		System.out.println("Player: ");
		do {
			p.rollPair(); //Initializes d1 and d2
			System.out.println(p); //Displays Dice Rolls
			if(p.isSE()) { //Checks for snake eyes
				pt = 0;
				pr = 0;
				break;
			}
			else if(p.isHSE()) { //Checks for half snake eyes
				pr = 0;
				break;
			}
			else {
				pr += p.sumRoll();
				System.out.println("Running Total: " + pr);
			}
			System.out.println("Hold = 1, Continue = 2");
			userChoice = kbd.nextInt();
		} while(userChoice != 1);
		pt += pr;
		pr = 0;
		System.out.println("Player Total: " + pt + "," + " Computer Total: " + ct);
		System.out.println("__________________________________");
		
	}
	public static void computer(PairOfDice p) {
		System.out.println("Computer: ");
		do {
			p.rollPair();
			System.out.println(p);
			if(p.isSE()) {
				ct = 0;
				cr = 0;
				break;
			}
			else if(p.isHSE()) {
				cr = 0;
				break;
			}
			else {
				cr += p.sumRoll();
				System.out.println("Running Total: " + cr);
			}
		} while(cr<20);
		ct += cr;
		cr = 0;
		System.out.println("Player Total: " + pt + "," + " Computer Total: " + ct);
		System.out.println("__________________________________");
	}
	

}
