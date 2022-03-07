class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=new ListNode(1);
        ListNode curr=head;
        while(list1!=null&&list2!=null){
            if(list1.val>list2.val){
               
                curr.next=list2;
                  list2=list2.next;  
            }
            else{
                
                curr.next=list1;
                  list1=list1.next;  
            }
            
            curr=curr.next;
            
        }
        if(list1==null&&list2==null) {
            
            return head.next;};
        while(list1==null&&list2!=null){
            
                curr.next=list2;
            
                  list2=list2.next;  
            curr=curr.next;
        }
        while(list2==null&&list1!=null){
            
                curr.next=list1;
             list1=list1.next;              
            curr=curr.next;
        }
        return head.next;
    }
}
