class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] counterArray=new int[101];
        int [] solutionArray=new int [nums.length];
        for(int i=0;i<counterArray.length;i++){
counterArray[i]=0;
        }
        
        for(int i=0;i<nums.length;i++){
            for(int j=counterArray.length-1;j>nums[i];j--){
            counterArray[j]++;
            }
            
        }
        for(int i=0;i<nums.length;i++){
         solutionArray[i]=counterArray[nums[i]];
        }
        return solutionArray;
    }
}
