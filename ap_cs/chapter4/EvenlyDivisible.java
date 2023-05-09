package chapter4;

public class EvenlyDivisible {

	public static void main(String[] args) {
		System.out.println(evenlyDivisible(4,0));

	}
	public static boolean evenlyDivisible(int x, int y) {
		if(x==0 || y==0) {
			return false;
		}
		else if(x%y==0) {
			return true;
		}
		return false;
	}

}
