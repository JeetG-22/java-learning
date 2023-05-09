package chapter6;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int key, keyI;
		int[] arr = { 41, 22, 12, 14, 87, 33 };
		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			keyI = i - 1;
			while (keyI >= 0 && arr[keyI] > key) {
				arr[keyI + 1] = arr[keyI];
				keyI--;
			}
			arr[keyI + 1] = key;
		}

		int start = 0;
		int end = arr.length - 1;
		int mid = (start + end) / 2;
		int val = 1;
		while (arr[mid] != val && start < end) {
			if (arr[mid] > val) {
				end = mid - 1;
			} else if (arr[mid] < val) {
				start = mid + 1;
			}
			mid = (start + end) / 2;
		}
		if(arr[mid] == val) {
			System.out.println(mid);
		}
		else {
			System.out.println(-1);
		}
		/*
		 * int minI; int min; for (int i = 0; i < arr.length - 1; i++) { min = arr[i];
		 * minI = i; for (int j = i + 1; j < arr.length; j++) { if (arr[j] < min) { min
		 * = arr[j]; minI = j; } } int temp = arr[minI]; arr[minI] = arr[i]; arr[i] =
		 * temp; }
		 */
		System.out.println(Arrays.toString(arr));

	}

}
