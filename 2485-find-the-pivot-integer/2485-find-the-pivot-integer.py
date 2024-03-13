class Solution:
    def pivotInteger(self, n: int) -> int:
        tot=(n*(n+1))//2

        res=0
        for i in range(n+1):
            res+=i
            if res==tot:
                return i
            tot-=i
        return -1
            
        