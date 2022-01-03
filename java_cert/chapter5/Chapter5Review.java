package chapter5;

public class Chapter5Review {

	public static void main(String[] args) {
		ifTest(true);
		loopTest();

		for (; true ;)
			break;
		
		do
			break;
		while(true);
		
		System.out.println(1 % 3);
		
//		if(true) { Break can't be used outside a loop or switch statement
//			break;
//		}
		
//		if(true) {
//			
//		} else {
//			
//		} else {
//			
//		}

	}

	public static void switchTest() {
//		switch(8); Invalid
		switch (5) {
		default:
			break;
		}
		int x = 0;
		switch (x) {

		}
	}

	public static void loopTest() {
		int i = 0;
		int j = 0;
		for (; j < 1; ++j, i++) {
			System.out.println(i + " " + j);
		}
		System.out.println(i + " " + j);
	}

	public static void ifTest(boolean flag) {
		if (flag)
			if (flag)
				if (flag)
					System.out.println("FT");
				else
					System.out.println("TF");
			else
				System.out.println("TT");
		else
			System.out.println("FF");
	}

}
