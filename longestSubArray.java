class Solution {
    public int longestSubarray(int[] nums, int limit) {
         Queue<Integer>queue=new ArrayDeque<>();
        PriorityQueue<Integer>pqMin=new PriorityQueue<>();
        PriorityQueue<Integer>pqMax=new PriorityQueue<>(Collections.reverseOrder());
        int max=0;int i=0;
        for(int num:nums){
            queue.add(num);
            i++;
            while(!pqMax.isEmpty()&& Math.abs(pqMax.peek()-num)>limit){
                while(!queue.isEmpty()&&queue.peek()!=pqMax.peek()){
                    i--;
              int n= queue.remove();
               pqMax.remove(n);
                    pqMin.remove(n);
                }
                queue.remove();
                    i--;
                pqMin.remove( pqMax.remove());
            }
            while(!pqMin.isEmpty()&&Math.abs(pqMin.peek()-num)>limit){

                while(!queue.isEmpty()&&queue.peek()!=pqMin.peek()){
                    i--;
                    int n=queue.remove() ;
                    pqMax.remove(n);
                    pqMin.remove(n);
                }
                queue.remove();
                    i--;
                pqMax.remove(pqMin.remove());
            }
            pqMin.add(num);
            pqMax.add(num);
            if(max<i){
                max=i;
            }
        }
        return max;

        
    }
}
