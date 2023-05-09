package pro;

public class Arrow {

	public static void main(String[] args) {
		int n = 10;
		int nsp = 0;
		int nst = 1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < nsp; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < nst; k++) {
				System.out.print("-");
			}
			System.out.println();
			nsp++;
			nst++;
		}
		nst = n-1;
		nsp = n-1;
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < nsp; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < nst; k++) {
				System.out.print("-");
			}
			System.out.println();
			nsp--;
			nst--;
		}
		

	}

}
