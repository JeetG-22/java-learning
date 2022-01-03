package chapter4.learnstring;

public class StringTestClass {

	public static void main(String[] args) {
		/*
		 * Testing out String equality in Java
		 */
		String str1 = new String("Test");
		String str2 = new String("Test");
		System.out.println(str1 == str2); // Prints false b/c == compares the String objects memory addresses

		String str3 = "Test"; // When this line is executed the "Test" object is put into a String pool
		// This object references the "Test" object in String pool created when line 13 was executed
		String str4 = "Test"; 
		System.out.println(str3 == str4);
		
		String str5 = new String(); //Value is "" not null
		System.out.println(str5.equals(""));
		
		

	}

}
