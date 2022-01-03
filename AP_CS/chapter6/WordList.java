package chapter6;

import java.util.ArrayList;

public class WordList {
	private ArrayList<String> myList;

	public WordList() {
		myList = new ArrayList<String>();
	}
	
	public void add(String word) {
		myList.add(word);
	}
	
	public ArrayList<String> getList(){
		return myList;
	}
	public int numWordsOfLength(int len) {
		int count = 0;
		for (String words : myList) {
			if (words.length() == len) {
				count++;
			}
		}
		return count;
	}

	public void removeWordsOfLength(int len) {
		for (int i = myList.size() - 1; i >= 0; i--) {
			if (myList.get(i).length() == len) {
				myList.remove(i);
			}
		}
	}
}
