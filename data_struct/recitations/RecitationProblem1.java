package recitations;

import java.util.Arrays;

public class RecitationProblem1 {

	public static void main(String[] args) {
		// 9/8/21
		
		int arr[][] = { { 1, 2, 3, 4 }, { 1, 6, 7, 36 }, { 25, 4, 1, 4 } };

		int sum_row[] = new int[arr.length];
		double averageExamScore[] = new double[arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum_row[i] += arr[i][j];
				averageExamScore[j] += arr[i][j];
				System.out.print(arr[i][j] + ", ");
			}
			System.out.println();
		}
		
		for(int i = 0; i < averageExamScore.length; i++) {
			averageExamScore[i] /= arr.length;
		}
		System.out.println(Arrays.toString(sum_row));
		System.out.println(Arrays.toString(averageExamScore));

	}

}
