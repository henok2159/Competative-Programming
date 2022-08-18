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
    Map<TreeNode, Integer> mp;
    int max_depth = 0;
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        mp = new HashMap<>();
        int depth = 0;
        helper(root, depth);
        return lcs(root);
    }
    public void helper(TreeNode root, int depth){
        if(root==null)return;
        mp.put(root, depth);
        max_depth = Math.max(depth, max_depth);
        helper(root.left, depth+1);
        helper(root.right, depth+1);
    }
    public TreeNode lcs(TreeNode root){
        if(root==null)return null;
        if(mp.get(root)==max_depth)return root;
        TreeNode left = lcs(root.left);
        TreeNode right = lcs(root.right);
        if(right==null)return left;
        if(left==null)return right;
        return root;
    }
}