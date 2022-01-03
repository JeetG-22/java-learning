package chapter4;

public class NumberDiamond {

	public static void main(String[] args) {
		int n = 5;
		int nsp = n-1;
		int nst = 1;
		for(int i = 0; i < n; i++) {
			for(int k = 0; k < nsp; k++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= nst; j++) {
				System.out.print(j);
			}
			System.out.println();
			nst+=2;
			nsp--;
		}
		nsp+=2;
		nst-=4;
		for(int i = 0; i < n; i++) {
			for(int k = 0; k < nsp; k++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= nst; j++) {
				System.out.print(j);
			}
			System.out.println();
			nst-=2;
			nsp++;
		}

	}
	

}
