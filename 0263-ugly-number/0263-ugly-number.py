class Solution:
    def isUgly(self, n: int) -> bool:
        if n==1:
            return True
        
        while n>=1 and (n%5==0 or n%3==0 or n%2==0 ):
            # print(n)
            
            if n%5==0:
                n//=5
            if n%3==0:
                n//=3
            if n%2==0:
                n//=2
            if n==1:
                return True
            # print(n)
        return False