package chapter2.section4;

public class ArithmeticOperators {

	public static void main(String[] args) {

		/*
		 * Illustrates the difference between prefix and postfix increments/decrements
		 * Prefix: Value is incremented/decremented before the evaluation of the expression 
		 * Postfix: Value is incremented/decremented after the evaluation of the expression
		 */
		int a = 25;
		int b = 25;
		System.out.println(a - b++);
		b = 25;
		System.out.println(a - ++b);
		b = 10;
		System.out.println(++b + b + --b - --b + b++); //11 + 11 + 10 - 9 + 9
		
		String h;
		Integer l;
		

	}

}
