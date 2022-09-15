class Solution {
    public int[] sortArray(int[] nums) {
     if(nums.length<=1)return nums;
        int pivot=nums.length/2;
        int []left_list=sortArray(Arrays.copyOfRange(nums,0,pivot));
        int []right_list=sortArray(Arrays.copyOfRange(nums,pivot,nums.length));
        return mergeSort(left_list,right_list);
    }
    int[]mergeSort(int[]left_list,int[]right_list){
        
        int []res=new int[left_list.length+right_list.length];
        int index=0;
        int i=0;int j=0;
        while(i<left_list.length&&j<right_list.length){
            if(left_list[i]<right_list[j]){
                res[index++]=left_list[i++];
            }
            else
            {
                res[index++]=right_list[j++];
            }
            
        }
      
         while(j<right_list.length){
            res[index++]=right_list[j++];
        }
          while(i<left_list.length){
            res[index++]=left_list[i++];
        }
        
        return res;
    }
}