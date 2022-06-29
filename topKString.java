class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        Map<String,Integer> hm=new HashMap();
        Queue<Map.Entry<String,Integer>>pq=new PriorityQueue<>(
            (b,a)->{if(a.getValue()-b.getValue()==0){
               return b.getKey().compareTo(a.getKey());
            }
             else{
                 return a.getValue()-b.getValue();
             }      
                   });
        for(String word:words){
            hm.put(word,hm.getOrDefault(word,0)+1);
        }
       
        for(Map.Entry<String,Integer>e:hm.entrySet()){
            pq.add(e);
        }
        
         ArrayList<String>a=new ArrayList<>();
        for(int i=0;i<k;i++){
            a.add(pq.poll().getKey());
        }
        return a;
    }
   
}
