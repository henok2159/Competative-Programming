# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def doubleIt(self, head: Optional[ListNode]) -> Optional[ListNode]:
#         reverse the linked list
        curr=head
        prev=None
        while curr and curr.next :
            t=curr.next
            curr.next=prev
            prev=curr
            curr=t
        curr.next=prev
        ncurr =curr
        pp=curr
        rem=0
        while ncurr:
            tot=ncurr.val+ncurr.val+rem
            if tot>=10:
                rem=1
                tot=tot-10
            else:
                rem=0
            ncurr.val=tot
            pp=ncurr
            ncurr=ncurr.next
        if rem==1:
            pp.next=ListNode(1,None)
            
        tcurr=curr
        zprev=None
        while tcurr and tcurr.next :
            t=tcurr.next
            tcurr.next=zprev
            zprev=tcurr
            tcurr=t
        tcurr.next=zprev
        return tcurr
            
        
    
    
        