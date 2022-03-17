class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []left=new int[nums.length];
        int []right=new int[nums.length];
        left[0]=1;
        int n=nums.length;
        right[n-1]=1;
        for(int i=1;i<n;i++){
            left[i]=nums[i-1]*left[i-1];
        }
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]*nums[i+1];
        }
        nums[0]=right[0];
        nums[n-1]=left[n-1];
        
        for(int i=1;i<n-1;i++){
            nums[i]=left[i]*right[i];
        }
        
    
       return nums;
    }
}
