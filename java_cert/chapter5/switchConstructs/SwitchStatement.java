package chapter5.switchConstructs;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter 1, 2, or 3");
		int x = kbd.nextInt();
		switch (x) { // Switch statements can't take long or doubles
		case 1:
			System.out.println("Case 1");
			break;
		case 2:
			System.out.println("Case 2");
			break;
		case 3:
			System.out.println("Case 3");
			break;
		default:
			System.out.println("Not Case 1, 2, 3");
		}
		kbd.close();

		//Same as the switch statement above
		if (x == 1) {
			System.out.println("Case 1");
		} else if(x==2) {
			System.out.println("Case 2");
		} else if(x==3) {
			System.out.println("Case 3");
		} else {
			System.out.println("Not Case 1, 2, 3");
		}

	}

}
