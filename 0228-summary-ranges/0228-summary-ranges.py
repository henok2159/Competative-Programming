class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        i=0
        j=0
        sol=[]
        if len(nums)==0:
            return sol
        while j<len(nums)-1:
            if nums[j+1]-nums[j]==1:
                j+=1
            else:
                if j-i==0:
                    sol.append(str(nums[i]))
                else:
                    sol.append(str(nums[i])+"->"+str(nums[j]))
                
                j+=1
                i=j
        if j-i==0:
            sol.append(str(nums[i]))
        else:
            sol.append(str(nums[i])+"->"+str(nums[j])) 
        
        return sol
            
        
        