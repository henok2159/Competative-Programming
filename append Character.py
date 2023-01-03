class Solution:
    def appendCharacters(self, s: str, t: str) -> int:
        slow=0
        for fast in s:
            if slow==len(t):
                return 0

            if t[slow]==fast:
                slow+=1
        return len(t)-slow
