class Solution {
    public int[] searchRange(int[] nums, int target) {
        int []as=new int[2];
        as[0]=findPosition(target,nums,true);
        as[1]=findPosition(target,nums,false);
        return as;
    }
    int findPosition(int n,int[]nums,boolean isFirst){
        int low=0;
        int result=-1;
        int high=nums.length-1;
        while(low<=high){
           int  mid=low+(high-low)/2;
            if(nums[mid]==n){
                result=mid;
                if(isFirst){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            else if(nums[mid]>n){
                high=mid-1;
            }else low=mid+1;
        }
        return result;
    }
}