package session34;
public class diameter {
	public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int leftdia = diameterOfBinaryTree(root.left);
         int rightdia = diameterOfBinaryTree(root.right);
         int lh = height(root.left);
         int rh = height(root.right);
         int self = lh+rh+2;
         return Math.max(self, Math.max(leftdia,rightdia)); 
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
