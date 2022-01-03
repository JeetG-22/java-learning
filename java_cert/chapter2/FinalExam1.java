package chapter2;

import java.util.Arrays;

public class FinalExam1 implements A{
	public static void main(String[] args) {
		//Question 6
		short s = Short.MAX_VALUE;
		char c = s;
		System.out.println(c == Short.MAX_VALUE);
		
		//Question 11
		int i = 1234567890;
		float f = i;
		System.out.println(i - (int)f);
		
		//Question 12
		int a = 1;
		int [] ai = new int[10];
		int b = ai[a];
		int c = a+b;
		System.out.println(b=c);
		
		//Question 13
		float z=320;
		byte t = 320;

		//Question 14
		Integer num = new Integer(42);
		Long ln = new Long(42);
		Double d = new Double(42.0);
		System.out.println(num == ln);
		System.out.println(ln == d);
		System.out.println(num.equals(d));
		System.out.println(ln.equals(42));
		
		//Question 17
		short y = 10;
		char u = y;
		y= u;
		
		//Question 20
		Short num1 = new Short((short) 10);
		short num2 = 9;
		Integer k = 9;
		int num3 = 9;
		System.out.println(num1 instanceof Short);
		System.out.println(num2 == num3);
		Boolean j = num2 instanceof Number;
		System.out.println(k == num2);
		
	}	
	
	//Question 1
	public static void question1() {
		test1(10,20);
		test1(10);
	}
	
	public static void test1(int i, int... j) {
		System.out.println(i);
		System.out.println(Arrays.toString(j));
	}
	private static int loop =15;
	static final int INTERVAL = 10;
	boolean flag;
	
	//Question 3
	static {
		System.out.println("Static");
		loop = 1;
		loop+=INTERVAL;
		INTERVAL = 10;
	}
	
	{
		flag = true;
		loop = 0;
	}

	//Question 3
	@Override
	public void print() {
		//Overridden method is created
		
	}

}

interface A extends B{
	void print(); //Abstract by default
}

interface B {
	
}
