class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        hm={}
        for num in nums:
            hm[num]=hm.get(num,0)+1
        
        ll=list(hm.keys())
        ll.sort(key=lambda x:hm[x],reverse=True)
        return ll[:k]
        