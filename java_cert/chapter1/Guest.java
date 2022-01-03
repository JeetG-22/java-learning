package chapter1;


class Message {
	String a;
	int b;
	double c;
	boolean d;
}

public class Guest {
	char c;
	double d;
	float f;
	public static void main(String[] args) {
//		Guest g = new Guest();
//		System.out.println(g.c);
//		System.out.println(g.d);
//		System.out.println(g.f);
//		System.out.println(Boolean.valueOf(null));
		m(1);
//		Double a = 7;
//		System.out.println(a.intValue());
		System.out.println(new Boolean("ture"));
	}
	private static void m(Object obj) {
		System.out.println("Obj");
	}
	private static void m(Number obj) {
		System.out.println("Number");
	}
	private static void m(Double obj) {
		System.out.println("Double");
	}

}
