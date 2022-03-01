class Solution {
    public int[] rearrangeArray(int[] nums) {
        boolean changed = true;
        do {
            changed = false;
            for (int i = 1; i < nums.length-1; i++) {
                if (nums[i] == (nums[i-1] + nums[i+1])/2) {
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                    changed = true;
                }
            }
        }
        while (changed);
        return nums;
    }
}
