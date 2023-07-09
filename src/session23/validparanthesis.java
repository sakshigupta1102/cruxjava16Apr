package session23;

import java.util.Stack;

public class validparanthesis {
	public static void main(String[] args) {

	}

	public static boolean isValid(String str) {
		Stack<Character> stack = new Stack();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			} else {
				if (stack.isEmpty())
					return false;
				char pop = stack.pop();
				if ((pop == '(' && ch != ')') || (pop == '[' && ch != ']')
						|| (pop == '{' && ch != '}')) {
					return false;
				}
			}
		}
		return stack.isEmpty();

	}
}
