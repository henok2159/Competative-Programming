class NumMatrix {
    int [][]cop;
    public NumMatrix(int[][] matrix) {
        int n=matrix.length;
        int k=matrix[0].length;
        cop=new int[n][k];
        for(int i=0;i<n;i++){
            for(int j=1;j<k;j++){
                matrix[i][j]=matrix[i][j]+matrix[i][j-1];
               
            }
        
        }
        for(int i=0;i<k;i++){
            for(int j=1;j<n;j++){
                matrix[j][i]=matrix[j][i]+matrix[j-1][i];
            
            }
           
        
        }
         for(int i=0;i<n;i++){
                for(int j=0;j<k;j++){
                    cop[i][j]=matrix[i][j];
                }
            }
       
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int left=0;
        int top=0;
        int diag=0;
        if(row1!=0)top=cop[row1-1][col2];
        if(col1!=0)left=cop[row2][col1-1];
        if(row1!=0&&col1!=0)diag=cop[row1-1][col1-1];
        return cop[row2][col2]-left-top+diag;
    }
}
