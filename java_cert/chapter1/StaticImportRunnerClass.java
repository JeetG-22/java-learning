package chapter1;

import static chapter2.StaticImportTestClass.*;
import java.util.ArrayList;

public class StaticImportRunnerClass {
	public static void main(String[] args) {
		Math.sqrt(4);
		num = 20;
		System.out.println(add(25));
		System.out.println(add(4, 8));
		ArrayList aList = new ArrayList();
		aList.add(7);
		aList.add("Hello");
		aList.add(34.4);
		System.out.println(aList);
	}

}