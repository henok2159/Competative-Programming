# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        count=[]
        def dfs(root):
            nonlocal count
            if root:
                dfs(root.left)
                count.append(root.val)
                
                dfs(root.right)
        dfs(root)
        print(count)
        return count[k-1]