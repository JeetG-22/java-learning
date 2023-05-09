package string;

public class CreditCard {

	public static void main(String[] args) {
		String ccNumber = "4171 5647 2587 8554";
		System.out.println(ccNumber.length());
		System.out.println(ccNumber.charAt(ccNumber.length()- 5));
		String last4 = ccNumber.substring(ccNumber.length()-4);
		System.out.println(last4);
		String last5 = ccNumber.substring(ccNumber.length()-6,ccNumber.length()-5) + ccNumber.substring(ccNumber.length()-4);
		System.out.println(last5);
		System.out.println(ccNumber.substring(ccNumber.lastIndexOf(" ")+1));

	}

}
