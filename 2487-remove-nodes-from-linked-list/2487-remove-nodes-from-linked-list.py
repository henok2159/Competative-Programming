# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        st=[]
        curr=head
        while curr:
            if not st:
                st.append(curr)
            else:
                # print('melat')
                while st and st[-1].val<curr.val:
                    # print('henok')
                    st.pop()
                
                
                if st:
                    st[-1].next=curr
                if not st:
                    # print('selam')
                    head=curr
                st.append(curr)
            curr=curr.next
        return head