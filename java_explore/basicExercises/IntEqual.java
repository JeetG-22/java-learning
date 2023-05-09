package basicExercises;
import java.util.Scanner;
public class IntEqual {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int v1,v2,v3,v4;
		
		System.out.println("Give me first num:");
		v1 = kbd.nextInt();
		System.out.println("Give me second num:");
		v2 = kbd.nextInt();
		System.out.println("Give me third num:");
		v3 = kbd.nextInt();
		System.out.println("Give me fourth num:");
		v4 = kbd.nextInt();
		
		if(v1==v2 && v1==v3 && v1==v4) {
			System.out.println("They are all equal.");
		}
		else {
			System.out.println("They are not all equal.");
		}
		kbd.close();
		

	}

}
