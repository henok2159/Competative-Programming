class Solution {
    public int minPathSum(int[][] grid) {
        int [][]sol=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i==0&&j==0){
                    sol[i][j]=grid[i][j];
                }
                else if(i==0){
                    sol[i][j]=sol[i][j-1]+grid[i][j];
                }
                else if(j==0){
                    sol[i][j]=sol[i-1][j]+grid[i][j];
                }else{
                   sol[i][j] =Math.min(sol[i][j-1],sol[i-1][j])+grid[i][j];
                  
                }
            }
        }
        return sol[sol.length-1][sol[0].length-1];
    }
}