class Solution:
    def mostPoints(self, questions: List[List[int]]) -> int:

        cache={}
        def backtrack(i):
            if i>=len(questions):
                return 0
            if i in cache:
                return cache[i]
            cache[i]=max(questions[i][0]+backtrack(i+1+questions[i][1]),backtrack(i+1))
            return cache[i]
        return backtrack(0)