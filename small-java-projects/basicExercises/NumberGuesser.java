package basicExercises;
import java.util.Scanner;
public class NumberGuesser {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int userGuess = 0;
		int count = 0;
		int num = (int)(Math.random()*100);
		System.out.printf("Hello %s!%n", "World");
		System.out.println("Welcome to Number Guess Game!");
		System.out.println("I am thinking of a number between 0 - 100, inclusive");
		while(userGuess!=num) {
			System.out.println("Give me a number and I will tell you if its higher or lower.");
			userGuess = kbd.nextInt();
			if(userGuess > num) {
				System.out.println("Lower");
				count++;
			} else if (userGuess < num) {
				System.out.println("Higher");
				count++;
			} 
		}
		count++;
		System.out.println();
		System.out.println("Congratulations! You guessed the number. It took you " + count + " tries.");
		kbd.close();
		

	}

}
