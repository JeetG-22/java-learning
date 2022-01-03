package chapter5;

import quadrilateral_winter_project.Line;
import quadrilateral_winter_project.Point3;

public class UseLine {

	public static void main(String[] args) {
		// Line constructors (expected output in parentheses)
		
		System.out.println(-2 / - 15);
		Line l2 = new Line(new Point3(2, 3), new Point3(7, 8));// y = x + 1
		Point3 a = new Point3(4,5);
		Point3 b = new Point3(-9,3);
		Line l4 = new Line(a,b);// y = -5/6 + 1.5
		Line l5 = new Line(5, 0, 10);// x = 2
		Line l6 = new Line(new Point3(2, 7), new Point3(2, 9));// x = 2
		// Solution of l5 & l6...

		//System.out.println("L2:" + l2);

		System.out.println("L4:" + l4);
		//System.out.println("L5:" + l5);
		//System.out.println("L6:" + l6);
		//System.out.println("l5 & l6: " + l5.intersection(l6));


	}

}
