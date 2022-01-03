package chapter5;

import java.text.DecimalFormat;
import java.util.Scanner;

import quadrilateral_winter_project.Line;
import quadrilateral_winter_project.Point3;

public class SystemOfEquations {

	public static Scanner kbd = new Scanner(System.in);
	public static DecimalFormat df = new DecimalFormat("#.##");
	public static Line l1, l2;

	public static void main(String[] args) {
		int n = 1;
		int sentinel = 1;
		int userInput;
		while (sentinel != 0) {
			n = 1;
			System.out.println("Please Enter First Line ");
			menu();
			userInput = kbd.nextInt();
			flowControl(userInput, n);
			System.out.println();
			System.out.println("Please Enter Second Line ");
			n++;
			menu();
			userInput = kbd.nextInt();
			flowControl(userInput, n);
			solution();
			System.out.println("_________________________________");
			System.out.println("1. Enter Another Set of Equations");
			System.out.println("0. Quit");
			sentinel = kbd.nextInt();
		}

	}

	public static void menu() {
		System.out.println("1. Slope and Y-intercept ");
		System.out.println("2. 2 Points ");
		System.out.println("3. Point and Slope ");
		System.out.println("4. Coefficients A, B and C, Standard Form Ax+By=C ");
	}

	public static void flowControl(int userInput, int n) {
		switch (userInput) {
		case 1:
			slopeIntercept(n);
			break;
		case 2:
			twoPoints(n);
			break;
		case 3:
			pointSlope(n);
			break;
		case 4:
			standardForm(n);
			break;
		}
	}

	public static void slopeIntercept(int n) {
		System.out.print("Please Enter Slope: ");
		double slope = kbd.nextDouble();
		System.out.print("Please Enter Y-Intercept: ");
		double yInt = kbd.nextDouble();
		if (n == 1) {
			l1 = new Line(slope, yInt);
			System.out.println("Equation " + n + ": " + l1);
		} else {
			l2 = new Line(slope, yInt);
			System.out.println("Equation " + n + ": " + l2);
		}
	}

	public static void twoPoints(int n) {
		System.out.print("x1: ");
		double x1 = kbd.nextDouble();
		System.out.print("y1: ");
		double y1 = kbd.nextDouble();
		System.out.print("x2: ");
		double x2 = kbd.nextDouble();
		System.out.print("y2: ");
		double y2 = kbd.nextDouble();
		Point3 a = new Point3(x1, y1);
		Point3 b = new Point3(x2, y2);
		if (n == 1) {
			l1 = new Line(a, b);
			System.out.println("Equation " + n + ": " + l1);
		} else {
			l2 = new Line(a, b);
			System.out.println("Equation " + n + ": " + l2);
		}
	}

	public static void pointSlope(int n) {
		System.out.print("x1: ");
		double x1 = kbd.nextDouble();
		System.out.print("y1: ");
		double y1 = kbd.nextDouble();
		System.out.print("Please Enter Slope: ");
		double slope = kbd.nextDouble();
		Point3 a = new Point3(x1, y1);
		if (n == 1) {
			l1 = new Line(a, slope);
			System.out.println("Equation " + n + ": " + l1);
		} else {
			l2 = new Line(a, slope);
			System.out.println("Equation " + n + ": " + l2);
		}
	}

	public static void standardForm(int n) {
		System.out.print("A: ");
		int a = kbd.nextInt();
		System.out.print("B: ");
		int b = kbd.nextInt();
		System.out.print("C: ");
		int c = kbd.nextInt();
		if (n == 1) {
			l1 = new Line(a, b, c);
			System.out.println("Equation " + n + ": " + l1);
		} else {
			l2 = new Line(a, b, c);
			System.out.println("Equation " + n + ": " + l2);
		}
	}

	public static void prtSol(double x, double y) {
		System.out.println("Solution is: (" + df.format(x) + "," + df.format(y) + ")");
	}

	public static void solution() {
		if (l1.isParallel(l2)
				&& (l1.getYintercept() != l2.getYintercept() || l1.getXintercept() != l2.getXintercept())) {
			System.out.println("Solution is: No Solutions.");
		} else if (l1.isParallel(l2)
				&& (l1.getYintercept() == l2.getYintercept() || l1.getXintercept() == l2.getXintercept())) {
			System.out.println("Solution is: Infinite Solutions.");
		} else {
			double x = l1.intersection(l2).getX();
			double y = l1.intersection(l2).getY();
			prtSol(x, y);
		}
	}

}
