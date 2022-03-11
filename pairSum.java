class Solution {
    public int pairSum(ListNode head) {
        int sum=0;
        Stack<Integer> stack=new Stack();
        ListNode curr=head;
        while(curr!=null){
            stack.push(curr.val);
            curr=curr.next;
            }
        int temp=0;
        while(!stack.empty()&&head!=null){
            temp=stack.pop()+head.val;
            if(sum<temp)sum=temp;
            head=head.next;
        }
        return sum;
    }
}
