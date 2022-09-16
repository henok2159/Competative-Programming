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
    List<Integer>ls=new ArrayList();
    public boolean isValidBST(TreeNode root) {
       return dfs(root);
        
        
    }
   boolean dfs(TreeNode root){
       if(root==null)return true;
       boolean a=dfs(root.left);
       int i=ls.size()-1;
       if(i>=0&&ls.get(i)>=root.val)return false;
       ls.add(root.val);
       
      boolean b= dfs(root.right);
       
       return a&&b;
   }
    
}