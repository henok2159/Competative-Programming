class Solution {
    int [][]grid;
    boolean [][]seen;
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea=0;
        seen=new boolean[grid.length][grid[0].length];
        this.grid=grid;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
               maxArea=Math.max(maxArea,findArea(i,j));
                System.out.print(maxArea+" ");
            }
            
        }
        return maxArea;
            
    }
      int  findArea(int i,int j){
            if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]==0||seen[i][j]){
                return 0;
            }
          seen[i][j]=true;
         return 1+findArea(i-1,j)+findArea(i+1,j)+findArea(i,j-1)+findArea(i,j+1);
        }
    
}