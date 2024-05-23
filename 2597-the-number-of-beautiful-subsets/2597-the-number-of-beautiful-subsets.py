class Solution:
    def beautifulSubsets(self, nums: List[int], k: int) -> int:
        def backtrack(i, cur): return (1 if cur else 0) + sum(backtrack(i+1, cur | {nums[i]}) for i in range(i, len(nums)) if all(abs(nums[i] - x) != k for x in cur))
        return backtrack(0, set())
