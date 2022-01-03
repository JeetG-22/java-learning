package chapter6;

public class LineRunner {

	public static void main(String[] args) {
		LineSegmentList l = new LineSegmentList();
		System.out.println("Original: \n" + l);
		System.out.println("Longest Line: \n" + l.longestLine() + "\n");
		System.out.println("Steepest Slope: \n" + l.steepestSlope() + "\n");
		l.sortLine();
		System.out.println("Sort Line: \n" + l);
		l.sortByLength();
		System.out.println("Sort By Length: \n" + l);
	}

}
