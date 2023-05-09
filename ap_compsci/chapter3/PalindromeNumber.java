package chapter3;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 121;
		int temp = num;
		int count = 0;
		while (temp != 0) {
			temp /= 10;
			count++;
		}
		count--;
		int sum = 0;
		int digit = 0;
		temp = num;
		while (count != -1) {
			digit = temp % 10;
			temp /= 10;
			sum += digit * Math.pow(10, count);
			count--;
		}
		System.out.println("Palindrome: " + (sum == num));
	}

}
