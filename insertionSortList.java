public ListNode insertionSortList(ListNode head) {
        ListNode current=head;
        List<Integer> list=new ArrayList<>();
        while(current!=null){
            list.add(current.val);
            current=current.next;
        }
        Collections.sort(list);
        ListNode c2=head;
        int i=0;
        while(c2!=null&&i<list.size()){
            c2.val=list.get(i);
            c2=c2.next;
            i++;
        }
        return head;
    }

