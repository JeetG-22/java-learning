package array;

public class AlphaArray2 {

	public static void main(String[] args) {
		String arr[] = {"danger","bat", "alpha", "cat", "zed"};
		String newArr[] = new String[arr.length];
		char ch;
		String temp = "";
			for(int i = 0; i<arr.length; i++) {
				for(int j = i+1; j<arr.length; j++) {
					if(arr[i].codePointAt(0) > arr[j].codePointAt(0)) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					}
					newArr[j]=temp;
					System.out.println(newArr[j]);
				}
			}
		

	}

}

 /*for(int j = 0; j<arr[i].length(); j++) {
	arr[i].codePointAt(j);
} */

/*if(arr[i].codePointAt(0) > arr[i+1].codePointAt(0)) {
	System.out.println(arr[i]);
}*/