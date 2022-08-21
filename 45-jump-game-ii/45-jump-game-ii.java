class Solution {
    public int jump(int[] nums) {
        if(nums.length==1)return 0;
        int count=0;
        int i=0;
        int max=0;
        int selectedIndex=0;
        int j=0;
        while(i<nums.length){
            count++;
            if(i+nums[i]>=nums.length-1){
                return count;
            }
            
             max=0;
             selectedIndex=i;
             j=i;
            while(j<=i+nums[i]){
                if(max<j+nums[j]){
                    selectedIndex=j;
                    max=j+nums[j];
                    
                }
                j++;
            }
            i=selectedIndex;
        }
        return count;
    }
}