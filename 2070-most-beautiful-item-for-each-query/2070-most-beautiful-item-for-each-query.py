class Solution:
    def maximumBeauty(self, items: List[List[int]], queries: List[int]) -> List[int]:
        items.sort(key=lambda x:x[0])
        mx=0
        hm={}
        for item in items:
            mx=max(mx,item[1])
            hm[item[0]]=mx
        ans=[]
        ls=list(hm.keys())
        for q in queries:
            
            if q in hm.keys():
                ans.append(hm[q])
                continue
            if q < ls[0]:
                ans.append(0)
                continue
            low=0
            high=len(ls)-1
            print(high)
            while low<=high:
                mid=(low+high)//2
                print(mid)
                if ls[mid]>q:
                    high=mid-1
                    
                else:
                    low=mid+1
                    
              
            ans.append(hm[ls[high]])
        return ans
            
            
                