package chapter6;

/*
 * HW-2D arrays, For this assignment you need to write and test code for
 * each of the following methods. Make sure to test code for each method as
 * you are working through these methods. This will be a graded assessment.
 * Please make sure to email yourself this code as you will be using this
 * code in order to do next set of programs.
 */
public class Arrays2DAssignment {

	// Use this method to keep testing every method as you write them.
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		System.out.println("Row Major Order:");
		initRow(arr, 10, 60);
		output2D(arr);
		System.out.println("Column Major Order: ");
		initColumn(arr, 10, 30);
		output2D(arr);
		System.out.println("Sum Row: ");
		output1D(sumRow(arr));
		System.out.println("Sum Column: ");
		output1D(sumCol(arr));
		System.out.println("Sum of Row or Column");
		System.out.println("Sum of Column 2: " + sumRC(arr, 'C', 2));
		System.out.println("Above 20: " + countElementsAbove(arr, 20));
		System.out.println("Convert 2D to 1D RMO: ");
		output1D(convert2Dto1DRowMajor(arr));
		System.out.println("Convert 2D to 1D CMO: ");
		output1D(convert2Dto1DColumnMajor(arr));
		System.out.println("Convert 2D to 1D Continous Row: ");
		output1D(convert2Dto1DContinousRow(arr));
		System.out.println("Convert 2D to 1D Continous Column: ");
		output1D(convert2Dto1DContinousColumn(arr));
		System.out.println("Index of Min Val");
		output1D(findMinIndex(arr));
		System.out.println("Swap Elements");
		int[] loc1 = { 0, 1 };
		int[] loc2 = { 2, 2 };
		swap(arr, loc1, loc2);
		output2D(arr);
	}

	/*
	 * #1 This method will initialize N in row major order with the integer values
	 * in the range start-end inclusive. Precondition: end is greater than start
	 */
	public static void initRow(int[][] N, int start, int end) {
		for (int row = 0; row < N.length; row++) {
			for (int col = 0; col < N[row].length; col++) {
				N[row][col] = (int) (Math.random() * (end - start + 1)) + start;
			}
		}
	}

	/*
	 * #2 This method will initialize N in column major order with the integer
	 * values in range start-end inclusive. Precondition: end is greater than start
	 */
	public static void initColumn(int[][] N, int start, int end) {
		for (int col = 0; col < N[0].length; col++) {
			for (int row = 0; row < N.length; row++) {
				N[row][col] = (int) (Math.random() * (end - start + 1)) + start;
			}
		}
	}

	/*
	 * #3 Outputs N in row by column format, with all row elements on the same line
	 * separated by tabs.Example 2 4 7 4 7 0
	 */
	public static void output2D(int[][] N) {
		for (int row = 0; row < N.length; row++) {
			for (int col = 0; col < N[row].length; col++) {
				System.out.print(N[row][col] + "\t");
			}
			System.out.println();
		}
	}

	/*
	 * #4 Returns an int array of size N.length. Each element of this array will
	 * represent the sum of all the elements of the corresponding row of the 2D
	 * input array N.
	 */
	public static int[] sumRow(int[][] N) {
		int[] rowSum = new int[N.length];
		int sum = 0;
		for (int row = 0; row < N.length; row++) {
			for (int col = 0; col < N.length; col++) {
				sum += N[row][col];
			}
			rowSum[row] = sum;
			sum = 0;
		}
		return rowSum;
	}

	/*
	 * #5 Returns an int array of size N[0].length. Each element of this array will
	 * represent the sum of all the elements of corresponding column of the 2D input
	 * array N.
	 */
	public static int[] sumCol(int[][] N) {
		int[] colSum = new int[N[0].length];
		int sum = 0;
		for (int col = 0; col < N[0].length; col++) {
			for (int row = 0; row < N.length; row++) {
				sum += N[row][col];
			}
			colSum[col] = sum;
			sum = 0;
		}
		return colSum;
	}

	/*
	 * #6 sumRC will return sum of all of the elements of row or column as
	 * determined by rc, located at the location determined by index.
	 */
	public static int sumRC(int[][] N, char rc, int index) {
		int sum = 0;
		if (rc == 'C') {
			for (int row = 0; row < N.length; row++) {
				sum += N[row][index];
			}
		} else if (rc == 'R') {
			for (int col = 0; col < N[0].length; col++) {
				sum += N[index][col];
			}
		}

		return sum;
	}

	/*
	 * #7 Returns total number of elements in the 2D whose value is above val.
	 */
	public static int countElementsAbove(int[][] N, int val) {
		int count = 0;
		for (int row = 0; row < N.length; row++) {
			for (int col = 0; col < N[row].length; col++) {
				if (val < N[row][col]) {
					count++;
				}
			}
		}
		return count;
	}

	/*
	 * #8 Converts 2D array to 1D, filling one row at a time going from left to
	 * right
	 */
	public static int[] convert2Dto1DRowMajor(int[][] N) {
		int[] nums = new int[N[0].length * N.length];
		int i = 0;
		for (int row = 0; row < N.length; row++) {
			for (int col = 0; col < N[row].length; col++) {
				nums[i] = N[row][col];
				i++;
			}
		}

		return nums; // replace this statement with you own
	}

	/*
	 * #9 Converts 2D array to 1D, filling from one column at a time going from top
	 * to bottom
	 */
	public static int[] convert2Dto1DColumnMajor(int[][] N) {
		int[] nums = new int[N[0].length * N.length];
		int i = 0;
		for (int col = 0; col < N[0].length; col++) {
			for (int row = 0; row < N.length; row++) {
				nums[i] = N[row][col];
				i++;
			}
		}

		return nums; // replace this statement with you own
	}

	/*
	 * #10 Converts 2D array to 1D, filling rows continuously. First going from left
	 * to right, then right to left and then repeating the same pattern over and
	 * over
	 */
	public static int[] convert2Dto1DContinousRow(int[][] N) {
		int[] nums = new int[N[0].length * N.length];
		int i = 0;
		for (int row = 0; row < N.length; row++) {
			if (row % 2 == 0) {
				for (int col = 0; col < N[row].length; col++) {
					nums[i] = N[row][col];
					i++;
				}
			} else {
				for (int col = N[row].length - 1; col >= 0; col--) {
					nums[i] = N[row][col];
					i++;
				}
			}
		}
		return nums; // replace this statement with you own
	}

	/*
	 * #11 Converts 2D array to 1D, filling columns continuously. First going from
	 * top to bottom of the first column, then bottom to top of second column and
	 * then from top to bottom of the 3rd Column
	 */
	public static int[] convert2Dto1DContinousColumn(int[][] N) {
		int[] nums = new int[N[0].length * N.length];
		int i = 0;
		for (int col = 0; col < N[0].length; col++) {
			if (col % 2 == 0) {
				for (int row = 0; row < N.length; row++) {
					nums[i] = N[row][col];
					i++;
				}
			} else {
				for (int row = N.length - 1; row >= 0; row--) {
					nums[i] = N[row][col];
					i++;
				}
			}
		}
		return nums; // replace this statement with you own
	}

	/*
	 * #12 This method receives an 2D int array and returns a 1D array of size 2,
	 * representing the index of the minimum value found in this array.
	 * minI[0]->row, minI[1] -> column.
	 */
	public static int[] findMinIndex(int[][] N) {
		int[] minI = new int[2];
		int rowMin = 0;
		int colMin = 0;
		int min = N[0][0];
		for (int row = 0; row < N.length; row++) {
			for (int col = 0; col < N[row].length; col++) {
				if (N[row][col] < min) {
					min = N[row][col];
					rowMin = row;
					colMin = col;
				}
			}
		}
		minI[0] = rowMin;
		minI[1] = colMin;
		return minI;
	}

	/*
	 * #13 This method swaps the element stored at loc1 with the element stored at
	 * loc2 in N array.
	 */
	public static void swap(int[][] N, int[] loc1, int[] loc2) {
		int temp = N[loc1[0]][loc1[1]];
		N[loc1[0]][loc1[1]] = N[loc2[0]][loc2[1]];
		N[loc2[0]][loc2[1]] = temp;
	}

	public static void output1D(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}
		System.out.println();
	}

}
