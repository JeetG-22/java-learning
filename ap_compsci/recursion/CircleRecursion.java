package recursion;

public class CircleRecursion {

	public static void main(String[] args) {
		sumNumbers("aa11b33");
	}

	public static int sumNumbers(String str) {
		int total = 0;
		String num = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				num += str.substring(i, i + 1);
			} else if (num.length() != 0) {
				System.out.println(num);
				total += Integer.parseInt(num);
				num = "";
			}
		}
		return total;
	}

}
