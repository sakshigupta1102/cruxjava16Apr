package session26;
public class LinkedListClient {
public static void main(String[] args) throws Exception {
	LinkedList ll = new LinkedList();
	ll.addLast(10);
	ll.addLast(20);
	ll.addLast(30);
	ll.addLast(40);
	ll.addLast(50);
	ll.addAt(90, 2);
	ll.removeAt(2);
	ll.removeLast();
	ll.removeFirst();
	System.out.println(ll.getAt(2));
	ll.addFirst(2000);
	//System.out.println(ll.getAt(3));
	System.out.println(ll);
	System.out.println(ll.getLastNode());
}
}
