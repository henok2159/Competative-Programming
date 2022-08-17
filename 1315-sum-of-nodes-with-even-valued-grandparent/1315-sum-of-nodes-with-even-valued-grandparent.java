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
    public int sumEvenGrandparent(TreeNode root) {
        
       calculateSum(root,root.left);
        calculateSum(root,root.right);
        
        return sum;
    }
    void calculateSum(TreeNode grandParent,TreeNode parent){
        if(parent!=null){
            if(grandParent.val%2==0){
                if(parent.left!=null)sum+=parent.left.val;
                if (parent.right!=null)sum+=parent.right.val;
                //sum+=parent.left.val+parent.right.val;
            }
            calculateSum(parent,parent.left);
            
            calculateSum(parent,parent.right);
        }
    }
}