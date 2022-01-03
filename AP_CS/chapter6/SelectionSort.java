package chapter6;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = new int[15];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}

		// Original Array
		System.out.print("Original Array: ");
		arrOutput(arr);

		// Ascending Array
		selectionSortA(arr, 0);
		System.out.print("Ascending Array: ");
		arrOutput(arr);

		// Descending Array
		selectionSortD(arr, 0);
		System.out.print("Descending Array: ");
		arrOutput(arr);

		// Ascending String Sorting
		String words[] = { "C", "D", "A", "F", "B" };
		System.out.print("Original String Array: ");
		arrOutput(words);

		sortString(words);
		System.out.print("Sorted String Array: ");
		arrOutput(words);

	}

	public static void arrOutput(String words[]) {
		System.out.print("[");
		for (int i = 0; i < words.length - 1; i++) {
			System.out.print(words[i] + ",");
		}
		System.out.print(words[words.length-1] + "]\n");
	}

	public static void arrOutput(int arr[]) {
		System.out.print("[");
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.print(arr[arr.length-1] + "]\n");
	}

	public static void swap(int arr[], int sIndex, int fIndex) {
		int temp = arr[sIndex];
		arr[sIndex] = arr[fIndex];
		arr[fIndex] = temp;
	}

	public static int findMinIndex(int arr[], int startIndex) {
		int min = arr[startIndex];
		int minI = startIndex;
		for (int i = startIndex; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
				minI = i;
			}
		}
		return minI;
	}

	public static int findMaxIndex(int arr[], int startIndex) {
		int max = arr[startIndex];
		int maxI = startIndex;
		for (int i = startIndex; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				maxI = i;
			}
		}
		return maxI;
	}

	public static void swapMax(int arr[], int startIndex) {
		swap(arr, startIndex, findMaxIndex(arr, startIndex));
	}

	public static void swapMin(int arr[], int startIndex) {
		swap(arr, startIndex, findMinIndex(arr, startIndex));
	}

	public static void selectionSortA(int arr[], int startIndex) {
		for (int i = startIndex; i < arr.length - 1; i++) {
			swapMin(arr, i);
		}
	}

	public static void selectionSortD(int arr[], int startIndex) {
		for (int i = startIndex; i < arr.length - 1; i++) {
			swapMax(arr, i);
		}
	}

	public static void sortString(String words[]) {
		String min;
		int minI;
		for (int i = 0; i < words.length - 1; i++) {
			min = words[i];
			minI = i;
			for (int j = i + 1; j < words.length; j++) {
				if (words[j].compareTo(min) < 0) {
					min = words[j];
					minI = j;
				}
			}
			if (min.compareTo(words[i]) < 0) {
				String temp = words[minI];
				words[minI] = words[i];
				words[i] = temp;
			}
		}
	}

}
