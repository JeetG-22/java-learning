package chapter7.exceptions;

import java.io.FileNotFoundException;

public class FinallyBlockTest {

	public static void main(String[] args) {
		System.out.println(finallyReturnTest());
		System.out.println("\n");
		System.out.println(finallyCatchReturnTest());
		System.out.println("\n");
		System.out.println("Value of \"num\" in main method: " + updatePrimitiveReturnValue());
		System.out.println("\n");
		System.out.println("Value of \"phrase\" in main method: " + updateObjectReturnValue());
		System.out.println("\n");
//		tryFinallyTest();
		System.out.println("\n");
		nestedTryBlocks();
		
		//You shouldn't handle errors
		try {
			myMethod();
		} catch(StackOverflowError s) {
			System.out.println(10);
		}
		

	}

	/*
	 * finally block is executed before the return statement in the catch block
	 * gives control back to the main method
	 */

	public static boolean finallyReturnTest() {
		try {
			System.out.println(4 / 0);
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			System.out.println("After the return statement is executed");
		}

	}

	/*
	 * Example when both catch and finally block define return statements
	 * 
	 * Outcome: When this happens, the value returned to the calling method is from
	 * the finally block
	 */

	public static boolean finallyCatchReturnTest() {
		try {
			System.out.println(((String) null).length());
			return false;
		} catch (Exception e) {
			System.out.println("In catch block");
			return true;
		} finally {
			System.out.println("In finally block");
			return false;
		}
	}

	/*
	 * Example of modifying a value in a finally block that is returned by the catch
	 * block
	 * 
	 * Outcome using primitive values: Returns the value in the catch block prior to the update made to the
	 * primitive variable in the finally block
	 * 
	 * Outcome using objects: The finally block can modifiy mutable objects before it is returned back to the 
	 * main method. 
	 * 
	 * Remember that primitives are passed by value and objects are passed by reference
	 */

	public static int updatePrimitiveReturnValue() {
		int num = 10;
		try {
			System.out.println(((String) null).length());
			return 0;
		} catch (Exception e) {
			System.out.println("Value of \"num\" in catch block: " + num);
			return num;
		} finally {
			num += 25;
			System.out.println("Value of \"num\" in finally block: " + num);
		}
	}
	
	public static StringBuilder updateObjectReturnValue() {
		StringBuilder phrase = new StringBuilder("Hello");
		try {
			System.out.println(((String) null).length());
			return null;
		} catch (Exception e) {
			System.out.println("Value of \"phrase\" in catch block: " + phrase);
			return phrase;
		} finally {
			phrase.append(" World");
			System.out.println("Value of \"phrase\" in finally block: " + phrase);
		}
	}
	
	/*
	 * A try block can be followed only by a finally block if the possible exception in 
	 * the try block is an unchecked exception
	 * 
	 * If the exception is a checked exception then a catch block is needed or the method must declare
	 * to throw the exception
	 */
	
	public static void tryFinallyTest(){
		String word = null;
		try {
			word.length();
		} finally {
			System.out.println("In finally block before exception is thrown");
		}
	}
	
	/*
	 * Example of two methods not wanting to handle the exception
	 */
	
	public static void method1() throws FileNotFoundException{
		throw new FileNotFoundException();
	}
	
	public static void method2() throws FileNotFoundException{
		method1();
	}
	
	/*
	 * Nested try catch blocks
	 */
	
	public static void nestedTryBlocks() {
		try {
			try {
				System.out.println("Inner try block");
				System.out.println(4/0);
			} catch(NullPointerException e) { //Since this isn't the right exception
											  //execution goes to the outer catch block 
				System.out.println("Inner catch block");
			}
			System.out.println("Outer try block");
		} catch(Exception e) {
			System.out.println("Outer catch block");
		} finally {
			try {
				System.out.println("Inner try block inside outer finally block");
			} catch (Exception e) {
				System.out.println("Inner catch block inside outer finally block");
			} finally {
				System.out.println("Inner finally block inside outer finally block");
			}
		}
	}
	
	/*
	 * Handling errors
	 */
	
	public static void myMethod() {
		System.out.println("myMethod");
		myMethod();
	}

}
