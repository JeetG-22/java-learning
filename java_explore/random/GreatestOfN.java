package random;
import java.util.Scanner;
public class GreatestOfN {

	public static void main(String[] args) {
		//Jeet Gupta 5/30/19
		//Asking user for N integers and printing out the greatest integer
		
		//Declare
		Scanner kbd = new Scanner(System.in);
		int greatestInt = 0;
		int userInt = 0;
			
		//Calculate using while loop
		while(userInt!=-9999) {
			System.out.println("If dont want to keep adding integers type -9999");
			userInt = kbd.nextInt();		
			greatestInt=Math.max(userInt,greatestInt);
			}
		//Print Answer
		System.out.println(greatestInt);
		kbd.close();
		}

	}


