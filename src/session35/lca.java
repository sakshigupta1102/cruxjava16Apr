package session35;

public class lca {
	public TreeNode lowestCommonAncestor(TreeNode node, TreeNode p, TreeNode q) {
		if (node == null)
			return null;
		if (node.val == p.val)
			return node;
		if (node.val == q.val)
			return node;
		TreeNode ln = lowestCommonAncestor(node.left, p, q);
		TreeNode rn = lowestCommonAncestor(node.right, p, q);
		if (ln != null && rn != null)
			return node;
		return (ln == null) ? rn : ln;

	}
}
