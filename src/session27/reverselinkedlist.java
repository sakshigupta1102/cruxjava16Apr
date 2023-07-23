package session27;

import java.util.LinkedList;

public class reverselinkedlist {

	// Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public ListNode reverseList(ListNode head) {
			ListNode prev = null;
			ListNode curr = head;
			while (curr != null) {
				ListNode save = curr.next;
				curr.next = prev;
				prev = curr;
				curr = save;
			}
			head = prev;
			return head;
		}
	}
}
