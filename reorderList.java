class Solution {
    public void reorderList(ListNode head) {
        Stack<ListNode>st=new Stack();
        Queue<ListNode>qu=new LinkedList();
        ListNode ls=head;
        int count=0;
        while(ls!=null){
            st.push(ls);
            qu.add(ls);
            ls=ls.next;
            count++;
            
        }
        int i=0;
        while(i<count/2){
               st.peek().next=qu.peek().next;
               qu.remove().next=st.pop();
         i++;
        }
       qu.remove().next=null;
       
    }
}
