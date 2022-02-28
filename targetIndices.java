class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int repetition=0;
        int belowTarget=0;
        List<Integer> solutionList=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>target){
                continue;
            }else if(nums[i]==target){
                repetition++;
            }else{
                belowTarget++;
            }
            
            
        }
        for(int i=repetition;i>0;i--){
           solutionList.add(belowTarget+repetition-i); 
        }
       return solutionList; 
    }
}
