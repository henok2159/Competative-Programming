class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        n=0
        sol=''
        while n<len(word1) and n<len(word2):
            sol+=word1[n]+word2[n]
            n+=1
        if n<len(word1):
            sol+=word1[n:]
        else:
            sol+=word2[n:]
        return sol
