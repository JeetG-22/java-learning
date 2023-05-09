package random;

import java.util.Scanner;
import java.util.ArrayList;

public class TanyaStairWay {

	static ArrayList<Integer> aList;

	public static void main(String[] args) {
		System.out.println("/* This is a commnet */ Billy");
		Scanner kbd = new Scanner(System.in);
		int totalNums = kbd.nextInt();
		String input = kbd.nextLine();
		aList = new ArrayList<Integer>();
		for (String num : kbd.nextLine().split(" ")) {
			aList.add(Integer.parseInt(num));
		}
		System.out.println(numStairways());
		System.out.println(numSteps());
		kbd.close();

	}

	public static int numStairways() {
		int count = 0;
		for (int i = 0; i < aList.size(); i++) {
			if (aList.get(i) == 1) {
				count++;
			}
		}
		return count;
	}

	public static String numSteps() {
		String output = "";
		for (int i = 0; i < aList.size() - 1; i++) {
			if (aList.get(i) == 1) {
				if (aList.get(i + 1) == 1) {
					output += "1 ";
				} else {
					int j = i + 1;
					boolean endOfList = false;
					while (aList.get(j) != 1) {
						if (aList.size() - 1 == j) {
							endOfList = true;
							break;
						}
						j++;
					}
					if (endOfList) {
						output += aList.get(j) + " ";
					} else {
						output += aList.get(j - 1) + " ";
					}
				}
			}
		}
		if (aList.get(aList.size() - 1) == 1) {
			output += "1 ";
		}
		return output;
	}

}
