package chapter6;

public class ArrHw3 {

	public static void main(String[] args) {
		
		int arr[] = new int[100];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
			System.out.print(arr[i] + "\t");
			if((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
		
		//Init String Array
		String hist[] = new String[10];
		hist[0] = "1 - 10 / ";
		for(int i = 1; i < hist.length; i++) {
			hist[i] = i + "1 - " + (i + 1) + "0 / ";
		}
		int range = 0;
		
		//Creating hist based off range
		for(int i = 0; i < arr.length; i++) {
			range = (arr[i] - 1) / 10;
			hist[range] += "*";  
		}
		
		//Print
		for(int i = 0; i < hist.length; i++) {
			System.out.println(hist[i]);
		}

	}

}
