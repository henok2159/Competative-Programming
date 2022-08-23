/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
            ListNode slow=head;
            ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            
        }
        Stack<Integer>st=new Stack();
        while(slow!=null){
            st.push(slow.val);
            slow=slow.next;
        }
        while(!st.isEmpty()){
            if(st.pop()!=head.val)return false;
            head=head.next;
        }
        return true;
    }
}