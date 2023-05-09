package chapter5;

public class PairOfDice {
	private Dice d1;
	private Dice d2;

	public PairOfDice() {
		d1 = new Dice();
		d2 = new Dice();
	}

	public PairOfDice(int a, int b) {
		d1 = new Dice(a);
		d2 = new Dice(b);
	}

	public void rollPair() {
		d1.roll();
		d2.roll();
	}

	public boolean isBoxCars() {
		return d1.getFaceValue() == 6 && d2.getFaceValue() == 6;
	}

	public boolean isSE() {
		return (d1.getFaceValue() == 1 && d2.getFaceValue() == 1) || (d1.getFaceValue() == 9 && d2.getFaceValue() == 9);
	}

	public boolean isHSE() {
		return d1.getFaceValue() == 1 || d2.getFaceValue() == 1 || d1.getFaceValue() == 9 || d2.getFaceValue() == 9;
	}

	public int sumRoll() {
		return d1.getFaceValue() + d2.getFaceValue();
	}

	public String toString() {
		return "Roll: " + d1.getFaceValue() + "," + d2.getFaceValue();
	}

}
