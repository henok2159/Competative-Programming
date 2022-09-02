class Solution {
    public int numTrees(int n) {
        int []sol=new int[n+1];
        sol[0]=1;
        sol[1]=1;
        int k=2;
        while(k<=n){
            int ans=0;
            int i=1;
            while(i<=k){
                ans+=sol[i-1]*sol[k-i];
                i++;
            }
            sol[k++]=ans;
        }
        return sol[n];
    }
}