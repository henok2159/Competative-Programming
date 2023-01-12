class Solution:
    def freqAlphabets(self, s: str) -> str:
        sol=''
        lastInd=len(s)-1
        while lastInd>=0:
            if s[lastInd]=='#':
                ans=s[lastInd-2]+s[lastInd-1]
                ans=int(ans)
                print(ans)
                sol=chr(96+ans)+sol
                lastInd-=3
            else:
                ans=int(s[lastInd])
                sol=chr(96+ans)+sol
                lastInd-=1
        return sol

        
    
