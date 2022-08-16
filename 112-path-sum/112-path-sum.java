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

    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        return pathSum(root,0,targetSum);
    }
    boolean pathSum(TreeNode root,int target,int targetSum){
       if(root!=null){
           target+=root.val;
           if(root.left==null&&root.right==null&&target==targetSum)return true;
       }
        else return false;
        return pathSum(root.left,target,targetSum)||pathSum(root.right,target,targetSum);
    }
}