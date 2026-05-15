class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        lng=len(strs[0])
        for i in range(1,len(strs),1):
            lng=min(lng,len(strs[i]))
            for j in range(min(lng,len(strs[i]))):
                if strs[0][j]!=strs[i][j]:
                    lng=j
                    break
        return strs[0][0:lng]


        