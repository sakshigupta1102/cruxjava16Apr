package session22;
public class SClient {
	public static void main(String[] args) throws Exception {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		System.out.println("!!!!!!!");
		s.display();
		s.pop();
		s.display();
		System.out.println(s.peek());
		System.out.println(s.isEmpty());

	}
}
