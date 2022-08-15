class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=1;
    
        for(int i=0;i<nums.length;i++){
            high=Math.max(high,nums[i]);
        }
        int result=1;
        while(low<=high){
            int mid=low+(high-low)/2;
            double m=(double)mid;
            int sum=0;
            for(int num:nums){
                sum+=Math.ceil(num/m);
            }
           
            if(sum>threshold){
                low=mid+1;
            }else{
                 
                high=mid-1;
                result=mid;
            }
        }
        return result;
    }
}