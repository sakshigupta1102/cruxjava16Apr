package session25;

import session22.Stack;

public class DynamicStackClient {
	public static void main(String[] args) throws Exception {
		Stack stack = new DynamicStack();
		stack.push(10);
		stack.push(20);
		stack.push(10);
		stack.push(20);
		stack.push(10);
		stack.push(20);
		stack.push(10);
		stack.push(20);
		stack.push(10);
		stack.push(20);
		stack.display();

	}
}
