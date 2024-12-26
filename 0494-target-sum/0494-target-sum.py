class Solution:
    def findTargetSumWays(self, nums: List[int], target: int) -> int:
        count=0
        dp={}
        def dfs(i,total):
            
            if i==len(nums):
                if total==target:
                    return 1
                else:
                    return 0
            
            elif (i,total) in dp.keys():
                return dp[(i,total)]
            else:
                dp[(i,total)] = dfs(i+1,total+nums[i])+dfs(i+1,total-nums[i])
                return dp[(i,total)]
                
        
        return dfs(0,0)
        