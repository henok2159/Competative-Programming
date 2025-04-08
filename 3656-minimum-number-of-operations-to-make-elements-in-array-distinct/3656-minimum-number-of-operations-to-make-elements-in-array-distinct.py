class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        ss=set()
        for i in reversed(range(len(nums))):
            if nums[i] not in ss:
                ss.add(nums[i])
            else:
                return math.ceil(((i+1)/3))
        return 0
        