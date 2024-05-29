class Solution:
    def maxConsecutive(self, bottom: int, top: int, special: List[int]) -> int:
        
        
        special.sort()
        mx=0
        for i in range(1,len(special)):
            mx= max(mx,special[i]-special[i-1]-1)
            
        return max(mx,max(special[0]-bottom,top-special[len(special)-1]))