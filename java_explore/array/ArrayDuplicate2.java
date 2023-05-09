package array;

import java.util.Arrays;

public class ArrayDuplicate2 {

	public static void main(String[] args) {
		//Original Array
		int array[] = {10,20,30,10,21,27,19,10,20};
		
		//Temporary Array
		int arr2[] = new int [array.length];
		
		System.out.println(Arrays.toString(array));
		
		int z = 0;
		String currentElement;
		
		for(int i = 0; i < array.length; i++) {
			currentElement = Integer.toString(array[i]);
			if (!Arrays.toString(arr2).contains(currentElement)) {
				arr2[z++] = array[i];
				
			}
			//System.out.println(Arrays.toString(arr2));
			
		}
		for(int i = 0; i < array.length; i++) {
			if(arr2[i] != 0) {
				System.out.println(arr2[i]);
			}
		}
	}

}
