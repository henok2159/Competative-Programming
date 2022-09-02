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
    int a=0;
    public int goodNodes(TreeNode root) {
        goodN(root,root.val);
        return a;
    }
   void goodN(TreeNode root,int max){
       if(root==null)return;
       if(root.val>=max){
           a++;
           max=Math.max(max,root.val);
       }
       goodN(root.left,max);
       goodN(root.right,max);
   }
}