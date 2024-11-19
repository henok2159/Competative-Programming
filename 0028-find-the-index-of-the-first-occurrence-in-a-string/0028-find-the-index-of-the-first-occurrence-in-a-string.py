class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        
        i=0
        j=0
        # if haystack==needle:
        #     return 0
        while j<=len(haystack):
            if j-i==len(needle):
                
                if haystack[i:j]==needle:
                    return i
                i+=1
            j+=1
        return -1
        