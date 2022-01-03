package foundationtest;

import java.io.FileNotFoundException;

public class DerivedClass extends SubBaseClass {

	String name = super.name;
	public static void main(String[] args) {
		try {
			new DerivedClass().print();
			
		} catch(NullPointerException e) {
			
		}
		finally {
			System.out.println("In Happend");
		}

	}
	
	void print() throws NullPointerException{
		String word = null;
		System.out.println(word.charAt(3));
	}

}
