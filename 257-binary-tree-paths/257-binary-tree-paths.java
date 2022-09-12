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
    List<String>aa=new ArrayList();
    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root,"");
        return aa;
    }
    
    public void dfs(TreeNode root,String s){
        if(root!=null){ 
            String d=s+root.val+"->";
            dfs(root.left,d);
            dfs(root.right,d);
            if(root.left==null&&root.right==null)
            {
                s+=root.val;
                 aa.add(s);
            }
            
         
            
        }
       
    }
}