package chapter4.stringbuilder;

public class StringBuilderTest {

	/*
	 * Testing String Builder Methods
	 */
	public static void main(String[] args) {
		StringBuilder const1 = new StringBuilder(); //default capacity: 16
		StringBuilder const2 = new StringBuilder(25); //Specifies capacity
		StringBuilder const3 = new StringBuilder("Test"); //capacity: (string obj).length() + 16

		//append() adds a specified value to the end of an existing value
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(new Integer(8));
		sb.append("World");
		System.out.println(sb);
		
		//insert() lets you insert data at a particular position (little more powerful than append())
		StringBuilder sb2 = new StringBuilder("TestValue");
		sb2.insert(4, "World"); //Pushes the value at position 4 to the right
		System.out.println(sb2); 
		char arr[] = {'1','2','J','A'};
		sb2.insert(2, arr, 1, 3); //Using a different overloaded insert() method
		System.out.println(sb2);
		
		//delete() removes a substring at a specified starting and ending position (exlusive)
		StringBuilder sb3 = new StringBuilder("JAVA");
		System.out.println(sb3.delete(1, 3));
		
		//deleteCharAt() removes a character at a specified index
		StringBuilder sb4 = new StringBuilder("JAVA");
		System.out.println(sb4.deleteCharAt(1));
		
		//reverse() reverses the sequence of the characters
		System.out.println(sb4.reverse());
		
		//replace() replaces a sequence of characters (indentified by position) with another String
		StringBuilder sb5 = new StringBuilder("Basketball");
		System.out.println(sb5.replace(2, 5, "Soccer"));
		
		//subsequence() returns a charSequence & substring() returns a String 
		StringBuilder sb6 = new StringBuilder("Python");
		//Both methods do not change the value of sb6
		System.out.println(sb6.substring(1,3));
		System.out.println(sb6.subSequence(1, 3));


	}

}
