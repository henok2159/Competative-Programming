class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        count=0
        hh=sorted(heights)
        for i in range(len(heights)):
            if hh[i]!=heights[i]:
                count+=1
        return count
        