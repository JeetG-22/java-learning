package chapter2.section3;

public class Primtive_ReferenceVariableTest {

	public static void main(String[] args) {
		Cube c = new Cube();
		System.out.println(c);

		// Illustrates how aliases work in Java
		Cube c2 = c;
		c2.setSides(10);
		System.out.println(c.getSides());

		/* == operator checks to see if the two reference variables refer to the same
		 * object in memory
		 */ 
	
		System.out.println(c == c2);

		/* == operator from primitive variables checks to see if the literal values are
		 * the same
		 */
		
		int a = 25;
		int b = 25;
		System.out.println(a == b);
	}
}

class Cube {
	private int sides;
	public Cube() {
		sides = 6;
	}
	public void setSides(int sides) {
		this.sides = sides;
	}
	public int getSides() {
		return sides;
	}
}
