class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        slow=0;
        for fast in t:
            if slow==len(s):
                return True
            if s[slow]==fast:
                slow+=1
         
            
        return slow==len(s)
