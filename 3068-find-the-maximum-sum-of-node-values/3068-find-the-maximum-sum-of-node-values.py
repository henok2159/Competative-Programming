class Solution:
    def maximumValueSum(self, nums: List[int], k: int, edges: List[List[int]]) -> int:
        changes = 0
        min_sacrifice = inf
        final = 0

        for val in nums:
            tmp = val ^ k
            if tmp > val:
                changes += 1
                final += tmp
                # cost of not changing this node
                min_sacrifice = min(min_sacrifice, tmp - val)
            else:
                final += val
                # cost of changing this node
                min_sacrifice = min(min_sacrifice, val - tmp)

        # if the number of changes is odd, smallest sacrifice from the sum to make it even
        if changes % 2:
            final -= min_sacrifice

        return final

        
        