class Solution:
    def canJump(self, nums: List[int]) -> bool:
        
        sol=nums[0]
        for i in range(len(nums)):
            sol-=1
            sol=max(sol,nums[i])
            if sol==0 and i!=len(nums)-1:
                return False
        return True
            