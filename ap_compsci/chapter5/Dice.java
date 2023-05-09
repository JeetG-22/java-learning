package chapter5;

public class Dice {
	private int numSides;
	private int faceValue;

	public Dice() {
		numSides = 6;
		roll();
	}

	public Dice(int n) {
		numSides = n;
		roll();
	}

	public void roll() {
		faceValue = (int) (Math.random() * numSides) + 1;
	}

	public int getNumSides() {
		return numSides;
	}

	public int getFaceValue() {
		return faceValue;
	}

	public boolean equals(Dice d) {
		return this.getFaceValue() == d.getFaceValue() && this.getNumSides() == d.getNumSides();
	}

	public int sum(Dice d) {
		return this.getFaceValue() + d.getFaceValue();
	}

	public int sum(Dice d2, Dice d3, Dice d4, Dice d5) {
		return this.getFaceValue() + d2.getFaceValue() + d3.getFaceValue() + d4.getFaceValue() + d5.getFaceValue();
	}

	public String toString() {
		return "Number of Sides: " + numSides + "\tFace Value: " + faceValue;
	}
}
