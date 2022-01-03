package random;
import java.util.Scanner;
public class DistanceFormula {

	public static void main(String[] args) {
		
		Scanner kbd = new Scanner(System.in);
		double y1, y2, x2, x1, distance;	
		
		
		System.out.println("Give me the first x value");
		x1 = kbd.nextDouble();
		System.out.println("Give me the second x value");
		x2 = kbd.nextDouble();
		System.out.println("Give me the first y value");
		y1 = kbd.nextDouble();
		System.out.println("Give me the second y value");
		y2 = kbd.nextDouble();
		
		distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		System.out.println("The distance is " + distance);
		
		kbd.close();
		
		
	}

}
