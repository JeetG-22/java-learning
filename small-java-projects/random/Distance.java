package random;
import java.util.Scanner;
public class Distance {

	public static void main(String[] args) {
		//Declare
		Scanner kbd = new Scanner(System.in);
		
		double meters,mps,kph,mph,hours,sec,min;
		
		//Ask user
		System.out.println("Give me the hours");
		hours = kbd.nextDouble();
		System.out.println("Give me the minutes");
		sec = kbd.nextDouble();
		System.out.println("Give me the seconds");
		min = kbd.nextDouble();
		System.out.println("Give me the meters");
		meters = kbd.nextDouble();
		
		//Calculate
		mps = (meters / ((hours * 3600.0) + (min * 60.0) + sec));
		kph = ((meters / 1000.0) / (hours + (min / 60.0) + (sec / 3600.0)) );
		mph = ((meters / 1609.0) / (hours + (min / 60.0) + (sec / 3600.0)));
		
		System.out.println(mps + " : " + kph + " : " + mph);
		kbd.close();

	}

}
