package midterms.first;

import java.util.Stack;

public class OddEven {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		int count = 1;
		while(count <= 10) {
			if(count % 2==0) {
				System.out.println(count);
			} else {
				st.push(count);
			}
			count++;
		}
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}

	}

}
