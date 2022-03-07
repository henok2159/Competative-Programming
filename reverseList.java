class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode n=head;
        ListNode prev=null;
        ListNode c;
        while(head!=null){
          
            n=head.next;
            head.next=prev;
            prev=head;
            head=n;
        }
        
    return prev;
    }
    
}
