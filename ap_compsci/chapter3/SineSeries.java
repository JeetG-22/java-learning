package chapter3;

import java.util.Scanner;

public class SineSeries {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		long product = 1;
		int k = 1;
		
		System.out.println("Angle: ");
		double angle = kbd.nextInt();
		angle = Math.toRadians(angle);
		double sine = angle;
		System.out.println("Number of computations: ");
		int range = kbd.nextInt() * 2;
		
		for(int i = 3; i < range; i+=2) { 
			product = 1;
			for(int j = i; j>=1; j--) {
				product*=j;		
			}
			k*=-1;
			sine+=(Math.pow(angle, i)/product*k);
		}
		System.out.println("Sum of sine series: " + sine);
		kbd.close();

	}

}
