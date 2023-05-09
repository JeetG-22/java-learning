package chapter3;

public class Program7 {

	public static void main(String[] args) {
		int n = 5;
		int nsp = n-1;
		for(int i = 1; i <= n; i++) {
			for(int k = 0; k<nsp; k++) {
				System.out.print(" ");
			}
			for(int num = 1; num <= i; num++) {
				System.out.print(num + " ");
			}
			System.out.println();
			nsp--;
		}

	}

}
