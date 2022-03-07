class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr=head;
        ListNode prev=head;
        while(curr!=null){
            
            
            curr=curr.next;
            if(curr!=null&&prev.val==curr.val){
            prev.next=curr.next;
            }
            else  prev=curr;
           
        }
        return head;
        
    }
}
