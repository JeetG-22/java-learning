package chapter5;

public class ReviewAssessment2 {

	public static void main(String[] args) {
		int counter = 0;
		outer:
		for(int i = 0; i < 3; i++) {
			middle:
			for(int j = 0; j < 3; j++) {
				inner:
				for(int k = 0; k < 3; k++) {
					if(k-j>0) {
						break middle;
					}
					counter++;
				}
			}
		}
		System.out.println(counter);
//		if(false) {
//			System.out.println();
//		}
//		while(false) {
//			System.out.println();
//		}
		int i = 5;
		float f = 5.5f;
		char c = 'a';
		if(i == f) {
			c++;
		}
		System.out.println(c);
		
//		int count=0, sum =0 ;
//		do {
//			if(count%3==0) {
//				continue;
//			}
//			sum+=count;
//		} while(count++ < 11);
//		System.out.println(sum);
	}
	
	public static void test(byte x) {
		switch(x) {
		case 'b':
			default:
			case -2:
			case 80:
		}
	}

}
