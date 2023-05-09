package string;
import java.util.Scanner;
public class String9 {

	public static void main(String[] args) {
		//Declare
		String word;
		Scanner kbd = new Scanner(System.in);
		
		//Ask User
		System.out.println("Enter a word");
		word = kbd.next();
		
		//Print Answer
		//System.out.println(word.substring(1));
		System.out.println(word.equals(word.substring(1) + word.substring(0,1)));
		kbd.close();

	}

}
