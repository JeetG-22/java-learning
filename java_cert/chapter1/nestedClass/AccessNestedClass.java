package chapter1.nestedClass;

import chapter1.nestedClass.NestedClass.Cube;
import chapter1.nestedClass.NestedClass.Cube.Cube2;
import chapter2.DefaultAccessModifier;

public class AccessNestedClass {

	public static void main(String[] args) {
		String word = "/* Harry */ Paul";
		System.out.println(word);
				
		/*
		 * To access nested classes you must first reference the outer class and then
		 * the inner class with the use of a dot seperator
		 * 
		 */
		NestedClass.Cube obj = new NestedClass.Cube();
		System.out.println(obj.getSides());
		
		//Referencing a nested class inside of a nested class
		NestedClass.Cube.Cube2 obj2 = new NestedClass.Cube.Cube2();
		System.out.println(obj2.getSides());
		System.out.println(obj2.getWord());
	}

}
