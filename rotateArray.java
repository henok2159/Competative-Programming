class Solution {
    public void rotate(int[] nums, int k) {
        int i=0;
        
        
        while(k<0){
            
        while(i<nums.length){
            int temp=nums[i+k];
            
            nums[(i+k)%nums.length]=nums[i];
            i=i+k;
        }
            k=0;
        }
    }
}
