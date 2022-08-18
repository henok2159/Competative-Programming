class Solution {
   
    public int orangesRotting(int[][] grid) {
        boolean doesOne=false;
        int time=0;
        Queue<Point>queue1=new LinkedList();
        Queue<Point>queue2=new LinkedList();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)doesOne=true;
                if(grid[i][j]==2)queue1.add(new Point(i,j));
            }}
        if(!doesOne)return 0;
          //  while(!queue1.isEmpty()||!queue2.isEmpty()){
                  
                 while(!queue1.isEmpty()){
                   int n=queue1.size();
                     int i=0;
                      time++;
                     while(i++<n){
                   
                   Point p=queue1.remove();
                    if(p.row>0&&grid[p.row-1][p.col]==1){
                       grid[p.row-1][p.col]=2;
                        queue1.add(new Point(p.row-1,p.col));
                    }
                    if(p.row<grid.length-1&&grid[p.row+1][p.col]==1){
                        grid[p.row+1][p.col]=2;
                        queue1.add(new Point(p.row+1,p.col));
                    }
                    if(p.col>0&&grid[p.row][p.col-1]==1){
                        grid[p.row][p.col-1]=2;
                        queue1.add(new Point(p.row,p.col-1));
                    }
                    if(p.col<grid[0].length-1&&grid[p.row][p.col+1]==1){
                        grid[p.row][p.col+1]=2;
                        queue1.add(new Point(p.row,p.col+1));
                    }
                }
                
//                 while(!queue2.isEmpty()){
                
                    
//                    Point p=queue2.remove();
//                     if(p.row>0&&grid[p.row-1][p.col]==1){
//                        grid[p.row-1][p.col]=2;
//                         queue1.add(new Point(p.row-1,p.col));
//                     }
//                     if(p.row<grid.length-1&&grid[p.row+1][p.col]==1){
//                         grid[p.row+1][p.col]=2;
//                         queue1.add(new Point(p.row+1,p.col));
//                     }
//                     if(p.col>0&&grid[p.row][p.col-1]==1){
//                         grid[p.row][p.col-1]=2;
//                         queue1.add(new Point(p.row,p.col-1));
//                     }
//                     if(p.col<grid[0].length-1&&grid[p.row][p.col+1]==1){
//                         grid[p.row][p.col+1]=2;
//                         queue1.add(new Point(p.row,p.col+1));
//                     }
//                 }
            }
                for(int i=0;i<grid.length;i++){
                    for(int j=0;j<grid[0].length;j++){
                        if(grid[i][j]==1)return -1;
                    }
                    
                }
        
        return time-1;
    }
}
class Point{
    int row;
    int col;
    Point(int row,int col){
        this.row=row;
        this.col=col;
    }
}