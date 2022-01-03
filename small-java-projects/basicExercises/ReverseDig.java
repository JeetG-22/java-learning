package basicExercises;
import java.util.Scanner;
public class ReverseDig {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int num;
		System.out.println("Give me a postive integer");
		num = kbd.nextInt();
		int newNum = num;
		do {
			newNum = num % 10;
			System.out.print(newNum);
			num = num / 10;
		} while(num != 0);
		kbd.close();

	}

}
