class Solution:
    def partitionLabels(self, s: str) -> List[int]:
        hm={}
        for i in range(len(s)):
            hm[s[i]]=i
        
        i=0
        arr=[]
        # print(hm)
        while i<len(s):
    
            j=i
            mx=hm[s[i]]
            while j<=mx:
                mx=max(mx,hm[s[j]])
                j+=1

            arr.append(mx-i+1)
            i=mx+1
        return arr



        