# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeZeroSumSublists(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        slow=head
        fast=head
        prev=None
        while slow:
            fast=slow
            tot=0
            
            while fast:
                tot+=fast.val
                if tot==0:
                  
                    if not prev:
                        head=fast.next
                    else:
                        prev.next=fast.next
                fast=fast.next
            prev=slow
            slow=slow.next
        return head
                    
                        
        