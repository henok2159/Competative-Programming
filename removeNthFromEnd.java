class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr=head;
        ListNode prev=head;;
        int count=0;
        
        while(curr!=null){
         count++;
             curr=curr.next;
        }
        curr=head;
        if(count==1){
            head=null;
            return head;
        }

       int c=0;
        while(curr!=null){
            if(count-n==0){
                head=head.next;
                return head;
            }
             prev=curr;
            curr=curr.next;
           c++;
            if(c==count-n){
                prev.next=curr.next;
            }
          
           
        }
     return head;   
    }
}
