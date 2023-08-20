package session34;

public class diameter_opti {
	class Solution {
	    class diapair{
	      int ht=-1;
	      int d=0;
	    }
	    public int diameterOfBinaryTree(TreeNode root) {
	       return diameter(root).d;       
	    }
	    public diapair diameter(TreeNode node){
	      if(node == null) return new diapair();
	       diapair lp =diameter(node.left);
	       diapair rp = diameter(node.right);
	       diapair sp = new diapair();
	       int selfh = Math.max(lp.ht,rp.ht) + 1;
	       int selfdia = lp.ht + rp.ht + 2;
	       sp.ht = selfh;
	       sp.d = Math.max(lp.d,Math.max(rp.d,selfdia));
	       return sp;

	    }   
	}
}
