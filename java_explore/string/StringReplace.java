package string;
import java.util.Scanner;
public class StringReplace {

	public static void main(String[] args) {
		String name;
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("Give me word or phrase.");
		name = kbd.nextLine();
		System.out.println(name.replace(name.charAt(name.length()-1),name.charAt(0)));
		kbd.close();

	}

}
