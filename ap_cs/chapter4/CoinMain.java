package chapter4;

public class CoinMain {

	public static void main(String[] args) {
		Coin c = new Coin();
		Coin c2 = new Coin();
		int count = 0, count2 = 0;
		while(count != 3 && count2 != 3) {
			System.out.println(count + "/" + count2);
			System.out.println(c + "/" + c2);
			if(c.isHeads()==true) {
				count++;
			}
			else {
				count = 0;
			}
			if(c2.isHeads()==true) {
				count2++;
			}
			else {
				count2 = 0;
			}
		}
		if(count<count2) {
			System.out.println("Coin 2 wins!");
		}
		else if(count > count2) {
			System.out.println("Count 1 Wins!");
		}
		else {
			System.out.println("Tie!");
		}
		
		
		

	}

}
