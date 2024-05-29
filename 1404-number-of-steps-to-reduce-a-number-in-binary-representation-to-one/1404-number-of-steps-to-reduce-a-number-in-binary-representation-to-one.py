class Solution:
    def numSteps(self, s: str) -> int:
        
        step=0
        carry=0
        for i in range(len(s)-1,0,-1):
            
            if s[i]=='0':
                
                if carry:
                    step+=2
                else:
                    step+=1
            else:
                if carry:
                    step+=1
                else:
                    step+=2
                    carry=1
        return step+carry
        