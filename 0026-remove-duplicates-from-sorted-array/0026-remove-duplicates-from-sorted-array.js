/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    
     var slow=0;
        var fast=1;
        while(fast<nums.length)
        {
            if(nums[fast]==nums[slow]){
                fast++;
            }
            else{
                slow++;
                nums[slow]=nums[fast++];
            }
        }
        return ++slow;
};