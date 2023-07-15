package session24;
import java.util.Stack;
public class queue_using_stack_enqueue_eff {
	Stack<Integer> stack;
	public queue_using_stack_enqueue_eff() {
		this.stack = new Stack();
	}
	public void enqueue(int item) {
		this.stack.push(item);
	}
	public int dequeue() {
		Stack<Integer> temp = new Stack();
		while (stack.size() != 1) {
			int val = stack.pop();
			temp.push(val);
		}
		int dq = stack.pop();
		while (!temp.isEmpty()) {
			stack.push(temp.pop());
		}
		return dq;
	}
	public int getFront() {
		Stack<Integer> temp = new Stack();
		while (stack.size() != 1) {
			int val = stack.pop();
			temp.push(val);
		}
		// int dq = stack.pop();
		// stack.push(dq);
		int dq = stack.peek();
		while (!temp.isEmpty()) {
			stack.push(temp.pop());
		}
		return dq;
	}
	public void display() {
		System.out.println(stack);
	}

}
