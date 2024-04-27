class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        ss=set(nums)
        mx=0
        count=0
        for num in nums:
            if num not in ss:
                continue
            if num-1 in ss:
                count=0
                continue
            else:
                count=1
                while num+1 in ss:
                    ss.remove(num)
                    count+=1
                    num=num+1
                mx=max(count,mx)
        return mx
                