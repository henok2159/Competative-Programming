class Solution:
    def repeatedNTimes(self, nums: List[int]) -> int:
        ss=set()
        for num in nums:
            if num in ss:
                return num
            ss.add(num)

        