package chapter2.section5;

public class WrapperClass {

	public static void main(String[] args) {
		/*
		 * Assigning a value to a wrapper class
		 * 1. Assignment (using primitives)
		 * 2. Constructors
		 * 3. Static methods
		 */
		Integer n = 17;
		Boolean bool = new Boolean(true);
		Boolean bool2 = Boolean.valueOf("TrUe");
		System.out.println(n);
		System.out.println(bool);
		System.out.println(bool2);
		System.out.println();
		
		//Example illustrating how to use [primitive]Value() method of wrapper classes 
		int num = new Integer(13).intValue();
		System.out.println(num);
		System.out.println();
		
		//Examples of parse method for wrapper classes
		Long l;
		System.out.println(l = Long.parseLong("123"));
		System.out.println(Boolean.parseBoolean(null));
		System.out.println();
		
		/*
		 * Code to understand how the valueOf() method works in wrapper classes
		 * Integer, Short, Byte, Long : Cached objects in the range -128 to 127
		 * Character: Cached objects in the range 0 to 127
		 */
		
		Short num1 = Short.valueOf((short)126);
		Short num2 = Short.valueOf((short)126);
		/*
		 * Returns true
		 * What's happening here is that num1 and num2 refer to the same predefined
		 * cached object which is of the value 126
		 * The == operator in this instance compares whether each object refers to the same
		 * address in memory which in this case is true
		 */
		System.out.println(num1 == num2);
		System.out.println();
		
		/*
		 * Returns false
		 * The objects are outside of the cached object range which means a new reference is made
		 * for each object. When comparing the two, both refer to different memory addresses making the
		 * result false
		 */
		num1 = (short)126;
		num2 = (short)126;
		System.out.println(num1 == num2);
		num1 = Short.valueOf((short)128);
		num2 = Short.valueOf((short)128);
		System.out.println(num1 == num2);	
		System.out.println();
		
		//Contructor comparisons (constructors create new instances)
		Long num3 = new Long(13);
		Long num4 = new Long(13);
		System.out.println(num3 == num4);
		System.out.println();
		
		//Autoboxing comparisons the primitive values stored in each reference variable
		Short num5 = (short) 13;
		Short num6 = (short) 13;
		System.out.println(num5 == num6);
		System.out.println();
		
		//Returns true b/c .equals() compares the primitive values of each object
		System.out.println(num5.equals(num6));
		System.out.println(num4.equals(num5)); //false b/c they are not instances of the same class
		System.out.println();
		
		//Example of autoboxing and unboxing
		Double d = 17.3;
		Double d2 = 17.3; //autoboxing to a new instance of Double
		double d3 = d + d2; //unboxing the primitive values of both reference variables
		System.out.println(d3);

	}

}
