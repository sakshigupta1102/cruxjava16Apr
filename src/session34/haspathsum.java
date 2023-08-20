package session34;

import session33.SAMETREE.TreeNode;

public class haspathsum {
	public boolean hasPathSum(TreeNode node, int targetsum) {

		if (node == null)
			return false;
		if (node.left == null && node.right == null) {
			// leaf node
			return targetsum - node.val == 0;
		}
		boolean pathinleft = hasPathSum(node.left, targetsum - node.val);
		boolean pathinright = hasPathSum(node.right, targetsum - node.val);
		return pathinleft || pathinright;

	}
}
