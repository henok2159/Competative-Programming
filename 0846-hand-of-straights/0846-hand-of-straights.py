class Solution:
    def isNStraightHand(self, hand: List[int], groupSize: int) -> bool:
        
        hm={}
        for num in hand:
            hm[num]=hm.get(num,0)+1
        
        kl=list(hm.keys())
        kl.sort()
        kk=set(kl)
        while kk:
            u=0
            i=0
            while u<groupSize:
                prev=kl[i]
                # print(prev)
                hm[prev]-=1
                u+=1
                i+=1
                if hm[prev]==0:
                    i-=1
                    kk.remove(prev)
                    kl.remove(prev)
                if prev+1 not in kk and u !=groupSize:
                    # print(hm)
                    # print(kl)
                    # print(prev+1)
                    return False
        print(hm)
        return True
                
        
        
        
        
        