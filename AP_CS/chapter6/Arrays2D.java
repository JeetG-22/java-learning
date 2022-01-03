package chapter6;

public class Arrays2D {

	public static void main(String[] args) {
		int arr[][] = new int[5][5];
		int count = 0;
		for (int row = 0; row < arr.length; row++) {
			for (int column = 0; column < arr[row].length; column++) {
				arr[row][column] = (int) (Math.random() * 51) + 50;
				if (arr[row][column] > 75)
					count++;

			}
		}
		System.out.println(count);
		initDiag(arr);
		for (int row = 0; row < arr.length; row++) {
			for (int column = 0; column < arr[row].length; column++) {
				System.out.print(arr[row][column] + "\t");
			}
			System.out.println();
		}
		
		
		
		String[][] words = {{"Hi","There","AP", "CS"},
		                   {"students!", "Do","you","understand"},
		                   {"2D", "arrays", "yet?", "^_^"}};
		someMethod(words);
		for(int i = 0; i < words.length; i++) {
			for(int j = 0; j < words[i].length; j++) {
				System.out.print(words[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void initDiag(int arr[][]) {
		for (int row = 0; row < arr.length; row++) {
			int i = arr[row].length - row - 1;
			arr[row][i] = 0;
			for (int column = 0; column < arr[row].length; column++) {
				if (row == column) {
					arr[row][column] = 0;
					break;
				}
			}
		}
	}
	public static void someMethod(String[][] strArr) {
		String[][] result = new String[strArr.length][strArr[0].length];
		for(int row = 0; row < strArr.length; row++) {
			for(int col = 0; col < strArr[0].length; col++) {
				if(strArr[row][col].length() > 3) {
					int len = strArr[row][col].length() / 2;
					result[row][col] = strArr[row][col].substring(len);
				}
				else {
					result[row][col] = strArr[row][col];
				}
			}
		}
		strArr = result;
	}

}
