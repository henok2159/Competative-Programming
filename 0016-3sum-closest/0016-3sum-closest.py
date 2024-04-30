class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        nums.sort()
        close=111111111111
        ans=1111111111111
        for i in range(len(nums) - 2):
            firstNum = nums[i]
            j = i + 1
            k = len(nums) - 1
            while j < k:
                secondNum  = nums[j]
                thirdNum = nums[k]

                potentialSum = firstNum + secondNum + thirdNum 
                if abs(potentialSum-target)<=abs(close):
                    close=abs(potentialSum-target)
                    ans=potentialSum
                
                if potentialSum > target:
                    k -= 1
                elif potentialSum < target:
                    j += 1
                else:
                    return target
                    
        return ans   
        
        