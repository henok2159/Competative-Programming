class MyLinkedList {
   Node head;
    public MyLinkedList() {
        head=null;
    }
    
    public int get(int index) {
        
        int count=1;
        Node curr=head;
        while(count<=index){
            if(curr.next!=null){
                curr=curr.next;
                count++;
            }
            else return -1;
        }
        if(curr!=null) return curr.val;
        return -1;
    }
    
    public void addAtHead(int val) {
        if(head==null)head=new Node(val,null);
        else{
        Node curr=head;
        head=new Node(val,curr);}
    }
    
    public void addAtTail(int val) {
        if(head==null)head=new Node(val,null);
        else{
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=new Node(val,null);}
        
    }
    
    public void addAtIndex(int index, int val) {
        
        int count=1;
        Node curr=head;
        while(count<index){
            if(curr.next!=null){
                curr=curr.next;
                count++;
            }
            else return;
    }
        if(index==0)addAtHead(val);
        else if(curr!=null)
     curr.next=new Node(val,curr.next);
        
        
    }
    
    public void deleteAtIndex(int index) {
        int count=1;
        Node curr=head;
        while(count<index){
            if(curr.next!=null){
                curr=curr.next;
                count++;
            }
            else return;
            
    }if(index==0)head=head.next;
        else if(curr.next!=null) curr.next=curr.next.next;
        
    }
}
class Node{
    Node next;
    int val;
    Node(int val,Node next){
        this.val=val;
        this.next=next;
    }
}
