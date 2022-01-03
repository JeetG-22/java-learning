package random;
import java.util.Scanner;
public class BasicCalculator {
	public static void main(String [] args) {
		
		Scanner kbd = new Scanner (System.in);
		double userNum, userNum2;
		int userDecision;
		int x=1;
		
		do {
		System.out.println("Type 1 for addition, type 2 for substraction, type 3 for multiplication, type 4 for division, type 5 for exponential, type 6 for logorithm base 10, type 7 for natural logorithm.");
		userDecision = kbd.nextInt();
		
		switch (userDecision) {
		
		case 1:
			System.out.println("Give me your first number.");
			userNum = kbd.nextDouble();
			System.out.println("Give me your second number.");
			userNum2 = kbd.nextDouble();
			System.out.println(add(userNum , userNum2));
		    break;
		case 2:
			System.out.println("Give me your first number.");
			userNum = kbd.nextDouble();
			System.out.println("Give me your second number.");
			userNum2 = kbd.nextDouble();
			System.out.println(subtract(userNum , userNum2));
			break; 
		case 3:
			System.out.println("Give me your first number.");
			userNum = kbd.nextDouble();
			System.out.println("Give me your second number.");
			userNum2 = kbd.nextDouble();
			System.out.println(multiply(userNum , userNum2 ));
			break;
		case 4:
			System.out.println("Give me your first number.");
			userNum = kbd.nextDouble();
			System.out.println("Give me your second number.");
			userNum2 = kbd.nextDouble();
			System.out.println(division(userNum , userNum2 ));
			break;
		case 5:
			System.out.println("Give me your base.");
			userNum = kbd.nextDouble();
			System.out.println("Give me your exponent.");
			userNum2 = kbd.nextDouble();
			System.out.println(exponential(userNum , userNum2 ));
			break;
		case 6:
			System.out.println("Give me your number.");
			userNum = kbd.nextDouble();
			System.out.println(logTen(userNum));
			break;
		case 7:
			System.out.println("Give me your number.");
			userNum = kbd.nextDouble();
			System.out.println(naturalLog(userNum));
			break;
			
		default:
			System.out.println("Error! You can only choose the numbers 1,2,3,4,5,6 or 7.");
			x=1;
			break;
		}
		} while (x==1);
			
		
		kbd.close();
	}
    public static double add(double userInput, double userInput2) {
    	return userInput + userInput2;
    }
    public static double subtract(double userInput, double userInput2) {
    	return userInput - userInput2;
    }
    public static double multiply(double userInput, double userInput2) {
    	return userInput * userInput2;
    }
    public static double division(double userInput, double userInput2) {
    	return userInput / userInput2;
    }
    public static double exponential(double base, double exponent) {
    	return Math.pow(base , exponent);
    }
    public static double logTen(double number) {
    	return Math.log10(number);
    }
    public static double naturalLog(double number) {
    	return Math.log(number);
    }
    
}
