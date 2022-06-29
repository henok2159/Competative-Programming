class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        PriorityQueue<Integer>pq=new PriorityQueue(Collections.reverseOrder());
        for(int num:stones){
            pq.add(num);
        }
        
        while(pq.size()>1){
            int a=pq.remove();
            int b=pq.remove();
            if(a!=b){
                int c=Math.abs(a-b);
                pq.add(c);
            }
        }
        if(pq.size()==1)return pq.remove();
        return 0;
    }
}
