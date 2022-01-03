package chapter3;

public class MainMethodTest {

	public static void main(String[] args) {
//		System.out.println(a());
//		int[] arr = { 1, 2, 3 };
//		b();
//		System.out.println();
//		b(arr);
//		System.out.println();
//		b(4, 56, 325);
		c(10);
	}

	private static void c(int a) {
//		return 0;
	}

	public static void c(int a) {
//		return 0;
	}

	public static void b(int... a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static int a() {
		try {
			return 10;
		} catch (Exception e) {

		} finally {
			System.out.println("hello");
			return 11;
		}

	}

}
