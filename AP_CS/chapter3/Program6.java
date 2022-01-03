package chapter3;

public class Program6 {

	public static void main(String[] args) {
		int n = 10;
		int sum = 0;
		int val1 = 0, val2 = 1;
		int i = 1;
		System.out.print(i + " ");
		while(i<=n) {
			sum = val1+val2;
			System.out.print(sum + " ");
			val1 = val2;
			val2 = sum;
			i++;
		}

	}

}
