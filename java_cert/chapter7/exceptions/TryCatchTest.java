package chapter7.exceptions;

public class TryCatchTest {

	static String word;
	public static void main(String[] args) {
		try {
			System.out.println(4/0);
			word.length();
		} catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("Division by 0");
		} catch(NullPointerException e2) { //Never gets to this block because of the exception in line 8
			System.out.println("The variable \"word\" is null");
		}
		
		finally {
			System.out.println("This code will always execute");
		}

		//Control transfers to the statement following the try/catch/finally construct
		System.out.println("\n");
		
		try {
			word.length();
		} catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("Division by 0");
		} catch(NullPointerException e2) { 
			System.out.println(e2);
			System.out.println("The variable \"word\" is null");
		}
		
		finally {
			System.out.println("This code will always execute");
		}
		
		System.out.println("\n");
		
		
		/**
		 * Order of catch block matters
		 * This code will not compile b/c the catch block with the parameter "Exception e" already covers all 
		 * exceptions so the second catch block is unreachable
		 */
		
//		try {
//			System.out.println(4/0);
//		} catch (Exception e) {
//			
//		} catch (ArithmeticException e2) { //Won't compile at this line
//			
//		}
		
		//The position of the catch and finally block cannot be interchanged (code won't compile)
//		try {
//			
//		} finally {
//			
//		} catch(Exception e) {
//			
//		}

	}

}
