package array;

public class RemovingElements {

	public static void main(String[] args) {
		int ints[] = new int [20];
		ints[10] = 123;

		int removeIndex = 10;

		for(int i = removeIndex; i < ints.length-1; i++){
		    ints[i] = ints[i + 1];
		    System.out.println(ints[removeIndex]);
		}

	}

}
