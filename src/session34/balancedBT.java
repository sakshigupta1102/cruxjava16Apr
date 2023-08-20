package session34;

public class balancedBT {
	public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        boolean isl = isBalanced(root.left);
        boolean isr = isBalanced(root.right);
        int lh = height(root.left);
        int rh = height(root.right);
        int bf = lh-rh;
        boolean isself = bf==0||bf==1||bf==-1;
        return isl&&isr&&isself;        
    }

    public int height(TreeNode node) {
		if (node == null) {
			return -1;
		}
		int lh = height(node.left);
		int rh = height(node.right);
		return Math.max(lh, rh) + 1;

	}
}
