package chapter4.equalsMethod;

public class Cube {
	private int sides;
	
	public Cube() {
		sides = 6;
	}
	
	public Cube(int sides) {
		this.sides = sides;
	}
	
	public void setSides(int sides) {
		this.sides = sides;
	}
	
	public int getSides() {
		return sides;
	}
	
//	public boolean equals(Cube c) {
//		return sides == c.getSides();
//	}
	public boolean equals(Object obj) {
		if(obj instanceof Cube) {
			if(this == (Cube) obj) {
				return true;
			} else if(((Cube)obj).getSides() == sides) {
				return true;
			}
		}
		return false;
	}

}
