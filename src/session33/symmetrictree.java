package session33;

public class symmetrictree {
	public boolean isSymmetric(TreeNode root) {
        return ismirror(root.left, root.right);
            }
    public boolean ismirror(TreeNode p , TreeNode q){
        if(p == null && q == null) return true;
        if(p != null && q == null) return false;
        if(p == null && q != null) return false;
        if(p.val != q.val) return false;

        boolean check1 = ismirror(p.left , q.right);
        boolean check2 = ismirror(p.right , q.left);
        return check1 && check2;
        
    }
}
