class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort(key=lambda x:(x[0]))
        i=0
        sol=[]
        while i<len(intervals):
            maxi=intervals[i][1]
            ini=i
            while i<len(intervals) and intervals[i][0]<=maxi:
                
                maxi=max(maxi,intervals[i][1])
                i+=1
            sol.append([intervals[ini][0],maxi])
        return sol
