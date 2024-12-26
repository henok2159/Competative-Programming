class Solution:
    def isHappy(self, n: int) -> bool:
        ss=set()
        
        while n not in ss:
            ss.add(n)
            s=str(n)
            tot=0
            for c in s:
                tot+=int(c)*int(c)
            n=int(tot)
            
        print(n)
        return n==1
            
            
            
            
        