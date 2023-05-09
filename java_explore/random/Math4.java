package random;
import java.util.Scanner;
public class Math4 {

	public static void main(String[] args) {
		
		//Declare
		Scanner kbd = new Scanner(System.in);
		int secondGiven,minute,remainder,secondFinal,hour;
		
		//Ask user
		System.out.println("Give me the seconds.");
		secondGiven= kbd.nextInt();
		
		//Calculate
		hour = secondGiven / 3600;
		remainder = secondGiven % (hour*3600);
		minute = (remainder/60);
		secondFinal = (remainder%60);
		
		//Print Answer
		System.out.println("The time is " + hour + " hours " + minute + " minutes " + secondFinal + " seconds");
		//System.out.println(remainder);
		
		kbd.close();
		
		/**		hour=Math.floor(secondGiven/3600);
		minute= Math.floor((secondGiven/3600 - hour)*60);
		secondFinal= (secondGiven) - ((hour*3600)+(minute*60)); */

	}

}
