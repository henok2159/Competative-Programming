class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        
        heap=[]
        for point in points:
            dis=point[0]**2+point[1]**2
            heappush(heap,(dis,point))
        
        ans=[]
        while k>0:
            a=heappop(heap)
            ans.append(a[1])
            k-=1
        return ans