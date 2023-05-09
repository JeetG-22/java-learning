package chapter5;

public class RationalRunnerClass {

	public static void main(String[] args) {
		Rational2 r = new Rational2(43,0);
		Rational2 r1 = new Rational2(35,45);
		Rational2 r2 = new Rational2(1,45);
		Rational2 r3 = new Rational2(-4.1245);
		
		//Math Operations

		System.out.println(r2.decimalValue());
		System.out.println(r1.add(r2));
		System.out.println(r1.subtract(r2));
		System.out.println(r1.divide(r2));
		System.out.println(r1.multiply(r2));
		
		System.out.println(r); //Division by zero
		
		System.out.println(r3); //Reduce method
		
		System.out.println(r1.equals(r2)); //Equals method

	}

}
