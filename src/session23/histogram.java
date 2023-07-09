package session23;

import java.util.Stack;

public class histogram {
	public int largestRectangleArea(int[] arr) {
		int[] left = nextsmallerleft(arr);
		int[] right = nextsmallerright(arr);
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			int currans = (right[i] - left[i] - 1) * arr[i];
			ans = Math.max(ans, currans);
		}
		return ans;

	}

	public static int[] nextsmallerright(int[] arr) {
		Stack<Integer> stack = new Stack();
		int[] ans = new int[arr.length];
		int n = arr.length;
		for (int i = n - 1; i >= 0; i--) {
			while (!stack.isEmpty()) {
				int peekidx = stack.peek();
				if (arr[i] > arr[peekidx]) {
					ans[i] = peekidx;
					stack.push(i);
					break;
				} else {
					stack.pop();
				}
			}
			if (stack.isEmpty()) {
				ans[i] = n;
				stack.push(i);
			}

		}
		return ans;

	}

	public static int[] nextsmallerleft(int[] arr) {
		Stack<Integer> stack = new Stack();
		int[] ans = new int[arr.length];
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			while (!stack.isEmpty()) {
				int peekidx = stack.peek();
				if (arr[i] > arr[peekidx]) {
					ans[i] = peekidx;
					stack.push(i);
					break;
				} else {
					stack.pop();
				}
			}
			if (stack.isEmpty()) {
				ans[i] = -1;
				stack.push(i);
			}

		}
		return ans;

	}

}
