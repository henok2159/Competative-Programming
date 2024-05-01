class Solution:
    def leastInterval(self, tasks: List[str], n: int) -> int:
        
        heap=[]
        
        hm={}
        
        for task in tasks:
            hm[task]=hm.get(task,0)+1
        
        for kk in hm.keys():
            heappush(heap,-hm[kk])
        count=0
        rem=[]
        while heap:
            k=n
            
            while k>=0:
                
                if heap:
                    a=-1*heappop(heap)
                    print(a)
                    if a>1:
                        rem.append(a-1)
                k-=1
                count+=1
                if not rem:
                    break
            while rem:
                heappush(heap,-rem.pop())
        return count
                
        