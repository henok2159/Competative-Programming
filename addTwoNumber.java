class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int reminder=0;
        int ans;
        ListNode head=new ListNode(1);
        ListNode curr=head;
        while(l1!=null&&l2!=null){
           ans=l1.val+l2.val+reminder;
            reminder=0;
            l1=l1.next;
            l2=l2.next;
            if(ans>9){
                ans=ans-10;
                reminder=1;
            }
            
            curr.next=new ListNode(ans);
            
            curr=curr.next;
        }
          while(l1==null&&l2!=null){
            ans=l2.val+reminder;
            reminder=0;
            
            l2=l2.next;
            if(ans>9){
                ans=ans-10;
                reminder=1;
            }
            
            curr.next=new ListNode(ans);
            
            curr=curr.next;
            
        }
        while(l2==null&&l1!=null){
           ans=l1.val+reminder;
            reminder=0;
            l1=l1.next;
            if(ans>9){
                ans=ans-10;
                reminder=1;
            }
            
            curr.next=new ListNode(ans);
            
            curr=curr.next;
            
        }
        if(reminder==1){
            curr.next=new ListNode(1);
        }
        return head.next;
    }
    
}
