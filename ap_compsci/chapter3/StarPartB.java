package chapter3;

public class StarPartB {

	public static void main(String[] args) {
		for (int row = 1; row <= 10; row++) {
			for (int spaces = 0; spaces < 10 - row; spaces++) {
				System.out.print(" ");
			}
			for (int stars = 0; stars < row; stars++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
