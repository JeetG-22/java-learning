package chapter6;

public class LineSegmentCollection {
	private LineSegment[] lineGroup;

	public LineSegmentCollection() {
		lineGroup = new LineSegment[(int) (Math.random() * 21) + 5];
		for (int i = 0; i < lineGroup.length; i++) {
			lineGroup[i] = new LineSegment();
		}
	}

	public LineSegment longestLine() {
		LineSegment max = lineGroup[0];
		for (int i = 1; i < lineGroup.length; i++) {
			if (lineGroup[i].length() > max.length()) {
				max = lineGroup[i];
			}
		}
		return max;
	}

	public LineSegment steepestSlope() {
		LineSegment max = lineGroup[0];
		for (int i = 1; i < lineGroup.length; i++) {
			if (lineGroup[i].slope() > max.slope()) {
				max = lineGroup[i];
			}
		}
		return max;
	}

	public void sortByLength() {
		LineSegment max;
		int maxI;
		for (int i = 0; i < lineGroup.length - 1; i++) {
			max = lineGroup[i];
			maxI = i;
			for (int j = i + 1; j < lineGroup.length; j++) {
				if (max.length() < lineGroup[j].length()) {
					max = lineGroup[j];
					maxI = j;
				}
			}
			if (lineGroup[maxI].length() > lineGroup[i].length()) {
				LineSegment temp = lineGroup[maxI];
				lineGroup[maxI] = lineGroup[i];
				lineGroup[i] = temp;
			}
		}
	}

	public void sortLine() {
		LineSegment max;
		int maxI;
		for (int i = 0; i < lineGroup.length - 1; i++) {
			max = lineGroup[i];
			maxI = i;
			for (int j = i + 1; j < lineGroup.length; j++) {
				if (max.length() + max.slope() < lineGroup[j].length() + lineGroup[j].slope()) {
					max = lineGroup[j];
					maxI = j;
				}
			}
			if (lineGroup[maxI].length() + lineGroup[maxI].slope() > lineGroup[i].length() + lineGroup[i].slope()) {
				LineSegment temp = lineGroup[maxI];
				lineGroup[maxI] = lineGroup[i];
				lineGroup[i] = temp;
			}
		}
	}

	public String toString() {
		String result = "";
		for (int i = 0; i < lineGroup.length; i++) {
			result += "Line Segment [" + i + "] = " + lineGroup[i] + "\n";
		}
		return result;
	}

}
