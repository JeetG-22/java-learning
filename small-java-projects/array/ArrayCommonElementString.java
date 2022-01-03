package array;

import java.util.Arrays;

public class ArrayCommonElementString {

	public static void main(String[] args) {
		String arr[]= {"Dog","Cat","Duck","Rabbit"};
		String arr2[]= {"Cat","Moose","Rat","Dog"};
		int i,t;
		
		//Printing Arrays
		System.out.println("Array 1:" + Arrays.toString(arr));
		System.out.println("Array 2:" + Arrays.toString(arr2));
		
		for(i=0;arr.length>i;i++) {
			for(t=0;arr.length>t;t++) {
				if(arr[i]==arr2[t]) {
					System.out.println(arr[i]);
					
				}
			}
		}

	}

}
