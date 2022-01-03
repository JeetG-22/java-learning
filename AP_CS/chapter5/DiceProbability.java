package chapter5;

import java.util.Scanner;
import java.text.DecimalFormat;

public class DiceProbability {
	static double sum15, sum5_10, sum20, sum15_25;
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Dice d4 = new Dice();
		Dice d5 = new Dice();
		System.out.println("Number of Rolls: ");
		int numRoll = kbd.nextInt();
		sumCount(d1,d2,d3,d4,d5,numRoll);
		System.out.println("(Sum of 15) " + "Count:" + sum15 + " Probability:" + df.format((sum15/numRoll)*100) + "%");
		System.out.println("(Sum between 5 and 10) " + "Count:" + sum5_10 + " Probability:" + df.format((sum5_10/numRoll)*100) + "%");
		System.out.println("(Sum of 20) " + "Count:" + sum20 + " Probability:" + df.format((sum20/numRoll)*100) + "%");
		System.out.println("(Sum between 15 and 25) " + "Count:" + sum15_25 + " Probability:" + df.format((sum15_25/numRoll)*100) + "%");
		kbd.close();
	}
	public static void sumCount(Dice d1, Dice d2, Dice d3, Dice d4, Dice d5, int numRoll) {
		int i = 0;
		int numRolls = numRoll;
		int sum = 0;
		while(i<numRolls) {
			d1.roll();
			d2.roll();
			d3.roll();
			d4.roll();
			d5.roll();
			sum = d1.sum(d2, d3, d4, d5);
			if(sum>=5 && sum <=10) {
				sum5_10++;
			}
			else if(sum==15) {
				sum15++;
			}
			else if(sum==20) {
				sum20++;
			}
			else if(sum>=15 && sum<=25) {
				sum15_25++;
			}
			i++;
		}
	}

}
