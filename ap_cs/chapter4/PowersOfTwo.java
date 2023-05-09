package chapter4;

 public class PowersOfTwo {

	public static void main(String[] args) {
		powersOfTwo();

	}
	public static void powersOfTwo () {
		java.lang.String s = new java.lang.String("this");
		System.out.println(s);
		for(int i = 1; i <= 10; i++) {
			System.out.print("2^" + i + "=" + Math.pow(2, i));
			System.out.print(" \t");
			if(i==5) {
				System.out.println();
			}

		}
	}

}
