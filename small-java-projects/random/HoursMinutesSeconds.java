package random;

import java.util.Scanner;

public class HoursMinutesSeconds {

	public static void main(String[] args) {
		
		Scanner kbd = new Scanner(System.in);
		int hours,minutes,remainder,newSeconds,seconds;
		
		System.out.println("Seconds: ");
		seconds = kbd.nextInt();
		
		hours = seconds / 3600;
	    remainder = seconds % 3600;
		minutes = remainder / 60;
		remainder %= 60;
		newSeconds = remainder;
		
		System.out.println(hours + ":" + minutes + ":" + newSeconds);
		kbd.close();
		

	}

}
