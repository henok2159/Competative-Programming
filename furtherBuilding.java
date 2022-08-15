class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int count=0;
        for(int i=1;i<heights.length;i++){
         int sub=heights[i]-heights[i-1];
            if(sub>0){
                pq.add(sub);
            }
            if(pq.size()>ladders){
                bricks=bricks-pq.poll();
            }
            if(bricks<0){
                return i-1;
            }
        }
       
        return heights.length-1;
    }
}
