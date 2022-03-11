class Solution {
    public ListNode middleNode(ListNode head) {
        int count=1;
        ListNode cc=head;
        while(cc.next!=null){
            cc=cc.next;
            count++;
        }
        System.out.print(count);
        int mid=(int)Math.ceil(count/2);
        for(int i=0;i<mid;i++){
         head=head.next;
        }
        return head;
    }
}
//another option using two pointer techinique

class Solution {
    public ListNode middleNode(ListNode head) {
        
        ListNode fast=head;
        ListNode slow =head;
        while(fast!=null&&fast.next!=null){
         fast=fast.next.next;
            slow=slow.next;
            
        }
        
        return slow;
    }
}
