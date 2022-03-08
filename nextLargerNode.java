class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ListNode curr=head;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        int [] arr=new int[count];
        Stack<Integer> stack=new Stack();
        Stack<Integer>ind=new Stack();
        int index=0;
        curr=head;
        while(curr!=null){
            
            while(!stack.empty()&&stack.peek()<curr.val){
                stack.pop();
              arr[ind.pop()]=curr.val;
                
                
            }
            stack.push(curr.val);
            ind.push(index);
            index++;
            curr=curr.next;
        }
        return arr;
       
    }
}
