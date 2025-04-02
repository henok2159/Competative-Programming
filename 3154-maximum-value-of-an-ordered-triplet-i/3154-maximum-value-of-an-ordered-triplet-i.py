class Solution:
    def maximumTripletValue(self, nums: List[int]) -> int:
        mx=0
        for i in range(len(nums)):
            for j in range(i+1,len(nums),1):
                for k in range(j+1, len(nums),1):
                    mx=max((nums[i]-nums[j])*nums[k],mx)
        return mx

        