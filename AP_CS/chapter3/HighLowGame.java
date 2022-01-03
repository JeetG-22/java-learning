package chapter3;

import java.util.Scanner;

public class HighLowGame {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int randomNum = (int)(Math.random()*100+1);
		System.out.println(randomNum);
		int userInput = 0, count = 0;
		while(userInput!=randomNum) {
			System.out.println("Number: ");
			userInput = kbd.nextInt();
			if(userInput<randomNum) {
				System.out.println("Higher!");
			} 
			else if(randomNum<userInput){
				System.out.println("Lower!");
			}
			count++;
		}
		System.out.println("Congrats! You guessed the number " + randomNum + " in " + count + " tries.");
		kbd.close();

	}

}
