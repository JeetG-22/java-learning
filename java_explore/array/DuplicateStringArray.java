package array;

import java.util.Arrays;

public class DuplicateStringArray {

	public static void main(String[] args) {
		String arr[]= {"Dog","Cat","Dog","Rabbit"};
		int i,t;
		
		//Printing Arrays
		System.out.println("Array 1:" + Arrays.toString(arr));
		
		for(i=0;arr.length>i;i++) {
			for(t=i+1;arr.length>t;t++) {
				if(arr[i]==(arr[t]) && i!=t) {
					System.out.println(arr[t]);
					
					
				}
			}
		}

	}

}
