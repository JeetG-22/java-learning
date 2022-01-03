package chapter2.section2;

public class IndentifierTest {

	public static void main(String[] args) {
		
		//Java keywords/reserved words can't be used to define a variable
		int int = 10;
		int transient = 20;
		boolean if = true;
		
		//Java indentifiers cannot start with number or use special characters
		int 7hello = 16;
		boolean t&f = true;
		
		/*
		 * Any position: Underscore, currency sign, letters
		 * Not starting position: Numbers
		 */
		
		int _thisIsA$Valid_Indentifier$__7 = 10;
		double $ = 25.7;
		
		System.out.println(_thisIsA$Valid_Indentifier$__7);
		System.out.println($);
	}

}
