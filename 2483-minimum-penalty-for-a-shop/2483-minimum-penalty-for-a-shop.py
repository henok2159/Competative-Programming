class Solution:
    def bestClosingTime(self, customers: str) -> int:
        
        close_penality=[0]*(len(customers)+1)
        open_penality=[0]*(len(customers)+1)
        
        for i in range(len(customers)):
            if customers[i]=='N':
                open_penality[i+1]=open_penality[i]+1
            else:
                open_penality[i+1]=open_penality[i]
        
        for i in range(len(customers)-1,-1,-1):
            if customers[i]=='Y':
                close_penality[i]=close_penality[i+1]+1
            else:
                close_penality[i]=close_penality[i+1]
        
        mx=111234567897652345678
        pos=1111111111111111    
        for i in range(len(close_penality)):
            if mx>close_penality[i]+open_penality[i]:
                mx=close_penality[i]+open_penality[i]
                pos=i
        return pos
            
        