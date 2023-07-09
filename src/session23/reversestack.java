package session23;

import java.util.Stack;

public class reversestack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println(stack);
		//pushdown(stack, 50);
		reverse(stack);
		System.out.println(stack);
	}

	public static void reverse(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return;
		}
		int ele = stack.pop();
		reverse(stack);
		pushdown(stack, ele);
	}

	public static void pushdown(Stack<Integer> stack, int ele) {
		if (stack.isEmpty()) {
			stack.push(ele);
			return;
		}
		int currele = stack.pop();
		pushdown(stack, ele);
		stack.push(currele);
	}
}
