class Solution:
    def maximumSubarraySum(self, nums: List[int], k: int) -> int:
        ss=set()
        i=0
        j=0
        total=0
        maxTot=0
        while j<len(nums):
            if nums[j] not in ss:
                total+=nums[j]
                ss.add(nums[j])
                if j-i==k-1:
                    # print(ss)
                    maxTot=max(maxTot,total)
                    total-=nums[i]
                    ss.remove(nums[i])
                    i+=1
                j+=1
            else:
                ss.remove(nums[i])
                total-=nums[i]
                i+=1
        return maxTot
                
                
                    
                    
        