package array;

public class LowestHighest {

	public static void main(String[] args) {
		int arr[]= {4,3,6,8};
		int count = arr.length-1;
		for(int i=0;i<arr.length;i=i*1) {
			if(arr[i]==arr[count] && arr[count]==arr[0]) {
				i++;
			}else {
			System.out.println(Math.max(arr[count],arr[i]));
			count--;
			}
		}



	}

}
