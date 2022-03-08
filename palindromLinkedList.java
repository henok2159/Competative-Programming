class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer>stack=new Stack();
        Queue<Integer>queue=new ArrayDeque();
        while(head!=null){
         stack.push(head.val);
         queue.add(head.val);
            head=head.next;
        }
        while(!stack.empty()){
            if(stack.pop()!=queue.remove())return false;
            
                
        }
        return true;
    }
}
