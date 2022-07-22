class Solution {
    public int findTheWinner(int n, int k) {
       ArrayList<Integer>al=new ArrayList();
        
        for(int i=1;i<=n;i++){
            al.add(i);
        }
        int sum=(n*(n+1))/2;
        int count=k-1;
        int lastNo=0;
        int i=0;
        while(sum!=0){
              i=(i+k-1)%n;
            n--;
         lastNo=al.remove(i);
               sum-=lastNo;
               // i++;
            }
            
        
        return lastNo;
    }
}
