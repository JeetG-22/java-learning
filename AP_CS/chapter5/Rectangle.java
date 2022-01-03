package chapter5;

import quadrilateral_winter_project.Point3;

public class Rectangle {
	Point3 TL, BR;

	public Rectangle() {
		TL = new Point3((int) (Math.random() * 391), (int) (Math.random() * 391));
		int randX = (int) (Math.random() * (400 - TL.getX()) + TL.getX() + 1);
		int randY = (int) (Math.random() * (400 - TL.getY()) + TL.getY() + 1);
		BR = new Point3(randX, randY);
	}

	public Rectangle(Point3 A, Point3 B) {
		TL = new Point3(A.getX(), A.getY());
		BR = new Point3(B.getX(), B.getY());
	}

	public Rectangle(Rectangle r) {
		TL = new Point3(r.getTL().getX(), r.getTL().getY());
		BR = new Point3(r.getBR().getX(), r.getBR().getY());
	}

	public Rectangle enclose(Rectangle r) {
		double eTLX, eTLY, eBRX, eBRY;

		// Finding the greatest X coord for BR
		if (BR.getX() >= r.getBR().getX()) {
			eBRX = BR.getX();
		} else {
			eBRX = r.getBR().getX();
		}

		// Find the greatest Y Coord for BR
		if (BR.getY() >= r.getBR().getY()) {
			eBRY = BR.getY();
		} else {
			eBRY = r.getBR().getY();
		}

		// Finding the smallest X Coord for TL
		if (TL.getX() <= r.getTL().getX()) {
			eTLX = TL.getX();
		} else {
			eTLX = r.getTL().getX();
		}

		// Finding the smallest Y coord for TL
		if (TL.getY() <= r.getTL().getY()) {
			eTLY = TL.getY();
		} else {
			eTLY = r.getTL().getY();
		}
		return new Rectangle(new Point3(eTLX, eTLY), new Point3(eBRX, eBRY));
	}

	public boolean overlap(Rectangle r) {
		final double MINX = TL.getX(), MAXX = BR.getX();
		final double MINY = TL.getY(), MAXY = BR.getY();
		boolean tLXCheck = MINX < r.getTL().getX() && MAXX > r.getTL().getX();
		boolean tLYCheck = MINY < r.getTL().getY() && MAXY > r.getTL().getY();
		boolean bRXCheck = MINX < r.getBR().getX() && MAXX > r.getBR().getX();
		boolean bRYCheck = MINY < r.getBR().getY() && MAXY > r.getBR().getY();
		if ((tLXCheck || bRXCheck) && (tLYCheck || bRYCheck)) {
			//Checks if the corners of the rect are inside the other
			return true;
		} else if((tLXCheck || bRXCheck) && r.getBR().getY() >= BR.getY()) {
			return true;
		} else if((tLYCheck || bRYCheck) && r.getBR().getX() >= BR.getX()) {
			//The two else ifs check if the two rectangles overlap without one corner being inside the other
			return true;
		} else if(r.getTL().getX() <= TL.getX() && BR.getX() <= r.getBR().getX()) {
			if(r.getTL().getY() <= TL.getY() && BR.getY() <= r.getBR().getY()) {
				//Check for if one rectangle encases the other
				return true;
			}
		}
		return false;
	}

	public double width() {
		return BR.getX() - TL.getX();
	}

	public double length() {
		return BR.getY() - TL.getY();
	}

	public Point3 getBR() {
		return BR;
	}

	public Point3 getTL() {
		return TL;
	}

	public String toString() {
		return "TL: " + TL + " , BR: " + BR;
	}

}
