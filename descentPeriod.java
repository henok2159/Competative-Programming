class Solution {
    public long getDescentPeriods(int[] prices) {
    Stack<Integer>st=new Stack();
        
        long ans=1;int slow=0;
        for(int fast=1;fast<prices.length;fast++){
            if(prices[fast]-prices[fast-1]==-1){
                ans=ans+fast-slow+1;
            }
            else{
               ans++;
                slow=fast;
            }
        }
        return ans;
    }
}
