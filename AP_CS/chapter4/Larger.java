package chapter4;

public class Larger {

	public static void main(String[] args) {
		System.out.println(larger(4.0,3.0));

	}
	public static boolean larger(double x, double y) {
		if(x>y){
			return true;
		}
		return false;
	}

}
