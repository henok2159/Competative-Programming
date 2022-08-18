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
    HashMap<Integer,Double>hm=new HashMap();
    HashMap<Integer,Integer>size=new HashMap();
   // Queue<Integer>queue=new Queue();
    ArrayList<Double>ls=new ArrayList();
    int maxLevel=0;
    public List<Double> averageOfLevels(TreeNode root) {
        bfs(root,0);
        for(int i=0;i<=maxLevel;i++){
            ls.add(hm.get(i)/size.get(i));
        }
        return ls;
    
    }
    void bfs(TreeNode root,int level){
       // queue.push(root);
        if(root==null)return;
        size.put(level,size.getOrDefault(level,0)+1);
        hm.put(level,hm.getOrDefault(level,0.0)+(double)root.val);
        bfs(root.left,level+1);
        bfs(root.right,level+1);
        maxLevel=Math.max(maxLevel,level);
    }
}