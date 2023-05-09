package chapter5;

import quadrilateral_winter_project.Point3;

public class RectangleRunner {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(new Point3(50,120), new Point3(150,180));
		Rectangle r1 = new Rectangle(new Point3(150,70), new Point3(200,120));
		System.out.println(r.overlap(r1));
		

	}

}
