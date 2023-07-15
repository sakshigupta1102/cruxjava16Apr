package session24;

public class reverseQueue {
	public static void main(String[] args) throws Exception {
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.display();
		System.out.println("******************");
		reverse(q);
		q.display();
	}
	public static void reverse(Queue q)  {
		
	}
}
