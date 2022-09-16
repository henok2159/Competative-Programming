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
    int prev=Integer.MIN_VALUE;
    int count=0;
    public boolean isValidBST(TreeNode root) {
       return dfs(root);
        
        
    }
   boolean dfs(TreeNode root){
       if(root==null)return true;
     
      boolean a=dfs(root.left);
       
       // System.out.print(prev+" ");
       if(count++>0&&prev>=root.val)return false;
     
         prev=root.val;
      boolean b= dfs(root.right);
       
       return a&&b;
   }
    
}