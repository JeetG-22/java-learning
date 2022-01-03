package chapter6;

import java.util.ArrayList;

public class LineSegmentList {
	private ArrayList<LineSegment> lineGroup;

	public LineSegmentList() {
		lineGroup = new ArrayList<LineSegment>();
		int length = (int) (Math.random() * 21) + 5;
		for (int i = 0; i < length; i++) {
			lineGroup.add(i, new LineSegment());
		}
	}

	public LineSegment longestLine() {
		LineSegment max = lineGroup.get(0);
		for (int i = 1; i < lineGroup.size(); i++) {
			if (lineGroup.get(i).length() > max.length()) {
				max = lineGroup.get(i);
			}
		}
		return max;
	}

	public LineSegment steepestSlope() {
		LineSegment max = lineGroup.get(0);
		for (int i = 1; i < lineGroup.size(); i++) {
			if (lineGroup.get(i).slope() > max.slope()) {
				max = lineGroup.get(i);
			}
		}
		return max;
	}

	public void sortByLength() {
		LineSegment max;
		int maxI;
		for (int i = 0; i < lineGroup.size() - 1; i++) {
			max = lineGroup.get(i);
			maxI = i;
			for (int j = i + 1; j < lineGroup.size(); j++) {
				if (max.length() < lineGroup.get(j).length()) {
					max = lineGroup.get(j);
					maxI = j;
				}
			}
			if (lineGroup.get(maxI).length() > lineGroup.get(i).length()) {
				LineSegment temp = lineGroup.get(maxI);
				lineGroup.set(maxI, lineGroup.get(i));
				lineGroup.set(i, temp);
			}
		}
	}

	public void sortLine() {
		LineSegment max;
		int maxI;
		for (int i = 0; i < lineGroup.size() - 1; i++) {
			max = lineGroup.get(i);
			maxI = i;
			for (int j = i + 1; j < lineGroup.size(); j++) {
				if (max.length() + max.slope() < lineGroup.get(j).length() + lineGroup.get(j).slope()) {
					max = lineGroup.get(j);
					maxI = j;
				}
			}
			if (lineGroup.get(maxI).length() + lineGroup.get(maxI).slope() > lineGroup.get(i).length()
					+ lineGroup.get(i).slope()) {
				LineSegment temp = lineGroup.get(maxI);
				lineGroup.set(maxI, lineGroup.get(i));
				lineGroup.set(i, temp);
			}
		}
	}

	public String toString() {
		String result = "";
		for (int i = 0; i < lineGroup.size(); i++) {
			result += "Line Segment [" + i + "] = " + lineGroup.get(i) + "\n";
		}
		return result;
	}

}
