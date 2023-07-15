package session24;

public class Client {
public static void main(String[] args) throws Exception{
	Queue q = new Queue();
	q.enqueue(10);
	q.enqueue(20);
	q.enqueue(30);
	q.dequeue();
	q.display();
	q.enqueue(40);
	q.enqueue(50);
	q.enqueue(60);
	q.dequeue();
	System.out.println("************");
	q.display();
	
}
}
