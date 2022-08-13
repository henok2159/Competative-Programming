class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
       PriorityQueue<Integer>pq=new PriorityQueue();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                pq.add(matrix[i][j]);
            }
        }
        for(int i=0;i<k-1;i++){
            pq.poll();
        }
      return  pq.poll();
    }
}
//modified
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int count=0;
        PriorityQueue<Integer>pq=new PriorityQueue(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(count++<k){
                    pq.add(matrix[i][j]);
                }else{
                    pq.add(matrix[i][j]);
                   pq.remove();
                }
            }
        }
        return pq.remove();
    }
}
