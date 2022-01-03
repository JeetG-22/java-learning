package chapter4;

public class CountA {

	public static void main(String[] args) {
		System.out.println("Word: AppleAndOrAnge" );
		System.out.println("Number of A's: " + countA("AppleAndOrAnge"));

	}
	public static int countA(String word) {
		int count = 0;
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == 'A') {
				count++;
			}
		}
		return count;
	}

}
