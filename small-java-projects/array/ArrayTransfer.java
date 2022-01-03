package array;

import java.util.Arrays;

public class ArrayTransfer {

	public static void main(String[] args) {
		int arr[]= {10,10,10,20,21,27,19,30,20};
		int i,t;
		
		//Printing Arrays
		System.out.println("Array 1:" + Arrays.toString(arr));
		
		for(i=0;arr.length-1>i;i++) {
			for(t=i+1;arr.length>t;t++) {
				if(arr[i]==(arr[t]) && i!=t) {
					System.out.println(arr[t]);
				}
				
			}
		}
					
		}
}
		
		
		

	


