class Solution:
    def specialArray(self, nums: List[int]) -> int:
        
        for i in range (1000):
            
            ll=[int(x) for x in nums if x>=i]
            if len(ll)==i:
                return i
        return -1