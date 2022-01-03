package chapter6;

public class ArrHw1 {

	public static void main(String[] args) {
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}
		
		//Output of Methods
		output(arr);
		System.out.println();
		System.out.println("Average: " + average(arr));
		System.out.println("Min: " + min(arr));
		System.out.println("Max: " + max(arr));
		System.out.println();
		System.out.println("Swap (4,8): ");
		output(swap(arr, 4,8));
		System.out.println();
		System.out.println("Max First Min Last Method: ");
		output(maxFirstMinLast(arr));
		System.out.println("Even Count: " + countEvens(arr));
		System.out.println("Odd Count: " + countOdds(arr));	

	}


	public static void output(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}

	public static double average(int arr[]){
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			sum += arr[i];
		}
		return sum / arr.length;
	}
	
	public static int min(int arr[]){
		int min = arr[0];
		for(int i = 1; i < arr.length; i++){
			if(min > arr[i]){
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int max(int arr[]){
		int max = arr[0];
		for(int i = 1; i < arr.length; i++){
			if(max < arr[i]){
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int[] swap(int arr[], int fIndex, int sIndex){
		int temp = arr[fIndex];
		arr[fIndex] = arr[sIndex];
		arr[sIndex] = temp;
		return arr;
	}
	
	public static int[] maxFirstMinLast(int arr[]){
		int max = arr[0];
		int min = arr[0];
		int maxIndex = 0;
		int minIndex = 0;
		
		for(int i = 1; i < arr.length; i++){
			if(max < arr[i]){
				max = arr[i];
				maxIndex = i;
			}
			if(min > arr[i]) {
				min = arr[i];
				minIndex = i;
			}
		}
		
		//Swapping max with arr[0]
		int temp = arr[0];
		arr[0] = arr[maxIndex];
		arr[maxIndex] = temp;
		
		//Swapping min with arr[9]
		temp = arr[9];
		arr[9] = arr[minIndex];
		arr[minIndex] = temp;
		
		return arr;
		
	}
	
	public static int countEvens(int arr[]){
		int evens = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] % 2 == 0){
				evens++;
			}
		}
		return evens;
	}
	
	public static int countOdds(int arr[]){
		int odds = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] % 2 != 0){
				odds++;
			}
		}
		return odds;
	}
			
	
}


