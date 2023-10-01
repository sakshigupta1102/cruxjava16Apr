package session44;

public class HeapClient {
public static void main(String[] args) {
	Heap heap = new Heap();
	heap.add(1);
	heap.add(3);
	heap.add(6);
	heap.add(5);
	heap.add(9);
	heap.add(8);
	heap.display();
//	System.out.println(heap.get());
	System.out.println(heap.remove());
	System.out.println(heap.remove());
	System.out.println(heap.remove());
	System.out.println(heap.remove());
	
	
	
	
}
}
