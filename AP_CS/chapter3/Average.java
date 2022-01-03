package chapter3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Average {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");
		int sum = 0, value, count = 0;
		
		System.out.println("Enter an integer (0 to quit): ");
		value = kbd.nextInt();
		if(value!=0) {
		while(value!=0) {
			count++;
			
			sum += value;
			System.out.println("Sum so far: " + sum);
			
			System.out.println("Enter an integer (0 to quit): ");
			value = kbd.nextInt();
		}
		System.out.println("Number of values entered: " + count);
		
		double average = (double)sum/count;
		System.out.println("Average: " + df.format(average));
		} else {
			System.out.println("Error! Please try again.");
		}
		kbd.close();
		

	}

}
