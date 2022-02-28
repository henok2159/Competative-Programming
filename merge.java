class Solution {
    public int[][] merge(int[][] intervals) {
       Map<Integer,Integer>mp=new HashMap<Integer,Integer>();
        if(intervals.length<2){
            mp.put(0,-1);
        }else{
        for(int i=0;i<intervals.length-1;i++){
            if(intervals[i][1]>=intervals[i+1][0]){
                mp.put(i,i+1);
                i++;
            }


            else mp.put(i,-1);
        }}
        if(mp.get(intervals.length-2)!=null &&mp.get(intervals.length-2)==-1)mp.put(intervals.length-1,-1);
        int [][] merged=new int[mp.size()][2];
        System.out.println(mp.size());
        int kk=0;
        int index=0;
       while (kk<intervals.length){
           if(mp.get(kk)!=null&&mp.get(kk)!=-1){
               merged[index][0]=intervals[kk][0];
               merged[index][1]=intervals[kk+1][1];
               kk=kk+2;
           }
           else{
               merged[index]=intervals[kk];
               kk++;
           }
           index++;
       }
       return merged;
}
    }
