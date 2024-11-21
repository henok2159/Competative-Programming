class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i=0
        j=0
        curr=0
        while j<len(nums):
            if nums[i]==nums[j]:
                j+=1
            else:
                if j-i==1:
                    nums[curr]=nums[i]
                    # print(nums[i])
                    curr+=1
                else:
                    nums[curr]=nums[i]
                    nums[curr+1]=nums[i]
                    curr+=2
                i=j
        if j-i==1:
            nums[curr]=nums[i]
            # print(nums[i])
            curr+=1
        else:
            nums[curr]=nums[i]
            nums[curr+1]=nums[i]
            curr+=2
            i=j
        return curr
                
        
        
            
        