package chapter5;

public class Point2 {
	private double x,y;
	
	public Point2(){ // (0,0)
		x = 0;
		y = 0;
	}
	public Point2(double a, double b) { // (a,b)
		x = a;
		y = b;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double changeX(double xVel) {
		return x += xVel;
	}
	public double changeY(double yVel) {
		return y += yVel;
	}
	public double distance(Point2 p) {
		double diffXSq = Math.pow(p.getX()-x, 2);
		double diffYSq = Math.pow(p.getY()-y, 2);
		double dist = Math.sqrt(diffXSq + diffYSq);
		return dist;
	}
	public boolean equals(Point2 p) {
		return Math.abs(p.getX() - x) < .001 && Math.abs(p.getY() - y) < .001;
	}
	public String toString() {
		return "Point: (" + x + " , " + y + ")";
	}
	
}
