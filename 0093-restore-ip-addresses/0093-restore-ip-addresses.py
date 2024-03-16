class Solution:
    def restoreIpAddresses(self, s: str) -> List[str]:
        
        sol=[]
        def dfs(ans,i,j,z):
                                     
            if z==4 and i==len(s):
                sol.append(ans[:-1])
                return
            if j>=len(s):
                
                return
            
            if not (int(s[i:j+1])>255 or j-i>=1 and s[i]=='0'):
                
                if z==3:
            
                    
                    dfs(ans+s[i:j+1]+'.',j+1,len(s),z+1)
                else:
                    
                    dfs(ans+s[i:j+1]+'.',j+1,j+1,z+1)
                    dfs(ans+s[i:j+1]+'.',j+1,j+2,z+1)
                    dfs(ans+s[i:j+1]+'.',j+1,j+3,z+1)
        dfs('',0,0,0)
        dfs('',0,1,0)
        dfs('',0,2,0)
        
        
        print(sol)
        return sol