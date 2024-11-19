class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        arr=[]
        count=k
        while count>0:
            arr.append(nums[(len(nums)-count)%len(nums)])
            count-=1
        
        for i in range(len(nums)-1,k-1,-1):
            # print(str(nums[i+k])+ "  "+str(nums[i]))
            nums[i]=nums[i-k]
            
        for i in range(len(arr)):
            nums[i%len(nums)]=arr[i]
            
        