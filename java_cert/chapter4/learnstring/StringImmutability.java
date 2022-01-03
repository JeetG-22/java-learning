package chapter4.learnstring;

public class StringImmutability {

	public static void main(String[] args) {
		/*
		 * Test String immutablity in Java
		 * The String literal is never changed when using the service methods of String class
		 */
		String word = "Test";
		System.out.println(word.replace("e", "a")); //The replace() method returns a new String object
		System.out.println(word); //word is never changed

	}

}
