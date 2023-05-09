package chapter3;

public class StarPartC {

	public static void main(String[] args) {
		for (int row = 0; row < 10; row++) {
			for (int spaces = 0; spaces < row; spaces++) {
				System.out.print(" ");
			}
			for (int stars = 0; stars < 10 - row; stars++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
