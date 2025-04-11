class Solution:
    def countSymmetricIntegers(self, low: int, high: int) -> int:
        count=0
        def calcSum(s):
            ss=0
            for c in s:
                ss+=int(c)
            return ss

        for i in range(low,high+1,1):
            if len(str(i))%2==0:
                word1=str(i)[:(len(str(i))//2)]
                word2=str(i)[(len(str(i))//2):]
                if calcSum(word1)==calcSum(word2):
                    count+=1
        return count
        