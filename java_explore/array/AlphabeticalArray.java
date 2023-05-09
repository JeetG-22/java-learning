package array;

public class AlphabeticalArray {

	public static void main(String[] args) {
		String arr[] = {"danger","bat", "alpha", "cat", "zed"};
		String newArr[] = new String[arr.length];
		char ch;
		for(ch = ' '; ch<='~'; ch++) {
			for(int i = 0; i<arr.length;i++) {
				if(arr[i].charAt(0) == ch) {
					newArr[i] = arr[i];
					System.out.println(newArr[i]);
					
				}
			}
			
		}


	}

}
