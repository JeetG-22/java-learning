package chapter2;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Chap2_7 {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		NumberFormat money = NumberFormat.getCurrencyInstance();
		/**
		 * Calculated Hours:Mins:Secs given totalSeconds
		 */
//		int totalSeconds = kbd.nextInt();
//		int remSec = totalSeconds % 3600;
//		int hours = totalSeconds / 3600;
//		int min = remSec / 60;
//		remSec %= 60;
//		System.out.println(hours + ":" + min + ":" + remSec);

		String phoneNum = "";
		for (int i = 1; i <= 10; i++) {
			if (i <= 3) {
				phoneNum += (int) (Math.random() * 8);
			}
			if (i > 3 && i <= 6) {
				if (i == 4) {
					phoneNum += (int) (Math.random() * 6);
				}
				if (i == 5) {
					phoneNum += (int) (Math.random() * 5);
				}
				if (i == 6) {
					phoneNum += (int) (Math.random() + .5);
				}
			}
			if (i > 6) {
				phoneNum += (int) (Math.random() * 10);
			}
			if (i % 3 == 0 && i != 9) {
				phoneNum += "-";
			}
		}
		System.out.println(phoneNum);

	}

}
