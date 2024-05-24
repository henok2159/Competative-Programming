class Solution:
    def findSubsequences(self, nums: List[int]) -> List[List[int]]:
        
        result=set()
        def backtrack(ls,i):
            
            
            if len(ls)>1 :
                result.add(tuple(ls.copy()))
                
            
            for j in range(i+1,len(nums)):
                
                if len(ls)==0 or nums[j]>=ls[-1]:
                    zz=ls.copy()
                    zz.append(nums[j])
                    backtrack(zz,j)
                    zz.pop()
                    backtrack(zz,j)
        backtrack([],-1)
        return [list(x) for x in result]
            
                    
        