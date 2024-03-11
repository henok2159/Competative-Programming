class Solution:
    def countGoodRectangles(self, rectangles: List[List[int]]) -> int:
        result=[]
        for i in rectangles:
            result.append(min(i))
        c=Counter(result)
        larg=max(c.keys())
        return c[larg]