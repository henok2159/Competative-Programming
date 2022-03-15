class Solution {
    public int pivotIndex(int[] nums) {
        
        int sumi=0;
        int sumT=0;
        for(int num:nums){
            sumT=sumT+num;
        }
       
        for(int i=0;i<nums.length;i++){
       
            if(sumT-sumi-nums[i]==sumi){
                return i;
            }
            
            sumi=sumi+nums[i];
            
        }
        return -1;
        
    }
}
