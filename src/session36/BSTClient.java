package session36;

import session36.BST.Node;

public class BSTClient {
public static void main(String[] args) {
	int[] arr = {35,40,45,50,55,60,65};
	BST bst = new BST(arr);
	bst.display();
	System.out.println(bst.max());
	System.out.println(bst.find(55));
	bst.printInRange(30, 48);
	System.out.println("******************");
	Node nn = bst.add(48, bst.root);
	bst.display(nn);
}
}
