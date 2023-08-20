package session33;

public class sametree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null)
			return true;
		if (p != null && q == null)
			return false;
		if (p == null && q != null)
			return false;
		if (p.val != q.val)
			return false;

		boolean isleftsame = isSameTree(p.left, q.left);
		boolean isrightsame = isSameTree(p.right, q.right);
		return isleftsame && isrightsame;

	}
}
