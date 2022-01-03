package random;
import java.util.Scanner;
public class TrigFunctions {
	public static void main(String[] args) {
		//Jeet Gupta 3-24-19
		//Asking user for what trig function they want me to calculate and giving them the answer from degrees
		//declare
		Scanner kbd = new Scanner(System.in);
		double x,y,z;
		int userNumber;
	
		//ask user
		System.out.println("What trig function do you want me to calculate for? Type 1 for sine, type 2 for cosine, and type 3 for tangent.");
		userNumber = kbd.nextInt();
	
		//calculate and print answer
		switch(userNumber) {
		case 1:
			System.out.println("What is the angle of your function?");
			x = kbd.nextDouble();
			System.out.println(Math.sin(Math.toRadians(x)));
			break;
		case 2: 
			System.out.println("What is the angle of your function?");
			y = kbd.nextDouble();
			System.out.println(Math.cos(Math.toRadians(y)));
			break;
		case 3: 
			System.out.println("What is the angle of your function?");
		    z = kbd.nextDouble();
		    System.out.println(Math.tan(Math.toRadians(z)));
		    break;
		default:
			System.out.println("Error! You didn't give me a number that was either 1, 2, or 3");
		}
		
		kbd.close();
		
		/* Program ran with if/else statements
		  
		  if (userNumber == 1) {
			System.out.println("What is the angle of your function?");
			x = kbd.nextDouble();
			System.out.println(Math.sin(Math.toRadians(x)));
			
		} else if (userNumber == 2) {
			System.out.println("What is the angle of your function?");
			y = kbd.nextDouble();
			System.out.println(Math.cos(Math.toRadians(y)));
		} else if (userNumber == 3) {
			System.out.println("What is the angle of your function?");
		    z = kbd.nextDouble();
		    System.out.println(Math.tan(Math.toRadians(z)));
		} else {
			System.out.println("Error! you didn't give me a number that was either 1, 2, or 3");
			 **/
		}
	} 


