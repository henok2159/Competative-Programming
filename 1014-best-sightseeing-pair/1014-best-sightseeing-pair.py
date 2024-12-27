class Solution:
    def maxScoreSightseeingPair(self, values: List[int]) -> int:
        mx=-111111
        left_max=[values[0]]
        for i in range(1,len(values)):
            left_max.append(max(left_max[i-1],values[i]+i))
        
        for i in range(1,len(values)):
            
            mx=max(values[i]-i+left_max[i-1],mx)
        return mx
            
            
            
        
        
            
            
        