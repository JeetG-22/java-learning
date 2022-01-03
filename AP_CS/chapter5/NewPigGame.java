package chapter5;

import java.util.Scanner;

public class NewPigGame {

	public static int cr, pr, pt, ct;
	public static Scanner kbd = new Scanner(System.in);

	public static void main(String[] args) {
		PairOfDice p = new PairOfDice(10, 10);
		System.out.println("PIG GAME!");
		System.out.println("__________________________________");
		while (ct < 250 && pt < 250) {
			player(p);
			if (pt >= 250) {
				break;
			}
			computer(p);
		}
		// Conditions to check who won
		if (ct > pt) {
			System.out.println("Computer Wins!");
		} else {
			System.out.println("Player Wins!");
		}
		kbd.close();
	}

	public static void player(PairOfDice p) {
		int userChoice = 0;
		System.out.println("Player: ");
		do {
			p.rollPair(); // Initializes d1 and d2
			System.out.println(p); // Displays Dice Rolls
			if (p.isSE()) { // Checks for snake eyes
				pt = 0;
				pr = 0;
				break;
			} else if (p.isHSE()) { // Checks for half snake eyes
				pr = 0;
				break;
			} else if (p.isBoxCars()) { // Doubles running total
				pr *= 2;
				pr += p.sumRoll();
				System.out.println("Running Total: " + pr);
			} else {
				pr += p.sumRoll();
				System.out.println("Running Total: " + pr);
			}
			System.out.println("Hold = 1, Continue = 2");
			userChoice = kbd.nextInt();
		} while (userChoice != 1);
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
			if (p.isSE()) {
				ct = 0;
				cr = 0;
				break;
			} else if (p.isHSE()) {
				cr = 0;
				break;
			} else if (p.isBoxCars()) { // Doubles running total
				cr *= 2;
				cr += p.sumRoll();
				System.out.println("Running Total: " + cr);
			} else {
				cr += p.sumRoll();
				System.out.println("Running Total: " + cr);
			}
		} while (cr < 50);
		ct += cr;
		cr = 0;
		System.out.println("Player Total: " + pt + "," + " Computer Total: " + ct);
		System.out.println("__________________________________");
	}
	/*
	 * New Pig Game Adjustments
	 * ________________________________________________________________________________________________
	 * Game last till either computer or player gets to 250 Computer gives up his
	 * turn if his running total is or exceeds 50 There is 2 Dice that each have 10
	 * sides The condition for snake eyes is if the player or computer rolls 1,9 on
	 * both dice The condition for half snakes eyes is if the player or computer
	 * rolls 1 or 9 on either dice The new method isBoxCars() doubles the running
	 * total if both dice roll a 6
	 * ________________________________________________________________________________________________
	 */

}
