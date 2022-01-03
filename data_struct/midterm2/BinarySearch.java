package midterm2;

import java.util.Arrays;

public class BinarySearch {

	public static int binarySearchIterative(int[] arr, int key) {
		int min = 0;
		int max = arr.length - 1;
		int mid = (max + min) / 2;
		while(key == arr[mid] || max > min) {
			if(arr[mid] == key) {
				return mid;
			} else if(arr[mid] > key) {
				max = mid - 1;
			} else {
				min = mid + 1;
			}
			mid = (max + min) / 2;
		}
		return -1;
	}
	
	
	
	public static int binarySearchRecursiveString(String[] arr, String key) {
		return binarySearchRecursiveString(arr, key, 0, arr.length);
	}
	
	public static int binarySearchRecursiveString(String[] arr, String key, int lo, int hi) {
		if(hi <= lo) return -1;
		int mid = lo + (hi - lo)/2;
		int cmp = arr[mid].compareTo(key);
		if(cmp > 0) {
			return binarySearchRecursiveString(arr, key, lo, mid);
		} else if(cmp < 0) {
			return binarySearchRecursiveString(arr, key, mid + 1, hi);
		} else {
			return mid;
		}
	}
	
	public static void main(String[] args) {
		
		//Iterative solution for binary search on int arrays
		int[] arr = {1,6,-22,78,25,26};
		Arrays.sort(arr);
		System.out.println(binarySearchIterative(arr, -22));
		
		//Recursive solution for binary serach on String arrays
		String[] arr2 = {"Apple", "Banana", "Cat","Dog", "Elf"};
		System.out.println(binarySearchRecursiveString(arr2, "Cat"));
		
		System.out.println("oscar".compareTo("peggy"));

	}

}
