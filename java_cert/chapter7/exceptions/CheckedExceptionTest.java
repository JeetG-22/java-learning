package chapter7.exceptions;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileNotFoundException;

public class CheckedExceptionTest {

	public static void main(String[] args) {
		

	}
	
	
	/**The exception thrown must be handled by the method **/
	
//	public static void fileNotFoundTest() {
//		throw new FileNotFoundException(); //Compilation error
//	}
	
	//Correct implementation
	public static void fileNotFoundTest() throws FileNotFoundException {
		throw new FileNotFoundException(); //Where the exception is being thrown
	}
	
	/** Example of multiple class exceptions from the throws clause **/
	
	public static void multipleExceptions() 
			throws FileNotFoundException, ArrayIndexOutOfBoundsException, NullPointerException
	{
		/*
		 * Runtime exceptions and errors in the method declaration aren't required 
		 * A method can still throw runtime and errors without including them in the throws clause
		 * The method doesn't need to include the code that might throw the exceptions
		 */
	}
	
	/**
	 * To use a method that throws a checked exception you must:
	 * "Handle the exception": Use a try/catch block to "catch" the exception
	 * "Declare it to be thrown" : Use the throws clause
	 * "Handle and declare": implement both the preceding options (only checked exceptions)
	 */
	
	
	//Example of using a try/catch to catch a checked exception that isn't thrown in the try statement
//	void tryCatchUncheckedExc() {
//		try {}
//		catch(FileNotFoundException e) { //Won't compile b/c the exception isn't thrown in the try statement
//			
//		}
//	}
	
	
	

}
