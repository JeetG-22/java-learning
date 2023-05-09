package chapter6;

import java.util.Scanner;
public class Arrays2DHw4 {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int[][] arr = new int[5][5];
		int i = 1;
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (row == col) {
					arr[row][col] = i;
					i++;
				} else {
					arr[row][col] = 0;
				}
			}
		}
		System.out.println("To determine the mileage between cities," + 
		" enter the numbers of two cities from the following list:\n" + 
		"1:Albany\t4:NY\n2:Boston\t5:Phila\n3:Hartford");
		System.out.println("Enter your city numbers: ");
		int city1 = kbd.nextInt();
		int city2 = kbd.nextInt();
		System.out.println("Distance: " + arr[city1-1][city2-1]);
		
		//output(arr);
		
		
//		int dist [] = new int[arr[0].length * arr.length];
//		int j = 0;
//		for(int row = 0; row < arr.length; row++) {
//			for(int col = 0; col < arr[row].length; col++) {
//				dist[j] = arr[row][col];
//				j++;
//			}
//		}
		
//		for(int k = 0; k < dist.length; k++) {
//			System.out.print(dist[k] + "\t");
//		}
//		arr[2][0] = 5;
//		int [] [] mat = {{5, 6, 3, 6},
//                {0, 4, 6, 6},
//                {1, 0, 8, 5},
//                {0, 1, 0, 6}};
//		output(arr);
//		System.out.println(isUpper(mat));
		

	}
	public static boolean isUpper(int [][] arr) {
		for(int col = 0; col < arr[0].length - 1; col++) {
			for(int row = col + 1; row < arr.length; row++) {
				if(arr[row][col] != 0) {
					return false;
				}
			}
		}
		return true;
	}
	public static void output(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + "\t");
			}
			System.out.println();
		}
	}

}
