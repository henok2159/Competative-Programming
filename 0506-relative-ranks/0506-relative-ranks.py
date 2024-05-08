class Solution:
    def findRelativeRanks(self, score: List[int]) -> List[str]:
        
        std=sorted(score,reverse=True)
        hm={}
        for i in range(len(std)):
            hm[std[i]]=i+1
        sol=[]
        for val in score:
            
            if hm[val]==1:
                sol.append('Gold Medal')
            elif hm[val]==2:
                sol.append('Silver Medal')
            elif hm[val]==3:
                sol.append('Bronze Medal')
            else:
                sol.append(str(hm[val]))
        return sol
            
            
        