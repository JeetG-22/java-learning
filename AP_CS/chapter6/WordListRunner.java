package chapter6;

import java.util.ArrayList;

public class WordListRunner {

	public static void main(String[] args) {
		WordList animal = new WordList();
		ArrayList<String> list = new ArrayList<String>();
		animal.add("cat");
		animal.add("mouse");
		animal.add("frog");
		animal.add("dog");
		animal.add("dog");
		System.out.println(animal.numWordsOfLength(3));
		animal.removeWordsOfLength(4);
		list = animal.getList();
		for (String word : list) {
			System.out.print(word + "\t");
		}
		String num = "Hello";
		test(num);
		System.out.println(num);
	}
	public static void test(String num) {
		num = num.toUpperCase();
	}

}
