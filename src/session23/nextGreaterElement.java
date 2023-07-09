package session23;

import java.util.Stack;

public class nextGreaterElement {
	public static void main(String[] args) {
		int[] arr = { 90, 4, 6, 5, 7, 1, 18, 2 };
		int[] ans = nge(arr);
		for (int a : ans) {
			System.out.print(a + "  ");
		}
	}
	public static int[] nge(int[] arr) {
		Stack<Integer> stack = new Stack();
		int[] ans = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			int ele = arr[i];
			while (!stack.isEmpty()) {
				int peek = stack.peek();
				if (peek > ele) {
					ans[i] = peek;
					stack.push(ele);
					break;
				} else {
					stack.pop();
				}
			}
			if (stack.isEmpty()) {
				ans[i] = -1;
				stack.push(ele);
			}
		}
		return ans;

	}
}
