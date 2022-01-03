package chapter4;

public class Chapter4Quiz2 {

	public static void main(String[] args) {
//		q3();
//		System.out.print(";");
//		q8();
//		char[][] cA = new char[3][];
//		for(int i = 0; i<cA.length; i++) {
//			cA[i] = new char[4]; 
//		}
//		System.out.println(cA[2][3]);
//		q9();
		String line = " hello  ";
		String newLine = line.trim();
		System.out.println((int)(line.length() + newLine.length()));
	}
	
	//Question 1
	
	public static void q1() {
//		"1".inte
	}
	
	//Question 2
	
	public static void q2() {
		
	}
	
	//Question 3
	
	public static void q3() {
		String String = "string is a string";
		System.out.print(String.substring(3,6));
	}
	
	//Question 4
	
	public static void q4() {
//		"".subs
	}
	
	//Question 5
	
	public static void q5() {
		int k = 1;
		int a[] = {1};
		k+= (k=4) * (k+2);
		a[0] += (a[0] = 4) * (a[0] + 2);
		System.out.println(k + " , " + a[0]);
	}

	//Question 6
	
	public static void q6() {
//		ArrayList;
	}
	
	//Question 7
	
	public static void q7() {
		Object o = new Object();
		Object o2 = o;
		System.out.println(o.equals(o2));
		
	}
	
	//Question 8
	
	public static void q8() {
		StringBuffer word = new StringBuffer("hello");
		word.reverse();
		System.out.println(word);
	}
	
	//Question 9
	
	public static void q9() {
		int i = 4;
		int arr[][][] = new int[i][i=3][i];
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[0][0].length);
	}
	
	//Question 10
	
	public static void q10() {
		
	}
}
