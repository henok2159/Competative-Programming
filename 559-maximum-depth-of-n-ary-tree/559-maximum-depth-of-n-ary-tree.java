/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    int maxlen=0;
    public int maxDepth(Node root) {
        maxD(root,0);
        return maxlen;
    }
    public void maxD(Node root,int length){
        if(root!=null){
            
            length+=1;
            if(root.children.size()==0)maxlen=Math.max(maxlen,length);
            List<Node> ch=root.children;
            int i=0;
            while(i<ch.size()){
                  maxD(ch.get(i),length);
                i++;
            }
          
        
        }
    }
}