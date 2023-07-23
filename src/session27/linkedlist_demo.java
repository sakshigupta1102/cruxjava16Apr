package session27;
import java.util.LinkedList;
public class linkedlist_demo {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList();
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addLast(40);
		list.addLast(90);
		System.out.println(list);
		list.remove();
		System.out.println(list);
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		System.out.println(list.isEmpty());
		System.out.println(list.contains(10));
		System.out.println(list.size());
	}
}
