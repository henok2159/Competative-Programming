class Solution {
    public int minSetSize(int[] arr) {
       HashMap<Integer,Integer>hm=new HashMap();
        PriorityQueue<Integer>pq=new PriorityQueue(Collections.reverseOrder());
        int n=arr.length;
        for(int num:arr){
        
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
    for(Map.Entry<Integer,Integer>m:hm.entrySet()){
        pq.add(m.getValue());
    }
      double d=0;
        int count=0;
        while(d<n/2){
            count++;
            d+=pq.remove();
            
        }
        return count;
    }
}