class Solution {
     boolean [][]seen;
    int [][]board;
    public int numEnclaves(int[][] board) {
        seen=new boolean[board.length][board[0].length];
        this.board=board;
        for(int i=0;i<board.length;i++){
            
            if(board[i][0]==1&&!seen[i][0])dfs(i,0);
            
            if(board[i][board[0].length-1]==1&&!seen[i][board[0].length-1])dfs(i,board[0].length-1);
        }
        for(int i=0;i<board[0].length;i++){
            if(board[0][i]==1&&!seen[0][i])dfs(0,i);
            if(board[board.length-1][i]==1&&!seen[board.length-1][i])dfs(board.length-1,i);
        }
        int count=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==1&&!seen[i][j])
                count++;
               // System.out.print(seen[i][j]+" ");
            }
           // System.out.println();
        }
    return count;
}

    void dfs(int r,int c){
          
        
      if(r>=0&&r<board.length&&c>=0&&c<board[0].length&&board[r][c]==1&&!seen[r][c])  {
            seen[r][c]=true;
            
         dfs(r-1,c);
         dfs(r+1,c);
         dfs(r,c-1);
         dfs(r,c+1);
     
     
}}}