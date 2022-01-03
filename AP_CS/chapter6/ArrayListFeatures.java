package chapter6;

import java.util.ArrayList;

public class ArrayListFeatures {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>(); 
		for(int i = 0; i < 5; i++) {
			arr.add(i);
			
		}
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(32);
		arr2.add(46);
		arr2.add(108);
		arr.addAll(1, arr2);
		for(int i : arr) {
			System.out.println(i);
		}
		System.out.println();
		ArrayList<Integer> arr3 = new ArrayList<Integer>();
		arr3.add(1);
		arr3.add(2);
		arr.removeAll(arr3);
		for(int i : arr) {
			System.out.println(i);
		}
		
		ArrayList<String> invited = new ArrayList<String>();
		invited.add("Sally");
		invited.add("Mark");
		invited.add("Jacob");
		invited.add("Mark");
		invited.add("Matt");
		System.out.println();
//		String [] test = {"Hello"};
		ArrayList<String> atParty = new ArrayList<String>(invited);
		atParty.add("Mark");
		atParty.add("Jacob");
		invited.removeAll(atParty);
//		invited.clear();
		for(String names: atParty) {
			System.out.println(names);
		}
		ArrayList<String> check = new ArrayList<String>();
		check.add("Sally");
		check.add("Mat");
		System.out.println(invited.containsAll(check));
	}

}
