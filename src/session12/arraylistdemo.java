package session12;

import java.util.ArrayList;

public class arraylistdemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list.get(2));
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		//list.add(0, 400);
		System.out.println(list);
		list.set(0, 400);
		System.out.println(list);
		//list.set(2, 100);
		
		

	}
}
