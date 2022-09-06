class Solution {
    public int maxProfit(int[] prices) {
        
        int min=prices[0];
        int sol=0;
        for(int i=1;i<prices.length;i++){
             
             min=Math.min(min,prices[i]);
             sol=Math.max(sol,prices[i]-min);
        }
        return sol;
    }
}