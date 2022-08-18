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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        boolean isLeft=true;
        List<List<Integer>>zig=new ArrayList();
        Queue<TreeNode>queue=new LinkedList();
        if(root!=null){
            queue.add(root);
            while(!queue.isEmpty()){
                int n=queue.size();
                int i=0;
                isLeft=!isLeft;
                List<Integer>ls=new ArrayList();
                
                while(i++<n){
                    
                    TreeNode rr=queue.remove();
                     if(rr!=null){
                         
                    ls.add(rr.val);
                        
                        queue.add(rr.left);
                        queue.add(rr.right);
                         
                             
                         
                    }
                    
                }
                
                if(isLeft)Collections.reverse(ls);
                zig.add(ls);
            }
            zig.remove(zig.size()-1);
        }
        return zig;
    }
   
        
    }
