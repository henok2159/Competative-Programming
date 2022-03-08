static boolean hasCycle(SinglyLinkedListNode head) {
        ArrayList<SinglyLinkedListNode> a=new ArrayList<>();
    SinglyLinkedListNode curr=head;
    while(curr!=null){
        if(a.contains(curr)){
            return true;
            
        }
        else a.add(curr);
        curr=curr.next;
    }
    return false;
    }
