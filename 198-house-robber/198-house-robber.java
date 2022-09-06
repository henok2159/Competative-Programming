class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        if(nums.length==2)return Math.max(nums[0],nums[1]);
        int max=0;
        
        int[]r=new int[nums.length];
        r[0]=nums[0];
        r[1]=nums[1];
        r[2]=nums[0]+nums[2];
        for(int i=3;i<nums.length;i++){
           r[i]=Math.max(r[i-2],r[i-3])+nums[i]; 
            
        }
        
        return Math.max(r[r.length-1],r[r.length-2]);
    }
}