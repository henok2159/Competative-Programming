class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode curr=head;
        while(curr!=null){
           if(curr.next!=null){ 
            int temp=curr.val;
                curr.val=curr.next.val;
            curr.next.val=temp;}
            curr=curr.next;
            if(curr!=null)curr=curr.next;
        }
       return head; 
    }
}
