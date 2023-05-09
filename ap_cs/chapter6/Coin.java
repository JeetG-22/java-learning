package chapter6;

public class Coin {
	private double value;
	private boolean face; // True - Heads, False - Tails

	// default coin, sets value =0;
	public Coin() {
		value = 0;
		flip();
	}

	public Coin(double v) {
		value = v;
		flip();
	}

	public double getValue() {
		return value;
	}

	public boolean isHeads() {
		return face;
	}

	public void flip() {
		face = Math.random() < 0.5;
	}

	public String toString() {
		String f = face ? "Heads" : "Tails";
		return "Value: " + value + "\tFace: " + f;
	}
}
