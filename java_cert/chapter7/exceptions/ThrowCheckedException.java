package chapter7.exceptions;

import java.io.FileNotFoundException;

public class ThrowCheckedException {

	public static void main(String[] args) {
//		fileNotFoundTest(); //Won't compile
	}
	
	public static void fileNotFoundTest() throws FileNotFoundException {
		throw new FileNotFoundException();
	}
	
	/**
	 * Three methods showing how to approach exceptions
	 */
	
	//Handle exception using try/catch
	public static void handleException() {
		try {
			fileNotFoundTest();
		} catch(FileNotFoundException e) {
			
		}
	}
	
	//Throw the exception
	public static void declareException() throws FileNotFoundException {
		fileNotFoundTest();
	}
	
	//Apply both techniques in the preceding methods
	public static void handleAndDeclareException() throws FileNotFoundException {
		try {
			fileNotFoundTest();
		} catch(FileNotFoundException e) {
			
		}
	}
}
