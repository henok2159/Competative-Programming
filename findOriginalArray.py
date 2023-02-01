class Solution:
    def findOriginalArray(self, changed: List[int]) -> List[int]:
        changed.sort()
        hm={}
        for num in changed:
            hm[num]=hm.get(num,0)+1
        sol=[]
        doubleN=set()
        doubleN.add(0)
        if len(changed)<2:
            return []
        zero=hm.get(0)
        if zero!=None and zero%2==0:
            for i in range(int(zero/2)):
                sol.append(0)
        elif zero!=None and zero%2!=0:
            return []
        for key in hm.keys():
            d=2*key
            if key in doubleN:
                continue
            else:
                if hm.get(d)==None or hm.get(d)<hm.get(key):
                    return []
                elif hm[d]==hm[key]:
                    z=hm[key]
                    while z>0:
                        z-=1
                        sol.append(key)
                    doubleN.add(d)
                else:
                    z=hm[key]
                    while z>0:
                        z-=1
                        sol.append(key)
                    hm[d]=hm[d]-hm[key]
        return sol
