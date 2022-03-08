class MyCircularDeque {

    int max;
    int count=0;
    Node head=null;
    Node tail=null;
    
    public MyCircularDeque(int k) {
       max=k;
    }
    
    public boolean insertFront(int value) {
       if(isFull())return false;
        
        if(isEmpty()){
            head=tail=null;
            head=tail=new Node(value,null,null);
        }
        else{
            head.prev=new Node(value,head,null);
            head=head.prev;
        }
        count++;
        return true;
        
    }
    
    public boolean insertLast(int value) {
       if(isFull())return false;
       
        if(isEmpty()){
             head=tail=null;
            head=tail=new Node(value,null,null);
        }
        else{
            tail.next=new Node(value,null,tail);
            tail=tail.next;
        }
         count++;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty())return false;
        count--;
        head=head.next;
        return true;
    }
    
    public boolean deleteLast() {
      if(isEmpty())return false;
       count--;
        tail=tail.prev;
        return true;
    }
    
    public int getFront() {
       if(isEmpty())return -1;
        return head.num;
    }
    
    public int getRear() {
       if(isEmpty())return -1;
        return tail.num;
    
    
    }
    
    public boolean isEmpty() {
        if(count==0)
            return true;
        
        return false;
    }
    
    public boolean isFull() {
        if(count==max)return true;
        return false;
    }
}
class Node{
    Node next;
    Node prev;
    int num;
    Node(int n,Node ne,Node p){
        num=n;
        next=ne;
        prev=p;
    }
}
