class Solution:
    def numberOfRightTriangles(self, grid: List[List[int]]) -> int:
        row={}
        col={}
        for i in range(len(grid)):
            row[i]=grid[i].count(1)
        
        for i in range(len(grid[0])):
            for j in range(len(grid)):
                if grid[j][i]==1:
                    # print('i:'+str(i))
                    col[i]=col.get(i,0)+1
        
        ans=0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                
                if grid[i][j]==1 and row[i]>=2 and col[j]>1:
                    
                    ans+=(row[i]-1)*(col[j]-1)
                    # col[j]-=1
        return ans
            
                
            
        
        