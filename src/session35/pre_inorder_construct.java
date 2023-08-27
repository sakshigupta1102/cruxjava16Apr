package session35;
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class pre_inorder_construct {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
      return construct(preorder, 0 , preorder.length-1, inorder,0,inorder.length-1);
    }
    public TreeNode construct(int[] pre, int plo, int phi,int[] in , int ilo, int ihi){
        if(plo > phi || ilo > ihi) return null;
        TreeNode nn = new TreeNode(pre[plo]);
        int nel =0;
        int si = -1;
        for(int i=ilo;i<=ihi;i++){
            if(nn.val == in[i]){
                si = i;
                break;
            }
            nel++;
        }
        nn.left =construct(pre,plo+1 ,plo+nel , in, ilo , si-1);
        nn.right = construct(pre, plo+nel+1 ,phi, in, si+1 ,ihi);
        return nn;

    }
    







}