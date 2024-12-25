# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def largestValues(self, root: Optional[TreeNode]) -> List[int]:
        queue=deque()
        if root:
            queue.append(root)
        max_sol=[]
        while queue:
            ln=len(queue)
            mx=queue[0].val
            
            for _ in range(ln):
                value=queue.popleft()
                mx=max(mx,value.val)
                if value.left:
                    queue.append(value.left)
                if value.right:
                    queue.append(value.right)
            max_sol.append(mx)
        return max_sol
                
        
        
        