package session28;

import session28.oddevenlinkedlist.ListNode;

public class deletenode {
	 public void deleteNode(ListNode node) {  
	        node.val = node.next.val;
	        node.next = node.next.next;
	    }
}
