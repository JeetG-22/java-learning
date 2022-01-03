package chapter4.arrays;

import java.io.Serializable;

public class ArrayTest {
	

	/*
	 * What is an Array? Array is an object that stores a collection of values
	 * An array can either store primitive values or object references (address pointers)
	 */
	public static void main(String[] args) {
		//3 steps to create an array: Declare, allocate, and initialize
		
		/*
		 * Declaration of an Array
		 * Brackets can follow the array type or name (preferred int[])
		 * Can't specify size of an array in the declaration
		 * Arrays can be of any data type other than null 
		 */
		int arr[];
		String [] arr2; 
		boolean [] arr3 [];
		
		/*
		 * Allocation of an Array
		 * Size of array can't expand or reduce once size is specified in the allocation step
		 * Once allocated, arrays store default values (objects arrays: null)
		 */
		arr = new int[5];
		arr2 = new String[3 * 7];
		arr3 = new boolean[7][7];
		//int arr4[] = new int[][] <-- Won't Compile (Brackets need to match on both sides)
		//int arr5[] = new int[][4] <-- Won't Compile (Value needs to at least be specified in the first bracket)
		
		/*
		 * Initialization of an Array
		 */
		for(int i = 0; i < arr.length; i++) { //loop initialization 
			arr[i] = i;
		}
		arr2[0] = "Dog"; //individual initializations
		arr2[1] = "Cat";
		
		for(int i = 0; i < arr3[1].length; i++) {
			for(int j = 0; j < arr3[i].length; j++) {
				if(j % 2 == 0) {
					arr3[i][j] = true;
				}
			}
		}
		arr3[3][3] = true;
		//Prints mutli dim array in row-major order
		for(int i = 0; i < arr3[1].length; i++) {
			for(int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j] + "\t");
			}
			System.out.println();
		}
		
		/*
		 * Combining declaration, allocation, and initialization of an Array
		 * You can't specify a size when doing this process
		 */
		int nArr[] = {1,2,3};
		String season[][] = new String[][] {{"Summer", "Winter"},{"Spring", "Fall"}};
		
		//If trying to do the creation of an array in two steps then you need the "new" operator
		int newArr[];
		newArr = new int[] {1,2}; //Can't do: newArr = {1,2};
		
		/*
		 * Asymmetrical Arrays: Different number of columns for each row in a multi dim array
		 */
		int a[][] = new int[][]{
								{1,2,3},
								{4,5},
								{6}};
		
		/**
		 * Array of type interface can store either null or objects that implement
		 * the interface type (gives you the ability to store objects references of different types)
		 */
		Serializable[] arrInterFace =  
				{new StringBuilder("From StringBuilder Class"), new String("From String Class"), new Character('C')};
		System.out.println();
		for(int i = 0; i < arrInterFace.length; i++) {
			System.out.print(arrInterFace[i] + "\t");
		}
		
		/**
		 * Array of type abstract class can store either null values or objects of a class that 
		 * extends the abstract class specified
		 */
		System.out.println();
		Number[] arrAbstract = new Number[] {new Integer(7), new Double(18.3), new Long(17944849124l)};
		for(int i = 0; i < arrAbstract.length; i++) {
			System.out.print(arrAbstract[i] + "\t");
		}			
		
		/**
		 * Since Object is extended by all classes an object array can store objects
		 * of any class
		 */
		System.out.println();
		Object obj[] = new Object[]{new chapter4.stringbuilder.StringBuilderTest(), new int[] {1,2},
				new java.util.Date(), new Short((short)2), null, new String("From String Class")};
		for(int i = 0; i < obj.length; i++) {
			System.out.print(obj[i] + "\t");
		}	
		
		//Members of an Array: length (size of array), clone(), inherited methods
	}

}
