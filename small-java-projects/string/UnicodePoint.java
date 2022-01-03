package string;
import java.util.Scanner;
public class UnicodePoint {

	public static void main(String[] args) {
		String str = "w3resource.com";
		Scanner kbd = new Scanner(System.in);
		int userInput;
		
		//String Name Printed Out
		System.out.println(str);
		
		System.out.println("Give me the character index.");
		userInput = kbd.nextInt();
		if(0<=userInput && str.length()>userInput) {
			System.out.println(str.codePointAt(userInput));
		}
		else{
			System.out.println("Error! Next time give me a number between 0 and " + (str.length()-1));
		}
		kbd.close();
	}

}
