class Solution {
    public ListNode deleteDuplicates(ListNode head) {
    if(head==null||head.next==null)return head;
        ListNode prev=null;
        ListNode node=head;
        while(head!=null){
            if(head.next!=null&&head.val==head.next.val){
             while(head.next!=null&&head.val==head.next.val){
                 head=head.next;
             }
                if(prev==null){
                    node=head.next;
                }else{prev.next=head.next;}
                head=head.next;
                
            }
            else{
                prev=head;
                head=head.next;
            }
        }
        return node;
    }
}
