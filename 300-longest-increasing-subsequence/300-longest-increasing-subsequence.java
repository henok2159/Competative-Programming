class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int []dp=new int[n];
        int max=1;
        Arrays.fill(dp,1);
        for(int i=1;i<n;i++){
            int j=i-1;
            boolean cc=true;
            int m=0;
            while(j>=0&&cc){
                if(nums[i]>nums[j]){
                    m=Math.max(dp[j],m);
                    dp[i]=dp[j]+1;
                }
                if(nums[i]==nums[j]){
                    cc=false;
                    dp[i]=dp[j];
                }
                j--;
            }
            dp[i]=m+1;
            max=Math.max(dp[i],max);
        }
        return max;
    }
}