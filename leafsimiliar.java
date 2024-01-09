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
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        leafNodes(root1,list1);
        leafNodes(root2,list2);
        // for(Integer node:list)
        // System.out.println(node);
        return list1.equals(list2);
    }
    public static void leafNodes(TreeNode node,ArrayList<Integer> list)
    {
        if(node==null)
        return;
        leafNodes(node.left,list);
        leafNodes(node.right,list);
        if(node.left==null && node.right==null)
        list.add(node.val);

    }
}
