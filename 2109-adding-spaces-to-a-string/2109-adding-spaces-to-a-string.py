class Solution:
    def addSpaces(self, s: str, spaces: List[int]) -> str:
        
        word=""
        ss=set(spaces)
        i=0
        j=0
        while j<len(s):
            
            if j in ss:
                word+=" "
               
            
            word+=s[i]
            i+=1
                
            j+=1
        return word
        