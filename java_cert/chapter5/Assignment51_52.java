package chapter5;

public class Assignment51_52 {

	public static void main(String[] args) {
		System.out.println(23 / 2.0);
		System.out.println(23 % 2.0);
		System.out.println("Hello" + 1 + 2 + 3 + 4);
		System.out.println(1 + 2 + 3 + 4 + "Hello");
		System.out.println("output is: " + (10 != 5));
		int $ = 80000;
		String msg = $ >= 50000 ? "Good Bonus" : "Average Bonus";
		System.out.println(msg);

		int a = 20;
		int var = --a * a++ + a-- - --a;
		System.out.println(a);
		System.out.println(var);

		a = 7;
		boolean res = a++ == 7 && ++a == 9 || a++ == 9;
		System.out.println(a);
		System.out.println(res);

//		String x = "mango";
//		switch (x) {
//		default:
//			System.out.println("C");
//		case "Apple":
////				b*=2;
//			System.out.println("A");
//			
//		case "Mango":
////				b*=3;
//			System.out.println("B");
//		case "Banana":
//			System.out.println("D");
//
//		}

		int q = '7';
		switch(q) {
		case '7':
			System.out.println("A");
			break;
		default:
			System.out.println("B");
		}
	}

}
