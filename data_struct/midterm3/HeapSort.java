package midterm3;

import java.util.Arrays;

public class HeapSort {

	/**
	 * This algorithm is inefficent b/c it is not in place which means that it uses a seperate
	 * array (PQ) as storage instead of using the original input array
	 * 
	 * @param mode
	 * 	if the user wants ascending or descending order
	 * 
	 */
	
	public static void heapSort(String[] arr, int mode) { // this algorithm takes 3nlogn time
		PQ<String> storeArr = new PQ<String>(arr.length, mode);
		for (int i = 0; i < arr.length; i++) { // loop takes n time b/c it runs through each element
			storeArr.insert(arr[i]); // insert() takes log(n) time
		} // total time for loop and insert() is nlogn time

		for (int i = arr.length - 1; i >= 0; i--) { // loop takes n times b/c it runs through each element
			arr[i] = storeArr.delete(); // delete() takes 2logn time
		} // total time for loop and delete() is 2nlogn time
	}

	public static void heapSort() { 
		
	}
	public static void main(String[] args) {
		String[] arr = { "Cat", "Dog", "Peach", "Apple", "Banana" };
		heapSort(arr, 2); 
		System.out.println(Arrays.toString(arr));

	}

}
