class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        mpp = {}
        for i in nums:
            if i < k:
                return -1
            elif i > k:
                mpp[i] = mpp.get(i, 0) + 1
        return len(mpp)
        