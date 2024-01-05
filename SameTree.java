/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)//both are null then trees are same
        return true;
        else if(p==null || q==null)//one is null other is not then not same trees
        return false;
        if(p.val!=q.val)//if values are different the also diffrent trees
        return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
