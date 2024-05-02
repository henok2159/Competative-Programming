class Solution:
    def findMaxK(self, nums: List[int]) -> int:
        nums.sort()
        i=0
        j=len(nums)-1
        while i<j:
            if -1*nums[i]==nums[j]:
                return nums[j]
            
            if -1*nums[i]>nums[j]:
                i+=1
            else:
                j-=1
        return -1