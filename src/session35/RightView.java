package session35;

import java.util.ArrayList;
import java.util.List;

public class RightView {
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
	public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList();
        view(root,0,ans);
        return ans;

    }
    public void view(TreeNode node, int currlevel , List<Integer> ans){
        if(node == null) return;
        if(currlevel == ans.size() ){
            ans.add(node.val);
        }
        view(node.right,currlevel+1, ans);
        view(node.left,currlevel+1, ans);
    }
}
