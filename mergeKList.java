class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer>pq =new PriorityQueue();
        ListNode head=new ListNode(0);
        ListNode curr=head;
        for(int i=0;i<lists.length;i++){
            while(lists[i]!=null){
                pq.add(lists[i].val);
                lists[i]=lists[i].next;
            }
        }
        while(!pq.isEmpty()){
            curr.next=new ListNode(pq.remove());
            curr=curr.next;
        }
        return head.next;
    }
}
