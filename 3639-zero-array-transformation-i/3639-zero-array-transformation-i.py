class Solution:
    def isZeroArray(self, nums: List[int], queries: List[List[int]]) -> bool:

        prefix=[0]*(len(nums)+1)

        for query in queries:
            prefix[query[0]]+=1
            prefix[query[1]+1]-=1
        
        for i in range(1,len(prefix),1):
            prefix[i]=prefix[i]+prefix[i-1]
        # print(prefix)
        for i in range(len(nums)):
            if prefix[i]<nums[i]:
                return False
        return True
        