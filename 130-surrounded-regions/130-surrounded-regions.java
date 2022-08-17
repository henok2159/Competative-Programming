class Solution {
    boolean [][]seen;
    char [][]board;
    public void solve(char[][] board) {
        seen=new boolean[board.length][board[0].length];
        this.board=board;
        for(int i=0;i<board.length;i++){
            
            if(board[i][0]=='O'&&!seen[i][0])dfs(i,0);
            
            if(board[i][board[0].length-1]=='O'&&!seen[i][board[0].length-1])dfs(i,board[0].length-1);
        }
        for(int i=0;i<board[0].length;i++){
            if(board[0][i]=='O'&&!seen[0][i])dfs(0,i);
            if(board[board.length-1][i]=='O'&&!seen[board.length-1][i])dfs(board.length-1,i);
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O'&&!seen[i][j])
                    board[i][j]='X';
               // System.out.print(seen[i][j]+" ");
            }
           // System.out.println();
        }
        
    }
    void dfs(int r,int c){
          
        
      if(r>=0&&r<board.length&&c>=0&&c<board[0].length&&board[r][c]=='O'&&!seen[r][c])  {
            seen[r][c]=true;
            
         dfs(r-1,c);
         dfs(r+1,c);
         dfs(r,c-1);
         dfs(r,c+1);
     
      }
    }
}