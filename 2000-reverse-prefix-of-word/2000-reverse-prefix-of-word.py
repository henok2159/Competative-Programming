class Solution:
    def reversePrefix(self, word: str, ch: str) -> str:
        word=list(word)
        for i in range(len(word)):
            if word[i]==ch:
                
                l=0
                r=i
                while(l<r):
                    word[l],word[r]=word[r],word[l]
                    l+=1
                    r-=1
                break
        return ''.join(word)
        