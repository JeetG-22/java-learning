package foundationtest;

import java.util.ArrayList;
import java.util.List;
 import static java.lang.System.*;

public class Test3 {
	static int num;

	public static void main(String[] args) {
//		int i = 0;
//		POINT: for(;i<10; i++) {
//			break POINT;
//		}
//		System.out.println(i--);
//		
//		String word = "   Hello Java Guru   ";
//		System.out.print(word.trim());
//		
//		List list = new ArrayList<>();
//		list.add("h");
//		list.add(2, "hello");
//		System.out.println(list);
//		int b1[] = new int[] {1,2};
//		int a = 5;
//		int b =2;
//		int c = 30;
//		System.out.println(a-- * c / b);
//		
//		String[] str = new String[1];
//		for(String st : str) {
//			System.out.println(st + " ");
//		}
		
		
//		new Test3().crazyLoop();
//		new Test3().method1(7);
		System.out.println(num);
	}
	
	public static int test() throws Exception {
		throw new Exception();
	}
	
	void crazyLoop() {
		int c = 0;
		JACK: while(c < 8) {
			System.out.println(c);
			JILL: if(c>3) break JILL; else c++;
		}
	}
	
	public void method1(int i) {
		int j = (i*30-2)/100;
		
		POINT1: for(;j<10; j++) {
			boolean flag = false;
			while(!flag) {
				if(Math.random() > .5) break POINT1;
			}
		}
		while(j>0) {
			System.out.println(j--);
			if(j==4) break;
		}
	}
	
	

}
