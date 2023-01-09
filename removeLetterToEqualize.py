class Solution:
    def equalFrequency(self, word: str) -> bool:
        a=[0]*26
        for i in word:
            a[ord(i)-97]+=1
        for i in range(26):
            if a[i]>0:
                a[i]-=1
                b=set(a)
                b.discard(0)
                if len(b)==1:
                    break
                else:
                    a[i]+=1
        if len(b)==1:
            return True
        return False
