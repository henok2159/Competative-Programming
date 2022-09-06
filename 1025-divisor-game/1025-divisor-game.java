class Solution {
    public boolean divisorGame(int n) {
        boolean []arr=new boolean[n+1];
       arr[1]=false;
        
        for(int i=2;i<=n;i++){
            boolean ans=false;
            for(int j=1;j<i;j++){
                if(i%j==0&&!arr[i-j]){
                    ans=true;
                    j=i;
                }
            }
            arr[i]=ans;
        }
        return arr[n];
    }
}