class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        parent={}
        nums=set(nums)
        for num in nums:
            parent[num]=num

        def find(node):
            if parent[node]==node:
                return node
            boss=find(parent[node])
            parent[node]=boss
            return boss
        def union(a,b):
            bossA=find(a)
            bossB=find(b)
            parent[bossB]=bossA
        
        for num in nums:
            if num+1 in parent:
                union(num,num+1)
            if num-1 in parent:
                union(num,num-1)
        
        hm={}
        for num in nums:
            a=find(num)
            hm[a]=hm.get(a,0)+1
        print(hm)
        sol=0
        for kk in hm.keys():
            sol=max(sol,hm[kk])
        return sol