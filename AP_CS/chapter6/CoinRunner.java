package chapter6;

public class CoinRunner {

	public static void main(String[] args) {

		// Init Coin
		Coin[] cc = new Coin[25];
		for (int i = 0; i < cc.length; i++) {
			int n = (int) (Math.random() * 99) + 1;
			cc[i] = new Coin(n / 100.0);
		}
		// Original Array
		CoinCollection myCC = new CoinCollection(cc);
		System.out.println("Original Array:\n" + myCC);
		System.out.println("*************************************************");

		// Method 1 Test
		System.out.println("Sum: " + myCC.totalValue());
		System.out.println("*************************************************");

		// Method 2 Test
		CoinCollection myCC2 = new CoinCollection(myCC.aboveValue(.4));
		System.out.println("Above Value Array:\n" + myCC2);
		System.out.println("*************************************************");

		// Method 3 Test
		myCC.arrangeFromLeastToGreatest();
		System.out.println("Ascending Array:\n" + myCC);
		System.out.println("*************************************************");

		// Method 4 Test
		myCC.remove(4);
		System.out.println("Remove Specified Index:\n" + myCC);
		System.out.println("*************************************************");

		// Method 5 Test
		System.out.println("Find Index: " + myCC.findIndex(.5));
		System.out.println("*************************************************");

		// Method 6 Test
		CoinCollection myCC3 = new CoinCollection(myCC.removeAll(.3));
		System.out.println("Remove All:\n" + myCC3);
		System.out.println("*************************************************");
	}

}
