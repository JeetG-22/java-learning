package array;

import java.util.Arrays;

public class ArrayCommonElements {

	public static void main(String[] args) {
		int arr[] = {1,3,5,6,7,9};
		int arr2[] = {2,5,1,10,9,7};
		int i;
		
		//Printed Arrays
		System.out.println("Array 1:" + Arrays.toString(arr));
		System.out.println("Array 2:" + Arrays.toString(arr2));
		
		for(i=0;i<arr.length;i++) {
			for (int j=0;j<arr2.length;j++) {
				if(arr[i]==arr2[j])
					System.out.println(arr[i]);
			}
				
			
		}

	}

}
