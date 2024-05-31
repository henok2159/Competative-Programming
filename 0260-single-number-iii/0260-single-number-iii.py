class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        ss=set()
        for num in nums:
            if num not in ss:
                ss.add(num)
            else:
                ss.remove(num)
        return list(ss)
        