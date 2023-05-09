package chapter6;

public class LineSegment {
	private Point A;
	private Point B;

	public LineSegment() {
		A = new Point((int) (Math.random() * 6) + 5, (int) (Math.random() * 6) + 5);
		B = new Point((int) (Math.random() * 6) + 15, (int) (Math.random() * 6) + 15);
	}

	public double length() {
		double dist = Math.sqrt(Math.pow(B.getY() - A.getY(), 2) + Math.pow(B.getX() - A.getX(), 2));
		return dist;
	}

	/*
	 * This method return the slop of the Line
	 */
	public double slope() {
		return (B.getY() - A.getY()) / (B.getX() - A.getX());
	}

// return Line information
	public String toString() {
		return "Length:" + length() + "\tSlope: " + slope();
	}
}