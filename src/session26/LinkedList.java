package session26;
public class LinkedList {
	class Node {
		int val;
		Node next;
		public Node() {
			this.val = 0;
		}
		public Node(int val) {
			this.val = val;
		}
		@Override
		public String toString(){
			return "Node" +" val ->" + this.val; 
		}
	}
	Node head;
	Node tail;
	int size = 0;

	public boolean isEmpty() {
		return this.head == null;
	}

	public int getFirst() throws Exception {
		if (isEmpty()) {
			throw new Exception("linkedlist is empty");
		}
		return this.head.val;
	}

	public Node getFirstNode() throws Exception {
		if (isEmpty()) {
			throw new Exception("linkedlist is empty");
		}
		return this.head;
	}

	public int getLast() throws Exception {
		if (isEmpty()) {
			throw new Exception("linkedlist is empty");
		}
		return this.tail.val;
	}

	public Node getLastNode() throws Exception {
		if (isEmpty()) {
			throw new Exception("linkedlist is empty");
		}
		return this.tail;
	}

	public int getAt(int idx) throws Exception {
		if (idx < 0 || idx >= this.size) {
			throw new Exception("invalid index");
		} else if (idx == 0) {
			return getFirst();
		} else if (idx == this.size - 1) {
			return getLast();
		} else {
			Node temp = head;
			for (int i = 0; i < idx; i++) {
				temp = temp.next;
			}
			return temp.val;
		}

	}

	public Node getNodeAt(int idx) throws Exception {
		if (idx < 0 || idx >= this.size) {
			throw new Exception("invalid index");
		} else if (idx == 0) {
			return getFirstNode();
		} else if (idx == this.size - 1) {
			return getLastNode();
		} else {
			Node temp = head;
			for (int i = 0; i < idx; i++) {
				temp = temp.next;
			}
			return temp;
		}
	}

	public void addFirst(int item) {
		Node nn = new Node(item);
		if (isEmpty()) {
			this.head = nn;
			this.tail = nn;
			this.size++;

		} else {
			nn.next = head;
			this.head = nn;
			this.size++;
		}
	}

	public void addLast(int item) {

		Node nn = new Node(item);
		if (isEmpty()) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.tail.next = nn;
			this.tail = nn;
			this.size++;

		}
	}

	public void addAt(int item, int idx) throws Exception {
		if (idx < 0 || idx > this.size) {
			throw new Exception("invalid position");
		} else if (idx == 0) {
			addFirst(item);
		} else if (idx == this.size) {
			addLast(item);
		} else {
			Node nn = new Node(item);
			Node pNode = getNodeAt(idx - 1);
			Node save = pNode.next;
			pNode.next = nn;
			nn.next = save;
			this.size++;
		}
	}

	public void removeFirst() throws Exception {
		if (isEmpty()) {
			throw new Exception("LL IS EMPTY");
		}
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size--;
		} else {
			this.head = this.head.next;
			this.size--;
		}
	}

	public void removeLast() throws Exception {
		if (isEmpty()) {
			throw new Exception("LL IS EMPTY");
		}
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size--;
		} else {
			Node pNode = getNodeAt(this.size - 2);
			pNode.next = null;
			this.tail = pNode;
			this.size--;
		}

	}

	public void removeAt(int idx) throws Exception {
		if (idx == 0)
			removeFirst();
		else if (idx == this.size - 1)
			removeLast();
		else {
			Node pNode = getNodeAt(idx - 1);
			Node cNode = pNode.next;
			pNode.next = cNode.next;
			this.size--;
		}
	}
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "  ");
			temp = temp.next;
		}
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node temp = head;
		while (temp != null) {
			sb.append(temp.val + "  ");
			temp = temp.next;
		}
		return sb.toString();

	}

}
