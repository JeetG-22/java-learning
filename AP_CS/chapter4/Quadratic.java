package chapter4;

import java.util.Scanner;

public class Quadratic {
	static double a,b,c;
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("A: ");
		a = kbd.nextDouble();
		System.out.println("B: ");
		b = kbd.nextDouble();
		System.out.println("C: ");
		c = kbd.nextDouble();
		if(findingRoot().equals("Real Root")) {
			System.out.println("Positive Root: " + positiveRoot());
			System.out.println("Negative Root: " + negativeRoot());
		} 
		else {
			System.out.println(findingRoot());
		}
		
		kbd.close();
	}
	public static double discriminant() {
		return Math.pow(b, 2) - (4*a*c);
	}
	public static String findingRoot() {
		if(discriminant()<0) {
			return "Imaginary Root";
		}
		return "Real Root";
	}
	public static double positiveRoot() {
		return ((-1*b)+Math.sqrt(discriminant())) / (2*a);
	}
	public static double negativeRoot() {
		return ((-1*b)-Math.sqrt(discriminant())) / (2*a);
	}
	

}
