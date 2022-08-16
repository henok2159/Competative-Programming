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
    int sum=0;
    public int findTilt(TreeNode root) {
        if(root!=null){
          
            sum+=Math.abs(findSum(root.left)-findSum(root.right));
            findTilt(root.left);
            findTilt(root.right);
          
        }
        return sum;
    }
    int findSum(TreeNode root){
       if(root!=null){
              return root.val+findSum(root.left)+findSum(root.right);
         
       }
        
        return 0;
    }
}