package chapter6;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 1, 24, 46, 77, 94, 112, 144, 180 };
		int start = 0;
		int end = arr.length - 1;
		int mid = (start + end) / 2;
		int key = 46;
		while (key != arr[mid] && start < end) {
			if (arr[mid] > key) {
				end = mid - 1;
			} else if (arr[mid] < key) {
				start = mid + 1;
			}
			mid = (start + end) / 2;
		}
		if (key == arr[mid]) {
			System.out.println(mid);
		} else {
			System.out.println("-1");
		}
	}

}
