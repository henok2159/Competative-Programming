class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        heap=[]
        for stone in stones:
            heappush(heap,-stone)
        
        while len(heap)>1:
            s1=-1*heappop(heap)
            s2=-1*heappop(heap)
            rem=s1-s2
            heappush(heap,-rem)
        return -1*heap[0]