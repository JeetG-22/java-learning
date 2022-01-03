package array;

public class ArrayDuplicate1 {
	public static void main(String[] args) {
		int array[] = {10,20,30,10,21,27,19,10,20};
		//int non_dup[]=new int[array.length];
		int t = 0;
		
		System.out.println("array length = " + array.length);
		for(int i = 0 ; i < array.length ; i++) {
			System.out.println("Index of i " + i + " Val of i = " + array[i]);
		for(t = i + 1 ; t < array.length ; t++) {
			//System.out.println(t);
			//System.out.println(array[t]);
			//System.out.println("index of t "+t + "Val of t " + array[t]);

			if((array [i] == array[t])) {
				System.out.println("Index of i " + i + " val of i = "+ array[i]+ " Index of t "+ t + " Val of t = " + array[t]);
				System.out.println(array[i]);
			}
			
			
			
			}
		}
			
		}

	}



