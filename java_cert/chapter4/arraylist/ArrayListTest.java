package chapter4.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<StringBuilder> myArrList = new ArrayList<StringBuilder>();
		StringBuilder one = new StringBuilder("One");
		StringBuilder two = new StringBuilder("Two");
		myArrList.add(one);
		myArrList.add(two);
		ArrayList<StringBuilder> yourArrList = myArrList;
		one.append("Hello");
		for (StringBuilder val : myArrList)
			System.out.print(val + ":");
		for (StringBuilder val : yourArrList)
			System.out.print(val + ":");

		// Creating ArrayList
		ArrayList<Integer> aList = new ArrayList<Integer>();

		// Adding elements to an ArrayList
		aList.add(1);
		aList.add(2);
		aList.add(3);

		// Accessing elements of an ArrayList
		System.out.println(aList.get(0));
		System.out.println(aList.get(1));
		System.out.println(aList.get(2));

		// Modifying elements of an ArrayList
		aList.set(0, 25);
		System.out.println(aList.lastIndexOf(3));

		// Deleting elements of an ArrayList
		aList.clear();
		aList.add(1);
		aList.add(2);
		System.out.println(aList.remove(1));

		// Other methods of an ArrayList
		System.out.println(aList.contains(new Integer(1)));
		System.out.println(aList.isEmpty());
		System.out.println(aList.toString());

		A a = new A();
		int arr[] = a.getNum();
		arr[1] = 6;
		
		System.out.println(a);
		
	}
	

}
class A {
	int num[];
	public A() {
		num = new int[]{1,2,3};
	}
	public int[] getNum() {
		return num;
	}
	public String toString() {
		return Arrays.toString(num);
	}
}
