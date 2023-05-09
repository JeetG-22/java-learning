package chapter4;

public class Sum100 {

	public static void main(String[] args) {
		System.out.println("Sum (1-100): " + sum100());
	}
	public static int sum100() {
		int sum = 0;
		for(int i = 1; i <=100; i++) {
			sum+=i;
		}
		return sum;
	}

}
