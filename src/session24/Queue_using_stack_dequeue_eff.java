package session24;
import java.util.Stack;
public class Queue_using_stack_dequeue_eff {
	Stack<Integer> stack;
	public Queue_using_stack_dequeue_eff() {
		this.stack = new Stack();
	}
	public void enqueue(int item) {
		Stack<Integer> temp = new Stack();
		while(!stack.isEmpty()){
			temp.push(stack.pop());
		}
		stack.push(item);
		while(!temp.isEmpty()){
			stack.push(temp.pop());
		}
	}
	public int dequeue() {
		return stack.pop();
	}
	public int getFront() {
		return stack.peek();
	}
	public void display() {
		System.out.println(stack);
	}
}
