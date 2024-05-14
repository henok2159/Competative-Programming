class Solution:
    def stringMatching(self, words: List[str]) -> List[str]:
        words.sort(key=lambda x:len(x))
        sol=[]
        print(words)
        for i in range(len(words)):
            for j in range(i+1,len(words)):
                
                left=0
                right=len(words[i])
                while right<=len(words[j]):
                    # print(words[j][left:right])
                    if words[i]==words[j][left:right]:
                        print(words[i])
                        sol.append(words[i])
                        # continue
                    right+=1
                    left+=1
        return list(set(sol))
                
        