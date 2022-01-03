package recitations;

import java.util.Stack;
import java.util.Queue;

public class StackQueueTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("First");
		stack.push("Second");
		stack.push("Third");
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());
		stack.push("First");
		stack.push("First");
		System.out.println(stack);
		stack.push("p");
		stack.push("p");
		stack.push("p");
		System.out.println(stack);
		System.out.println(stack.search("First"));
		System.out.println(stack.empty());

	}

}
