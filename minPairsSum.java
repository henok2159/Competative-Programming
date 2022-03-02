class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        int sum=0;
        while (left<=right){

                sum=Math.max(sum,nums[left]+nums[right]);
                left++;
                right--;


        }
        return sum;
    }
}
