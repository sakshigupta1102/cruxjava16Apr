package session34;

public class isbalancedopti {

    class bpair{
        int ht = -1;
        boolean isb = true;
    }
    public boolean isBalanced(TreeNode root) {     
    return isBalancedpair(root).isb;
    }
     public bpair isBalancedpair(TreeNode root) {     
        if(root == null) return new bpair();
        bpair lp = isBalancedpair(root.left);
        bpair rp = isBalancedpair(root.right);
        bpair sp = new bpair();
        sp.ht = Math.max(lp.ht,rp.ht)+1;
        int bf = lp.ht- rp.ht;
        boolean isselfbal = bf==0|| bf==1 || bf==-1;
        sp.isb = lp.isb && rp.isb && isselfbal;
        return sp;

    }
}
