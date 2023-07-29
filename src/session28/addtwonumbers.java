package session28;

import session28.oddevenlinkedlist.ListNode;

public class addtwonumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode temp1 = l1;
		ListNode temp2 = l2;
		ListNode anshead = new ListNode(-1);
		ListNode temp = anshead;
		int carry = 0;
		while (temp1 != null && temp2 != null) {
			int ans = (temp1.val + temp2.val + carry);
			int rem = ans % 10;
			carry = ans / 10;
			ListNode nn = new ListNode(rem);
			temp.next = nn;
			temp1 = temp1.next;
			temp2 = temp2.next;
			temp = temp.next;
		}
		while (temp1 != null) {
			int ans = temp1.val + carry;
			int rem = ans % 10;
			carry = ans / 10;
			ListNode nn = new ListNode(rem);
			temp.next = nn;
			temp1 = temp1.next;
			temp = temp.next;
		}
		while (temp2 != null) {
			int ans = temp2.val + carry;
			int rem = ans % 10;
			carry = ans / 10;
			ListNode nn = new ListNode(rem);
			temp.next = nn;
			temp2 = temp2.next;
			temp = temp.next;
		}
		if (carry != 0) {
			ListNode nn = new ListNode(carry);
			temp.next = nn;
		}
		return anshead.next;

	}
}
