package chapter4;

import java.util.Scanner;

public class PalindromeTester {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Word: ");
		String word = kbd.nextLine();
		String rpWord = removePunctuation(word);
		System.out.println("Palindrome: " + isPalindrome(rpWord,
				reverseString(rpWord)));
		kbd.close();
	}
	public static String removePunctuation(String word) {
		word = word.toLowerCase();
		String rpWord = ""; //New removed punctuation word
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i)>='a' && word.charAt(i)<='z') {
				rpWord+=word.charAt(i);
			}
		}
		return rpWord;
	}
	public static String reverseString(String rpWord) {
		String revWord = ""; //New reversed word
		for(int i = rpWord.length()-1; i >= 0; i--) {
			revWord+=rpWord.charAt(i);
		}
		return revWord;
	}
	public static boolean isPalindrome(String rpWord, String revWord) {
		return rpWord.equals(revWord);
	}

}
