package chapter7.exceptions;

public class ThrowRuntimeException {

	public static void main(String[] args) {
		
		//Handling a runtime exception
		String [] word = new String[4];
		try {
			word[0].length();
		} catch (Throwable e){
			System.out.println("Exception:" + e);
		}
		
		
	}
	
	//Throws clause isn't needed b/c ArrayIndexOutOfBoundsException is a subclass of RuntimeException
	public static void runtimeExceptionTest() throws ArrayIndexOutOfBoundsException {
		throw new ArrayIndexOutOfBoundsException();
	}

}
