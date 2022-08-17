class Solution {
    int count=0;
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited=new boolean[isConnected.length];
        helper(isConnected,0,visited);
        for(int i=0;i<isConnected.length;i++){
            helper(isConnected,i,visited);
        }
        return count;
    }
    public void helper(int[][] isConnected,int idx,boolean[] visited){
        if(idx==isConnected.length) return;
        for(int i=0;i<isConnected.length;i++){
            if(isConnected[idx][i]==1){
                if(!visited[idx]&&!visited[i]){
                    count++;
                    visited[idx]=true;
                    visited[i]=true;
                }
                else if(visited[idx]&&!visited[i]){
                    visited[i]=true;
                    helper(isConnected,i,visited);
                }
                
            }
            
            
        }
    }
}