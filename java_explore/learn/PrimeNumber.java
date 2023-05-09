package learn;

public class PrimeNumber {

	public static void main(String[] args) {
		int primeNum = 2;
		int n = 1000;
		for(int i = 4; i <= n; i++) {
			if((Math.pow(i, 2)-1)%24==0 && i%5!=0) {
				System.out.println(i);
				primeNum++;
			}
		}
		System.out.println(primeNum);

	}

}
