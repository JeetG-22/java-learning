package chapter6;

import java.util.Scanner;

public class SortingArrays2 {
	static int arr[] = new int[10];
	static String names[] = { "Tom", "Vivian", "James", "Marcos", "Jacob" };

	public static void main(String[] args) {
		output();

	}

	public static void output() {
		Scanner kbd = new Scanner(System.in);
		int sentinel = 1;
		while (sentinel != 2) {
			names = new String[] { "Tom", "Vivian", "James", "Marcos", "Jacob" };
			// Input for Arr Type
			System.out.println("1. Integer []  2. String []");
			int arrType = kbd.nextInt();

			// Input for the order
			System.out.println("1. Ascending  2. Descending");
			int order = kbd.nextInt();

			// Type of sorting algo being used
			System.out.println("1. Selection Sort  2. Insertion Sort");
			int sort = kbd.nextInt();

			// Conditionals
			if (arrType == 1) {
				initArr();
				System.out.println("Original: ");
				printArr(1);
				if (order == 1) {
					if (sort == 1) {
						selectionSortIntA();
					} else {
						insertionSortIntA();
					}
				} else {
					if (sort == 1) {
						selectionSortIntD();
					} else {
						insertionSortIntD();
					}
				}
				System.out.println("Sorted Array: ");
				printArr(1);
			} else {
				System.out.println("Original: ");
				printArr(2);
				if (order == 1) {
					if (sort == 1) {
						selectionSortStringA();
					} else {
						insertionSortStringA();
					}
				} else {
					if (sort == 1) {
						selectionSortStringD();
					} else {
						insertionSortStringD();
					}
				}
				System.out.println("Sorted Array: ");
				printArr(2);
			}
			System.out.println("1. Continue  2. Quit");
			sentinel = kbd.nextInt();
		}
		kbd.close();
	}

	public static void printArr(int type) {
		System.out.print("[");
		if (type == 1) {
			for (int i = 0; i < arr.length - 1; i++) {
				System.out.print(arr[i] + ", ");
			}
			System.out.print(arr[arr.length - 1] + "]");
		} else if (type == 2) {
			for (int i = 0; i < names.length - 1; i++) {
				System.out.print(names[i] + ", ");
			}
			System.out.print(names[names.length - 1] + "]");
		}
		System.out.println();
	}

	public static void initArr() {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}

	}

	public static void selectionSortIntA() {
		int min, minI;
		for (int i = 0; i < arr.length - 1; i++) {
			min = arr[i];
			minI = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					minI = j;
				}
			}
			if (arr[i] > min) {
				int temp = arr[minI];
				arr[minI] = arr[i];
				arr[i] = temp;
			}
		}
	}

	public static void selectionSortStringA() {
		String min;
		int minI;
		for (int i = 0; i < names.length - 1; i++) {
			min = names[i];
			minI = i;
			for (int j = i + 1; j < names.length; j++) {
				if (names[j].compareTo(min) < 0) {
					min = names[j];
					minI = j;
				}
			}
			if (min.compareTo(names[i]) < 0) {
				String temp = names[minI];
				names[minI] = names[i];
				names[i] = temp;
			}
		}
	}

	public static void selectionSortStringD() {
		String max;
		int maxI;
		for (int i = 0; i < names.length - 1; i++) {
			max = names[i];
			maxI = i;
			for (int j = i + 1; j < names.length; j++) {
				if (names[j].compareTo(max) > 0) {
					max = names[j];
					maxI = j;
				}
			}
			if (max.compareTo(names[i]) > 0) {
				String temp = names[maxI];
				names[maxI] = names[i];
				names[i] = temp;
			}
		}
	}

	public static void selectionSortIntD() {
		int max, maxI;
		for (int i = 0; i < arr.length - 1; i++) {
			max = arr[i];
			maxI = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > max) {
					max = arr[j];
					maxI = j;
				}
			}
			if (arr[i] < max) {
				int temp = arr[maxI];
				arr[maxI] = arr[i];
				arr[i] = temp;
			}
		}
	}

	public static void insertionSortIntA() {
		int key, keyI;
		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			keyI = i - 1;
			while (keyI >= 0 && arr[keyI] > key) {
				arr[keyI + 1] = arr[keyI];
				keyI--;
			}
			arr[keyI + 1] = key;
		}
	}
	
	public static void insertionSortIntD() {
		int key, keyI;
		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			keyI = i - 1;
			while (keyI >= 0 && arr[keyI] < key) {
				arr[keyI + 1] = arr[keyI];
				keyI--;
			}
			arr[keyI + 1] = key;
		}
	}
	
	public static void insertionSortStringD() {
		String key;
		int keyI;
		for (int i = 1; i < names.length; i++) {
			key = names[i];
			keyI = i - 1;
			while (keyI >= 0 && names[keyI].compareTo(key) < 0) {
				names[keyI + 1] = names[keyI];
				keyI--;
			}
			names[keyI + 1] = key;
		}
	}
	
	public static void insertionSortStringA() {
		String key;
		int keyI;
		for (int i = 1; i < names.length; i++) {
			key = names[i];
			keyI = i - 1;
			while (keyI >= 0 && key.compareTo(names[keyI]) < 0) {
				names[keyI + 1] = names[keyI];
				keyI--;
			}
			names[keyI + 1] = key;
		}
	}
	
	

}
