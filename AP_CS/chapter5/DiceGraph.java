package chapter5;

import java.util.Scanner;

public class DiceGraph {
	public static double sum2=0,sum3=0,sum4=0,sum5=0,sum6=0,sum7=0,sum8=0,sum9=0,sum10=0,sum11=0,sum12=0;
	public static void main(String[] args) {

		Scanner kbd = new Scanner(System.in);
		Dice d1 = new Dice();
		Dice d2 = new Dice();

		System.out.println("Number of rolls: ");
		int numRolls = kbd.nextInt();
		sumCount(numRolls,d1,d2);
		histogram();
		kbd.close();
	}
	public static void sumCount(int numRolls, Dice d1, Dice d2) {
		int i = 0;
		int sum = 0;
		while(i<numRolls) {
			d1.roll();
			d2.roll();
			sum = d1.sum(d2);
			if(sum==2) {
				sum2++;
			}
			else if(sum==3) {
				sum3++;
			}
			else if(sum==4) {
				sum4++;
			}
			else if(sum==5) {
				sum5++;
			}
			else if(sum==6) {
				sum6++;
			}
			else if(sum==7) {
				sum7++;
			}
			else if(sum==8) {
				sum8++;
			}
			else if(sum==9) {
				sum9++;
			}
			else if(sum==10) {
				sum10++;
			}
			else if(sum==11) {
				sum11++;
			}
			else {
				sum12++;
			}
			i++;
		}
		sum2 = (int)(sum2/numRolls*100);
		sum3 = (int)(sum3/numRolls*100);
		sum4 = (int)(sum4/numRolls*100);
		sum5 = (int)(sum5/numRolls*100);
		sum6 = (int)(sum6/numRolls*100);
		sum7 = (int)(sum7/numRolls*100);
		sum8 = (int)(sum8/numRolls*100);
		sum9 = (int)(sum9/numRolls*100);
		sum10 = (int)(sum10/numRolls*100);
		sum11 = (int)(sum11/numRolls*100);
		sum12 = (int)(sum12/numRolls*100);
	}
	public static void printStars(int n, double sum) {
		int i = 0;
		System.out.print("Sum " + n + ": ");
		while(i<sum) {
			System.out.print("*");
			i++;
		}
		System.out.println();
	}
	public static void histogram(){
		printStars(2,sum2);
		printStars(3,sum3);
		printStars(4,sum4);
		printStars(5,sum5);
		printStars(6,sum6);
		printStars(7,sum7);
		printStars(8,sum8);
		printStars(9,sum9);
		printStars(10,sum10);
		printStars(11,sum11);
		printStars(12,sum12);
	}

}
