package session28;

public class intersection_of_linkedlist {
	// Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		public ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode A = headA;
		ListNode B = headB;
		while (A != B) {
			if (A == null) {
				A = headB;
			} else if (A != null) {
				A = A.next;
			}
			if (B == null) {
				B = headA;
			} else if (B != null) {
				B = B.next;
			}
		}
		return A;

	}

}
