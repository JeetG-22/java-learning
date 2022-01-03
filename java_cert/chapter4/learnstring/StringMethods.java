package chapter4.learnstring;

public class StringMethods {

	public static void main(String[] args) {
		
		/*
		 * charAt() returns a character in the String at a specified index.
		 * If index is outside the String range than a runtime error will occur
		 */
		System.out.println("Test".charAt(2));
		
		/*
		 * indexOf() takes either a String or a char value and finds/returns the first occurance
		 * in which the specified input is within the Strings. Returns -1 if the value is not found
		 * within the String 
		 */
		System.out.println();
		System.out.println("Test".indexOf('T'));
		System.out.println("Apple Juice".indexOf("Juice"));
		System.out.println("Apple Juice".indexOf("juice"));
		System.out.println("Apple Ace".indexOf("A", 5)); //Specifying where to start the search
		
		//substring() doesn't include the end position in its return value
		System.out.println();
		System.out.println("Apple".substring(1));
		System.out.println("Apple".substring(1,3));
		
		//trim() removes leading and trailing white spaces in a String (doesn't remove space between the String)
		System.out.println();
		System.out.println("   A B C  ".trim());
		
		/*
		 * replace() lets you replace char with another char or String with another String
		 * returns a new String object
		 */
		System.out.println();
		System.out.println("replace".replace('e', 'b'));
		System.out.println("replace".replace("epl", "lpe"));
		System.out.println("replace".replace("e", "b"));
		
		//length() returns the length of the String (one greater than the position of the last character of the String)
		System.out.println();
		System.out.println("test".length());
		
		//startsWith() & endsWith()
		System.out.println();
		System.out.println("ABC".startsWith("AB"));
		System.out.println("ABC".endsWith("BC"));
		
		//Chaining String methods example
		System.out.println();
		System.out.println("  A  B  C   ".replace("C", "D").trim());
		
		String test = "ABCAB";
		System.out.println(test.substring(0,2).startsWith("A"));
	}

}
