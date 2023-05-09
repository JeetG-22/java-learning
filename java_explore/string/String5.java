package string;
import java.util.Scanner;
public class String5 {

	public static void main(String[] args) {
		//Jeet Gupta 5/7/19
		//Asking user for word and if it ends with ing then the program will output true and if it doesn't then it will output false
		
		//Declare
		Scanner kbd = new Scanner(System.in);
		String word;
		
		//Ask user
		System.out.println("Give me a word.");
		word = kbd.next();
		
		//Print Answer
		System.out.println(word.endsWith("ing"));
		kbd.close();

	}

}
