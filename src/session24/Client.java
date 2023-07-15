package session24;

public class Client {
public static void main(String[] args) throws Exception{
//	Queue q = new Queue();
//	q.enqueue(10);
//	q.enqueue(20);
//	q.enqueue(30);
//	q.dequeue();
//	q.display();
//	q.enqueue(40);
//	q.enqueue(50);
//	q.enqueue(60);
//	q.dequeue();
//	System.out.println("************");
//	q.display();
//	queue_using_stack_enqueue_eff queue = new queue_using_stack_enqueue_eff();
//	queue.enqueue(10);
//	queue.enqueue(20);
//	queue.enqueue(30);
//	queue.dequeue();
//	System.out.println(queue.getFront());
//	queue.display();
	Queue_using_stack_dequeue_eff queue = new Queue_using_stack_dequeue_eff();
	queue.enqueue(10);
	queue.enqueue(20);
	queue.enqueue(30);
	System.out.println(queue.dequeue());
	System.out.println(queue.getFront());
	queue.display();
	
}
}
