class Solution:
    def kthSmallestPrimeFraction(self, arr: List[int], k: int) -> List[int]:
        
        hm={}
        for i in range(len(arr)):
            for j in range(i+1,len(arr)):
                
                hm[(arr[i],arr[j])]=arr[i]/arr[j]
        
        
        aaa=list(hm.keys())
        aaa.sort(key=lambda x:hm[x])
        # print(aaa)
        
        return list(aaa[k-1])

        