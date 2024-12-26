'''
   1  n=1
   11 n=2
   2 1   n=3
   1 2 1 1     n=4
   111221      n=5
   312211 n=6
'''
class Solution:
    def countAndSay(self, n: int) -> str:
        
        s='1'
        for _ in range(n-1):
            sCopy=""
            i=0
            j=0
            while j<len(s):
                if s[i]==s[j]:
                    j+=1
                else:
                    sCopy+=str(j-i)
                    sCopy+=s[i]
                    i=j
            if i!=j:
                sCopy+=str(j-i)
                sCopy+=s[i]  
            s=sCopy
        return s
        