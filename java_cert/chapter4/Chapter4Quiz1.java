package chapter4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Chapter4Quiz1 {

	String s;
	String s1 = this.toString();
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("java");
		String s = "java";
		System.out.println(s.equals(sb));
//		q4();
//		q6();
//		saveObject(new ArrayList());
//		Collection c = new ArrayList();
////		saveObject(c);
//		
//		List l = new ArrayList();
//		saveObject(l);
//		saveObject(null);
//		saveObject(0);
		A[] a, a1;
		B[] b;
		a = new A[10];
		a1 = a;
		b = new B[20];
		a=b;
		b = (B[]) a;
		b = (B[]) a1;
	}
	
	//Question 1
	/**
	 * The original string is not changed
	 */
	
	//Question 2
	
	public static void testString() {
		
		String s = "Hello";
		s.reverse(); //Not a method is String class
	}
	
	//Question 3
	
	public static void testStringArr() {
		String[] s = new String[1] {"aaa"}; //Wrong init
	}
	
	//Question 4
	
	public static void q4() {
		System.out.print("   Hello java guru    ".trim());
	}
	
	//Question 5
	
	//Question 6
	
	public static void q6() {
		int index =1;
		String arr[] = new String[5];
		String word = arr[index];
		System.out.println(word);
	}

	//Question 7
	/**
	 * look under the class definition to see the answer
	 */
	
	//Question 8
	
	static int i = 0;
	static Object prevObj;
	public static void saveObject(List e) {
		prevObj = e;
		i++;
	}
	
	//Question 9
	
	//Question 10

}
class A{}
class B extends A{}
