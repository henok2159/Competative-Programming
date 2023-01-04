class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        rep={}
        for num in nums:
            rep[num]=rep.get(num,0)+1
        dup=-1
        miss=-1
        for k in range(len(nums)+1):
            if rep.get(k)==1:
                continue
            elif rep.get(k)==2:
                duplicate=k
            else :miss=k
        return [duplicate,miss]
       
