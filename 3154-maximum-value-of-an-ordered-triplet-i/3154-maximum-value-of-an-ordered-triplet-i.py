class Solution:
    def maximumTripletValue(self, nums: List[int]) -> int:
        mx=0
        arr=[0]*len(nums)
        arr[len(nums)-1]=nums[len(nums)-1]
        for i in reversed(range(len(nums)-1)):
            
            arr[i]=max(arr[i+1],nums[i])
        
        mxNum=0
        
        for i in range(len(nums)-1):
            if mxNum<nums[i]:
                mxNum=nums[i]
            else:
                mx=max(mx,(mxNum-nums[i])*arr[i+1])
                # print('mx: ' +str(mxNum))
                # print('arr:' +str(arr[i]))
                # print('num:' +str(nums[i]))
        return mx

        