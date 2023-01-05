class Solution:
    def partitionLabels(self, s: str) -> List[int]:
        rep={}
        start=[0,0]
        for i in range(len(s)):
            if rep.get(s[i])==None:
                rep[s[i]]=[i,i]
            else:
                val=rep.get(s[i])
                val[1]=i
                rep[s[i]]=val
                
        sol=[]
        lastEnd=0
        for val in rep:
            ls=rep[val]
            start=ls[0]
            end=ls[1]
            if start<lastEnd:
                continue
            else:
                for v in rep:
                    ll=rep[v]
                    start2=ll[0]
                    end2=ll[1]
                    if start2>start and start2<end:
                        end=max(end,end2)
                        lastEnd=max(end,lastEnd)
                sol.append(end-start+1)
    
        return sol
            

     

        
        
