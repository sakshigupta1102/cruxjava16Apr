package session25;
import session24.Queue;
public class DynamicQueueClient {
	public static void main(String[] args) throws Exception {
		Queue q = new DynamicQueue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.dequeue();
		q.enqueue(50);
		q.enqueue(60);
		q.enqueue(70);
		q.display();
	}
}
