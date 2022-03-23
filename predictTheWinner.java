class Solution {
    public boolean PredictTheWinner(int[] nums) {
       if(nums.length%2==0)return true;
        return winner(nums,0,nums.length-1,1)>=0;
        
    }
    public int winner(int []nums,int s,int e,int turn){
        if(s==e)
            return turn*nums[s];
            int a=turn*nums[s]+winner(nums,s+1,e,-turn);
            int b=turn*nums[e]+winner(nums,s,e-1,-turn);
            return turn*Math.max(a*turn,b*turn);
        
        
    }
}
