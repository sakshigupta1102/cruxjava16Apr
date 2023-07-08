package session22;

public class SClient {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.display();
		s.push(10);
		s.push(20);
		s.push(30);
		s.display();
		s.pop();
		s.display();
		System.out.println(s.peek());
		System.out.println(s.isEmpty());

	}
}
