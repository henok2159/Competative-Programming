class Solution:
    def splitString(self, s: str) -> bool:
        henok=False
        def backtrack(i,prev):
            # print(prev)
            
            if i==len(s):
                nonlocal henok
                henok=True
                return
            
            
            for j in range(i,len(s)):
                
                
                if int(s[i:j+1])-prev==-1 or (prev==-1 and j!=len(s)-1):
                
                    backtrack(j+1,int(s[i:j+1]))
                    
        
        backtrack(0,-1)
        return henok

        