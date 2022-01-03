package review;

public class MaxMinArray {

	public static void main(String[] args) {
		int arr[] = {-25,355,45,3987};
		int max = arr[0];
		int min = arr[0];
		int n = arr.length;
		for(int i = 1; i < n; i++) {
			if(max < arr[i])
				max = arr[i];
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);

	}

}
