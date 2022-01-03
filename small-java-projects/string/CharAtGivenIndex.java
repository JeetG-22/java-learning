package string;
import java.util.Scanner;
public class CharAtGivenIndex {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		String name = "Java Exercises!";
		int userInput;
		
		//String Name Printed Out
		System.out.println(name);
		
		System.out.println("Give me the character index.");
		userInput = kbd.nextInt();
		if(0<=userInput && name.length()>userInput) {
			System.out.println(name.charAt(userInput));
		}
		else{
			System.out.println("Error! Next time give me a number between 0 and " + (name.length()-1));
		}
		kbd.close();
		
	}

}
