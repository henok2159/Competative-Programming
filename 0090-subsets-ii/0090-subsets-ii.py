class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        ss=set()
        def dfs(i,ls):
            lsc=ls.copy()
            lsc.sort()
            lst=tuple(lsc)
            if lst not in ss:
                ss.add(lst)
            if i>=len(nums):
                return
            ls.append(nums[i])
            dfs(i+1,ls)
            ls.pop()
            dfs(i+1,ls)
        dfs(0,[])
        return [list(x) for x in ss]
            

        