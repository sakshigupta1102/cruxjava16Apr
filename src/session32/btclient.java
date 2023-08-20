package session32;

public class btclient {
	public static void main(String[] args) {
		String str = "10 true 20 true 40 false false true 50 false false"
				+ " true 30 false true 60 true 70 false false false";
		BinaryTree bt = new BinaryTree(str);
		// bt.display();
		// System.out.println(bt.size());
		// System.out.println(bt.max());
		// System.out.println(bt.find(20));
		// System.out.println(bt.height());
		// bt.preorder();
		// System.out.println("**********");
		// bt.postorder();
		// bt.levelOrder();
		bt.levelOrderInNextLine();

	}
}
