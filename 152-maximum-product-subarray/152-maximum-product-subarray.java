class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int []max=new int [n];
        int []min=new int[n];
        max[0]=nums[0];
        min[0]=nums[0];
        int m=nums[0];
        for(int i=1;i<n;i++){
            max[i]=Math.max(nums[i],Math.max(nums[i]*max[i-1],nums[i]*min[i-1]));
             min[i]=Math.min(nums[i],Math.min(nums[i]*max[i-1],nums[i]*min[i-1]));
            m=Math.max(m,max[i]);
        }
        
        return m;
    }
}