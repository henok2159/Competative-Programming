class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int i=nums.length-1;
        while(i>=2){
            if(nums[i]<nums[i-1]+nums[i-2]){
                return nums[i]+nums[i-1]+nums[i-2];
            }
            i--;
        }
        return 0;
    }
}