package chapter4;

public class Average {

	public static void main(String[] args) {
		System.out.println("Average: " + average(4,3,5));

	}
	public static double average(int x, int y) {
		return (x+y)/2.0;
	}
	public static double average(int x, int y, int z) {
		return(x+y+z)/3.0;
	}

}
