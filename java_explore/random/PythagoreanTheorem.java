package random;
import java.util.*;
public class PythagoreanTheorem {
	public static void  main(String[] args) {
		double a,b, hypo, answer ;
		System.out.print("Please enter the first side of the triangle ");
		Scanner keyboard = new Scanner(System.in);
		a = keyboard.nextDouble();
		System.out.print("Please enter the second side of the triangle ");
		b = keyboard.nextDouble();
		hypo = (Math.pow(a,2))+(Math.pow(b,2));
		answer = (Math.sqrt(hypo));
		System.out.println(answer);	
		keyboard.close();
		
	}

}
