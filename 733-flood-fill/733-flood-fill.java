class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int val=image[sr][sc];
        if(color!=val)
            dfs(image,sr,sc,color,val);
        return image;
        
    }
    void dfs(int [][]image,int sr,int sc,int color,int value){
        if(image[sr][sc]==value){
            image[sr][sc]=color;
             if(sr>0){
            dfs(image,sr-1,sc,color,value);
        }
        if(sr+1<image.length){
               dfs(image,sr+1,sc,color,value);
        }
         if(sc>0){
            dfs(image,sr,sc-1,color,value);
        }
        if(sc+1<image[0].length){
            dfs(image,sr,sc+1,color,value);
        }
       
            
        }
       
    }
}