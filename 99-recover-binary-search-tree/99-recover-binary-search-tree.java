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
    
    TreeNode first =null;
    TreeNode second=null;
    TreeNode prev=new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {
         
     inorder(root); 
    swap(first,second);
    }
    void inorder(TreeNode root){
        if(root==null)return;
        
        inorder(root.left);
        if(first==null&&prev.val>root.val)first=prev;
        if(first!=null&&prev.val>root.val)second=root;
        prev=root;
        
        inorder(root.right);
    }
    void swap(TreeNode tr1,TreeNode tr2){
        int temp=tr1.val;
        tr1.val=tr2.val;
        tr2.val=temp;
    }
}