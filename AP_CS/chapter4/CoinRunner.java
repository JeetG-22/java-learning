package chapter4;

public class CoinRunner {

	public static void main(String[] args) {
		Coin c = new Coin();
		c.setKey(42);
		c.lock(42);
		c.unlock(41);
		System.out.println(c);
		c.setKey(111);
		c.unlock(111);
		System.out.println(c);

	}

}
