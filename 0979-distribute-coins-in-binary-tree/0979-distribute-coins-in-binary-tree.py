# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def distributeCoins(self, root):
        def dfs(node):
            if not node: return 0
            left, right = dfs(node.left), dfs(node.right)
            self.moves += abs(left) + abs(right)
            return node.val + left + right - 1
        
        self.moves = 0
        dfs(root)
        return self.moves
        