class Solution {
    public int maxOperations(int[] nums, int k) {
      int count=0;
        Map<Integer,Integer>mp=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])&&mp.containsKey(k-nums[i])){
                if(nums[i]!=k-nums[i]){
                    count=count+Math.min(mp.get(nums[i]),mp.get(k-nums[i])) ;

                }
                else{
                    count=count+mp.get(nums[i])/2;
                }
                mp.remove(nums[i]);
                mp.remove(k-nums[i]);

            }
        }
        return count;
    }
}
