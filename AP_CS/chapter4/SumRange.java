package chapter4;

import java.util.Scanner;

public class SumRange {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Bottom Range: ");
		int bRange = kbd.nextInt();
		System.out.println("Top Range: ");
		int tRange = kbd.nextInt();
		System.out.println("Sum between the ranges: " + sumRange(bRange,tRange));
		kbd.close();
		
	}
	public static int sumRange(int bRange,int tRange) {
		int sum = 0;
		if(bRange>tRange) {
			System.out.println("Error!");
			return 0;
		}
		else {
			for(int i = bRange; i <= tRange; i++) {
				sum+=i;
			}
		}
		return sum;
	}
}
