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
    int max=0;
    public int maxDepth(TreeNode root) {
        dfs(root,0);
        return max;
    }
    void dfs(TreeNode root,int i){
        if(root==null){
            max=Math.max(max,i);
        }
        else{
            dfs(root.left,i+1);
            dfs(root.right,i+1);
        }
            
    }
}