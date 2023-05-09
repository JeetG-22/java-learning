package chapter6;

public class CoinCollection {
	private Coin[] coins;
	private int coinCount;

	// default size of coins is 20
	public CoinCollection() {
		coins = new Coin[20];
		coinCount = 0;
	}

	// this constructor will accept an array of coins and
	// will use this to fill the coins array.
	public CoinCollection(Coin[] coinArr) {
		coins = new Coin[20];
		coinCount = 0;
		for (int i = 0; i < coinArr.length; i++) {
			addCoin(coinArr[i]);
		}
	}

	public void addCoin(Coin c) {
		if (coins.length > coinCount) {
			// If you init a new Coin instead of by reference, doesn't it change the flip
			// val?
			coins[coinCount] = new Coin(c.getValue());
			coinCount++;
		} else {
			doubleCoinsSize();
			coins[coinCount] = new Coin(c.getValue());
			coinCount++;
		}
	}

	public void doubleCoinsSize() {
		int newSize = coinCount * 2;
		Coin[] tempCoins = new Coin[newSize];

		for (int i = 0; i < coinCount; i++) {
			tempCoins[i] = coins[i]; // copy each coin from coins into tempCoins
		}
		coins = tempCoins;
	}

	// 1.
	// This method will return the total value of all the coins stored in coins.
	public double totalValue() {
		double sum = 0;
		for (int i = 0; i < coinCount; i++) {
			sum += coins[i].getValue();
		}
		return sum;
	}

	// 2.
	// This method will return an array of coins whose value is above
	// the given value v.
	public Coin[] aboveValue(double v) {
		int count = 0;
		// This loop figures out how many are above the v value to eliminate storing
		// null vals
		for (int i = 0; i < coinCount; i++) {
			if (coins[i].getValue() > v) {
				count++;
			}
		}
		Coin[] coinArr = new Coin[count];
		for (int i = 0, j = 0; i < coinCount && j < count; i++) {
			if (coins[i].getValue() > v) {
				coinArr[j] = coins[i];
				j++;
			}
		}
		return coinArr;
	}

	// 3.
	// This method will arrange the coins, in coins array based upon the
	// value of the coin. After the execution of this method, coin will the
	// smallest value will be at the first index, coin with the greatest value will
	// be at
	// the bottom of the array, and all the coins in the middle will be arranged
	// from top to bottom based upon their value.
	public void arrangeFromLeastToGreatest() {
		double min;
		int minI;
		for (int i = 0; i < coinCount - 1; i++) {
			min = coins[i].getValue();
			minI = i;
			for (int j = i + 1; j < coinCount; j++) {
				if (min > coins[j].getValue()) {
					min = coins[j].getValue();
					minI = j;
				}
				if (min < coins[i].getValue()) {
					Coin temp = coins[minI];
					coins[minI] = coins[i];
					coins[i] = temp;
				}
			}
		}

	}

	// 4.
	// This method removes the coin at the given index and moves all the coins
	// below it up by one index. This method also returns the coin it removes
	public Coin remove(int index) {
		Coin temp = coins[index];
		coins[index] = null;
		for (int i = index; coins[i + 1] != null; i++) {
			coins[i] = coins[i + 1];
		}
		coins[coinCount] = null;
		coinCount--;
		return temp;

	}

	// 5.
	// This method will return the first index closest to 0, of the coin that
	// has value v. If none of the coins in the collection have value v, this
	// function
	// will return -1.
	public int findIndex(double v) {
		for (int i = 0; i < coinCount; i++) {
			if (Math.abs(coins[i].getValue() - v) < .0001) {
				return i;
			}
		}
		return -1;
	}

	// 6.
	// This method removes all of the coins that have the value val, and resizes
	// coins array
	// appropriately.This method should also update the value of the coinCoint
	// variable.
	public Coin[] removeAll(double val) {
		for (int i = 0; i < coinCount; i++) {
			if (findIndex(val) == -1) {
				break;
			} else {
				remove(findIndex(val));
			}
		}
		Coin[] temp = new Coin[coinCount];
		for(int i = 0; i < coinCount; i++) {
			temp[i] = coins[i];
		}
		coins = temp;
		return coins;
	}

	public String toString() {
		String result = "";
		for (int i = 0; i < coinCount; i++) {
			result += "Coins[" + i + "]: " + coins[i].toString() + "\n";
		}
		return result;
	}

}
