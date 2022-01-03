package chapter2;

public class Chapter2Test {

	public static void main(String[] args) {
//		question1();
//		question2();
//		question3();
//		question4();
//		question6();
//		question9();
//		question10();

	}

	public static void question1() {
		int char1 = 97;
		int char2 = 98;

		System.out.print((char) char1 + (char) char2);
		System.out.print(" ");
		int a = 20;
		System.out.print((float) a);
	}

	public static void question2() {
		char a = 'a';
		char b = -10;
		char c = '1';
		integer d = 1000;
		System.out.println(++a + b++ * c - d);
	}

	public static void question3() {
		int a = 10;
		long b = 20;
		short c = 30;
		System.out.println(++a + b++ * c);
	}

	public static void question4() {
		Boolean buy = new Boolean(true);
		Boolean sell = new Boolean(true);
		System.out.print(buy == sell); // false
		boolean buyPrim = buy.booleanValue();
		System.out.print(!buyPrim); // false
		System.out.print(buy && sell); // true
	}

	public static void question5() {
		it a = 0;
		integer a2 = 7;
		long a3 = 0x10C;
		short a4 = 0512;
		double a5 = 10;
		byte a7 = -0;
		long a8 = 123456789;
	}

	public static void question6() {
		int ctr = 50;
		++ctr;
		System.out.println(ctr % 20);
	}

	public static void question7() {
		int a = 10;
		int b = 20;
		int c = (a * (b + 2)) - 10-4 * ((2*2) - 6;
		System.out.println(c);
	}

	public static void question8() {
		boolean b = false;
		int i = 90;
		System.out.println(i >= b);
	}

	public static void question9() {
		int num1 = 12;
		float num2 = 17.8f;
		boolean eJavaResult = true;
		boolean returnVal = num1 >= 12 && num2 < 4.567 || eJavaResult == true;
		System.out.println(returnVal);
	
	}
	public static void question10(){
		boolean myBool = false;
		int yourInt = 10;
		float hisFloat = 19.54f;
		System.out.println(hisFloat = yourInt);
		System.out.println(yourInt > 10);
		System.out.println(myBool = false);
	}
}
