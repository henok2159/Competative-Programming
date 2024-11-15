class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        mx=0
        count=0
        for num in nums:
            if num==1:
                count+=1
                mx=max(mx,count)
            else:
                count=0
        return mx
        