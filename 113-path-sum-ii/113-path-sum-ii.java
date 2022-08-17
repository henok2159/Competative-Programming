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
    List<List<Integer>>ls=new ArrayList();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        calculateSum(root,new ArrayList(),0,targetSum);
        return ls;
    }
    void calculateSum(TreeNode root,List<Integer>l,int sum,int targetSum){
        if(root!=null){
            sum+=root.val;
            l.add(root.val);
            System.out.print(sum+" ");
            if(root.left==null&&root.right==null&&targetSum==sum){
                ls.add(l);
            }
          
            calculateSum(root.left,new ArrayList<Integer>(l),sum,targetSum);
            calculateSum(root.right,new ArrayList<Integer>(l),sum,targetSum);
        }
    }
}