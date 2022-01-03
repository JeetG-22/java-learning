package chapter1.test;

public class JavaBasicQuiz {

	public static void main(String[] args) {
		question1();
		System.out.println();
		System.out.println();
//		question2();
		question5();
		System.out.println();
		System.out.println();
		question6();
		System.out.println();
		System.out.println();
		question7();
		System.out.println();
		System.out.println();
//		question8();
		question9();
		System.out.println();
		System.out.println();
		question10();
		System.out.println();
		System.out.println();
		question12();
		System.out.println();
		System.out.println();
		question13();
		System.out.println();
		System.out.println();
		question14();
	}

	public static void question1() {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int i = a.length - 1;
		while (i >= 0) {
			System.out.print(a[i]);
			i--;
		}
	}

	public static void question2() {
		/*
		 * catch block must be immedietly after the try block
		 * compilation error will occur if it doesn't
		 */
		int x = 0, y = 10;
		try {
			y/=x;
		}
		System.out.print("/ by 0");
		catch(Exception e) {
			System.out.print("error");
		}


	}

	public static void question4() {
		/*
		 * Interfaces cannot implement other interfaces but can extend them Interfaces
		 * cannot extend classes (only interfaces)
		 */

	}

	public static void question5() {
		int a[] = { 1, 2, 3, 4 };
		// Checks whether an object is of a particular type
		System.out.print(a instanceof Object);
	}

	public static void question6() {

		/*
		 * int a[2] = 053 prints 43 this is because in java, having a 0 preceding a
		 * number means that it is considered a octal base and 43 is the decimal
		 * equivalent of 053
		 */
		int a[] = { 1, 2, 053, 4 };
		int b[][] = { { 1, 2, 4 }, { 2, 2, 1 }, { 0, 43, 2 } };
		System.out.print(a[3] == b[0][2]);
		System.out.print(" " + (a[2] == b[2][1]));
	}

	public static void question7() {
		/*
		 * Don't need to define the column length
		 */
		int a[][] = new int[3][];
		a[1] = new int[] { 1, 2, 3 };
		a[2] = new int[] { 4, 5 };
		System.out.print(a[1][1]);
	}

	public static void question8() {
		/*
		 * Identifiers can start with _, letter, or a unicode currency
		 * character
		 */
		int _4_ = 10;
		int $ = 10;
		int getSize;

		int 1stName;
		int @name;

	}

	int a = 0;

	public static void question9() {
		new JavaBasicQuiz().print();
	}

	public static void print() {
		int a = 8;
		// Refers to the local variable, not the instance variable
		System.out.print(a + " ");
	}

	static int x = 10;

	public static void question10() {
		for (int x = 0; x < 5; x++) {

		}
		System.out.print(x);
	}
	
	public static void question11() {
		/*
		 * This has to do with aliases in java
		 * When you assign and object to another object that means that they both point to the same place in memory
		 * When you change the instances of one object, you change it for both
		 */
	}

	/*
	 * Trying to test whether aliases work the same with primitive variables (it doesn't)
	 */
	public static void question12() {
		int x = 10;
		int y = new JavaBasicQuiz().change(x);
		System.out.print(x+y);
	}
	public static int change(int x) {
		x = 12;
		return x;
	}
	
	/*
	 * This has to do with string immutiblity 
	 */
	public static void question13() {
		String s = "Java";
		s.concat(" SE 6");
		s.replace('6', '7');
		System.out.print(s);
	}
	
	public static void question14() {
		String s = "Java";
		s.concat(" SE 6");
		s.toLowerCase();
		System.out.print(s);
	}
	
	public static void question15() {
		/*
		 * b is never created in the print method
		 */
	}

}
