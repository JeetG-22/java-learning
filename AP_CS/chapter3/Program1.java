package chapter3;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		
		// #1
		double sum = 1;
		int denom = 3;
		while(denom<=99) {
			sum+=1.0/denom;
			denom+=2;
		}
		System.out.println("Sum: " + sum);
		
		// #2
		sum = 1;
		denom = 2;
		while(denom<=100) {
			sum+=1.0/denom;
			denom+=2;
		}
		System.out.println("Sum: " + sum);
		
		// #3
		sum = 1;
		denom = 4;
		while(denom<=100) {
			sum+=1.0/denom;
			denom+=4;
		}
		System.out.println("Sum: " + sum);
		
		// #4
		sum = 1;
		denom = 2;
		double num = 1;
		while(denom<=100) {
			sum+=num/denom;
			denom++;
			num++;
		}
		System.out.println("Sum: " + sum);
		
		// #5
		System.out.println("What would you like the numerator to end at? (Between 1 and 7)");
		double n = kbd.nextDouble();
		sum = 0;
		num = 1;
		denom = 1;
		if(n<=7) { //inaccurate answers past 7 since number gets too large
			while(num<=n) {
				int factorial = 1;
				for(int i = 1; i <= denom; i++) { //Finds the factorial
					factorial*=i;
				}
				sum+=num/factorial;
				num++;
				denom++;
			}
			System.out.println("Sum: " + sum);
		} else { //condition if n > 7
			System.out.println("Error! Numerator is not between 1 and 7");
		}
		
		// #6 same as previous except numerator is incremented by 4 and denominator starts at 3
		System.out.println("What would you like the numerator to end at? (Between 1 and 16)");
		n = kbd.nextDouble();
		sum = 0;
		num = 1;
		denom = 3;
		if(n<=16) { //inaccurate answers past 16 since number gets too large
			while(num<=n) {
				int factorial = 1;
				for(int i = 1; i <= denom; i++) { //Finds the factorial
					factorial*=i;
				}
				sum+=num/factorial;
				num+=4;
				denom++;
			}
			System.out.println("Sum: " + sum);
		} else { //condition if n > 16
			System.out.println("Error! Numerator is not between 1 and 16");
		}
		
		// #7
		System.out.println("What base number do you want me to end at?");
		int baseNum = kbd.nextInt();
		int j = 1;
		sum = 0;
		while(j<=baseNum) { //Restriction based on user input
			sum+=Math.pow(j, 2); //j is incremented each time
			j++;
		}
		System.out.println("Sum: " + sum);
		
		// #8
		System.out.println("Base Num: ");
		baseNum = kbd.nextInt();
		sum = 0;
		int i = 1;
		System.out.println("To what power of i do you want the program to end at?");
		int power = kbd.nextInt();
		while(i<=power) {
			sum+= 1.0/Math.pow(baseNum, i);
			i++;
		}
		System.out.println("Sum: " + sum);
		
		// #9
		System.out.println("Sum to end at: ");
		int endSum = kbd.nextInt();
		sum = 0;
		for(i = 1; i < endSum; i+=2) {
			sum+=i;
		}
		System.out.println("Sum: " + sum);
		
		// #10
		System.out.println("Sum to end at: ");
		endSum = kbd.nextInt();
		sum = 0;
		for(i = 2; i < endSum; i+=2) {
			sum+=i;
		}
		System.out.println("Sum: " + sum);
		
		// #11
		System.out.println("Base Num: ");
		baseNum = kbd.nextInt();
		sum = baseNum;
		i = 1;
		System.out.println("To what power of i do you want the program to end at?");
		power = kbd.nextInt();
		while(i<=power) {
			sum+= Math.pow(baseNum, i);
			i++;
		}
		System.out.println("Sum: " + sum);
		kbd.close();			

	}

}
