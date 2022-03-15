//bruteforce approach 

class Solution {
    public int subarraySum(int[] nums, int k) {
      int total_sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
                if(nums[i]==k){
                    count++;
                }
            total_sum=nums[i];
            for(int j=i+1;j<nums.length;j++){
                total_sum=total_sum+nums[j];
                if(total_sum==k){
                    count++;
                }
                
            
            }
        }
        return count;
    }
}
