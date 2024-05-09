class Solution:
    def maximumHappinessSum(self, happiness: List[int], k: int) -> int:
        sub=0
        tot=0
        happiness.sort()
        for _ in range(k):
            tot+=max(happiness.pop()-sub,0)
            sub+=1
        return tot
            
        
        
        