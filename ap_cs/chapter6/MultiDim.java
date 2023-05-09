package chapter6;

import java.util.Arrays;

public class MultiDim {

	public static void main(String[] args) {
		/*
		 * int arr[][] = {{1,2,3}, {4,9}, {7,3,8}}; for(int row = 0; row < arr.length;
		 * row++) { for(int column = 0; column < arr[row].length; column++) {
		 * System.out.println(arr[row][column]); } }
		 */

		int arr[] = { 6, 3, 1, 7 , 8, 3 };
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		

		System.out.println(Arrays.toString(arr));

	}

}
