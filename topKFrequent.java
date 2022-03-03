class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[]countArray=new int[k];
        int[]nArray=new int[k];
        Map<Integer,Integer>mp=new HashMap<Integer,Integer>();
        // for(int i=0;i<k;i++){
        //     countArray[i]=0;
        // }
     for(int num:nums){
         mp.put(num,mp.getOrDefault(num,0)+1);
     }
     for(int i=0;i<nums.length;i++){
         int index= findIndex(countArray);

         if(mp.get(nums[i])>countArray[index]){
             nArray[index]=nums[i];
             countArray[index]=mp.get(nums[i]);
             
             mp.put(nums[i], 0);

         }
     }
      return nArray;
    }
    private static int findIndex(int []arr){
        int minIndex=0;
        for(int i=0;i<arr.length;i++){
           if(arr[minIndex]>arr[i]){
               minIndex=i;
           }
        }
        return minIndex;
    }
}
