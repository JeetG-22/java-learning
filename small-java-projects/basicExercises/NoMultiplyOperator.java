package basicExercises;
import java.util.Scanner;
public class NoMultiplyOperator {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int num1,num2;
		int product = 0;
		int i = 0;
		System.out.println("Give me a num:");
		num1 =kbd.nextInt();
		System.out.println("Give me a num:");
		num2 =kbd.nextInt();
		while (i<num2) {
			product = product + num1;
			i++;
		}
		System.out.println(product);
		kbd.close();

	}

}
